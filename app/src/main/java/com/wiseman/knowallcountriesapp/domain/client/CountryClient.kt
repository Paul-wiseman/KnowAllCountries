package com.wiseman.knowallcountriesapp.domain.client

import com.wiseman.knowallcountriesapp.domain.model.DetailedCountry
import com.wiseman.knowallcountriesapp.domain.model.SimpleCountry

interface CountryClient {
    suspend fun getCountries(): List<SimpleCountry>
    suspend fun getCountry(code: String): DetailedCountry?
}