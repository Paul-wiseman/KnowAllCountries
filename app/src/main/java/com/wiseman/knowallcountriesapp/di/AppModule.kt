package com.wiseman.knowallcountriesapp.di

import com.apollographql.apollo3.ApolloClient
import com.wiseman.knowallcountriesapp.data.ApolloCountryClient
import com.wiseman.knowallcountriesapp.domain.client.CountryClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApolloClient(): ApolloClient = ApolloClient
        .Builder()
        .serverUrl("https://countries.trevorblades.com/graphql")
        .build()

    @Provides
    @Singleton
    fun provideCountryClient(
        apolloClient: ApolloClient
    ): CountryClient = ApolloCountryClient(
        apolloClient
    )
}