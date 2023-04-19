package com.kanda.studies.feature.view

import androidx.compose.runtime.Composable
import kotlinx.coroutines.flow.Flow

interface MoleculePresenter<Event, Model> {

    @Composable
    fun models(events: Flow<Event>): Model
}