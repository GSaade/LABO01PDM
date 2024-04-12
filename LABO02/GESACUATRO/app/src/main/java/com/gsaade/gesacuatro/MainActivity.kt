package com.gsaade.gesacuatro
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaContador()
        }
    }
}

@Composable
fun PruebaContador() {
    val count = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Se ha pulsado el botón ${count.value} veces",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { count.value++ }) {
            Text("Aumentar Contador")
        }
    }
}

@Preview
@Composable
fun PreviewCounter() {
    PruebaContador()
}


//Intenté agregar todo pero fallé, epero cuente algo JAJJAJ