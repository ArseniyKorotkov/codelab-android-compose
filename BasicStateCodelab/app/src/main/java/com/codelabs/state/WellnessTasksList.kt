package com.codelabs.state

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
    list: List<WellnessTask>,
    onCheckedChange: (WellnessTask, Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { item -> item.id }
        ) { item ->
            WellnessTaskItem(
                taskName = item.label,
                checkedState = item.checked,
                onCheckedChange = { checked -> onCheckedChange(item, checked) },
                onCloseTask = { onCloseTask(item) }
            )
        }
    }
}