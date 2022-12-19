package com.codelabs.state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, { count++ }, modifier)

//    Column(modifier.padding()) {
//
//        var waterCount by remember { mutableStateOf(0) }
//        var juiceCount by remember { mutableStateOf(0) }
//
//        StatelessCounter(waterCount, { waterCount++ })
//        StatelessCounter(juiceCount, { juiceCount++ })
//    }

}

