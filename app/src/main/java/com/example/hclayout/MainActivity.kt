package com.example.hclayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.hclayout.ui.theme.HCLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HCLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.secondary) {

                }
            }
        }
    }
}

@Composable
fun PhotographerCard() {
    Column {
        Text("Alfred Sisley")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HCLayoutTheme {
        PhotographerCard()
    }
}