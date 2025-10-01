package com.example.cupcakeapp8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp8.ui.theme.CupcakeApp8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CupcakeApp8Theme {
                CupcakeApp8()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CupcakeApp8Theme {
        CupcakeApp8()
    }
}