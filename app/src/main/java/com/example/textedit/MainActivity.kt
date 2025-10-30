package com.example.textedit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.textedit.ui.theme.TextEditTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextEditTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // ✅ Panggil FormDataDiri di sini
                    FormDataDiri(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Opsional: Preview untuk Android Studio
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FormDataDiriPreview() {
    TextEditTheme {
        FormDataDiri()
    }
}
