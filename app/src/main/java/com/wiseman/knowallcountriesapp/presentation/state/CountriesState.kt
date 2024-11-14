package com.wiseman.knowallcountriesapp.presentation.state

import com.wiseman.knowallcountriesapp.domain.model.DetailedCountry
import com.wiseman.knowallcountriesapp.domain.model.SimpleCountry

data class CountriesState(
    val countries: List<SimpleCountry> = emptyList(),
    val isLoading: Boolean = false,
    val selectedCountry: DetailedCountry? = null
)