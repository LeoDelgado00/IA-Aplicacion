package com.example.frenchbooks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrenchBooksTheme {
                MyAppContent()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hola $name!",
        modifier = Modifier
            .fillMaxSize() // Ocupa todo el espacio disponible
            .padding(16.dp)
            .align(Alignment.CenterHorizontally) // Centra horizontalmente el texto
    )
}

@Composable
fun MyAppContent() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Ocupa todo el espacio disponible
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,  // Centra verticalmente el contenido
        horizontalAlignment = Alignment.CenterHorizontally // Centra horizontalmente el contenido
    ) {
        Greeting("FrenchBooks")
        // ... Aquí se agregarán las demás funciones
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FrenchBooksTheme {
        Greeting("Android")
    }
}
