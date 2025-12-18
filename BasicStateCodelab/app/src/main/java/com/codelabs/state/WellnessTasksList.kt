package com.codelabs.state

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
    list: List<WellnessTask> = remember { getWellnessTasks() },
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(items = list) {
            WellnessTaskItem(
                taskName = it.label
            )
        }
    }
}