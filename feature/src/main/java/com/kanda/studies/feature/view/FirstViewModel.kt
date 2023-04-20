package com.kanda.studies.feature.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.kanda.studies.feature.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(private val repository: Repository) : MoleculeViewModel<Unit, Model>() {

    @Composable
    override fun models(events: Flow<Unit>): Model = CountriesPresenter(repository, events)
}

@Composable
fun CountriesPresenter(repository: Repository, events: Flow<Unit>): Model {
    val country = remember { mutableStateListOf<String>() }
    LaunchedEffect(events) {
        country.clear()
        country.addAll(repository.getCountries().map { it.name.common })
    }
    return Model(
        loading = false,
        countries = country
    )
}

data class Model(
    val loading: Boolean = true,
    val countries: List<String>
)