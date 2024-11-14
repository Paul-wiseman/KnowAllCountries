package com.wiseman.knowallcountriesapp.domain.usecase

import com.wiseman.knowallcountriesapp.domain.client.CountryClient
import com.wiseman.knowallcountriesapp.domain.model.SimpleCountry
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(
    private val countryClient: CountryClient
) {

    suspend fun execute(): List<SimpleCountry> {
        return countryClient
            .getCountries()
            .sortedBy { it.name }
    }
}