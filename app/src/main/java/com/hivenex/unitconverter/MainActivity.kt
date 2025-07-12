package com.hivenex.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hivenex.unitconverter.ui.theme.UnitConverterTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(WindowInsets.statusBars.asPaddingValues()),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter")
        Spacer(modifier = Modifier.size(128.dp))
        OutlinedTextField(value = "", onValueChange = {})
        Spacer(modifier = Modifier.size(32.dp))
        Row() {

            Box() {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(
                    expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Millimeters")},
                        onClick = {}
                    )
                }
                
            }
            Spacer(modifier = Modifier.size(64.dp))
            Box() {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Arrow Down")
                }
                DropdownMenu(
                    expanded = true, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Millimeters")},
                        onClick = {}
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(32.dp))
        Text("Result:")

    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {
        UnitConverter()
    }
}