package com.example.template.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Container(
    content: @Composable () -> Unit = { }
) {
    content()
}