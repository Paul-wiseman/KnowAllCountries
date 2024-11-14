package com.wiseman.knowallcountriesapp.data

import com.apollographql.apollo3.ApolloClient
import com.wiseman.CountriesQuery
import com.wiseman.CountryQuery
import com.wiseman.knowallcountriesapp.data.mapper.toDetailCountry
import com.wiseman.knowallcountriesapp.data.mapper.toSimpleCountry
import com.wiseman.knowallcountriesapp.domain.client.CountryClient
import com.wiseman.knowallcountriesapp.domain.model.DetailedCountry
import com.wiseman.knowallcountriesapp.domain.model.SimpleCountry
import javax.inject.Inject

class ApolloCountryClient @Inject constructor(
    private val apolloClient: ApolloClient
) : CountryClient {
    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map {
                it.toSimpleCountry()
            }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailedCountry? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toDetailCountry()
    }

}