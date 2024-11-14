package com.wiseman.knowallcountriesapp.data.mapper

import com.wiseman.CountriesQuery
import com.wiseman.CountryQuery
import com.wiseman.knowallcountriesapp.domain.model.DetailedCountry
import com.wiseman.knowallcountriesapp.domain.model.SimpleCountry

fun CountryQuery.Country.toDetailCountry(): DetailedCountry {
    return DetailedCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No Capital",
        currency = currency ?: "No Currency",
        languages = languages.map { it.name },
        continent = continent.name

    )
}

fun CountriesQuery.Country.toSimpleCountry(): SimpleCountry {
    return SimpleCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No Capital",
    )
}