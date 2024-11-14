package com.wiseman.knowallcountriesapp.domain.usecase

import com.wiseman.knowallcountriesapp.domain.client.CountryClient
import com.wiseman.knowallcountriesapp.domain.model.DetailedCountry
import javax.inject.Inject

class GetCountryUseCase @Inject constructor(
    private val countryClient: CountryClient
) {

    suspend fun execute(code: String): DetailedCountry? {
        return countryClient
            .getCountry(code)
    }
}