# Project Overview
- This Android application displays all countries and their capitals, 
- Clicking on any of the Country displays more details like the continent, currency and language(s)

## Key Technologies:

- Apollo GraphQL: A powerful GraphQL client for Android to fetch data from a GraphQL API.
- Jetpack Compose: A modern UI toolkit for building native Android UI.
- Hilt: A dependency injection framework for Android that reduces boilerplate code and improves testability.

```sh
app/
├── build.gradle.kts
├── src/
│   ├── androidTest/
│   │   └── java/
│   ├── main/
│   │   ├── AndroidManifest.xml
│   │   ├── java/
│   │   │   ├── com/wiseman/knowallcountriesapp/
│   │   │   │   ├── data/
│   │   │   │   │   ├── apollo/
│   │   │   │   │   │   └── com/graphql/schema.graphqls
│   │   │   │   ├── domain/
│   │   │   │   ├── presentation/
│   │   │   │   │   └── ui/
│   │   │   │       └── CountryListScreen.kt
│   │   │   ├── di/
│   │   │   │   └── AppModule.kt
│   │   ├── res/
│   │   ├── ...
```
