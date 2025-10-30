package com.example.textedit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {
    // State untuk menyimpan nilai dari setiap input field
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }

    val listJenisKelamin = listOf("Laki-Laki", "Perempuan")

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp), // Memberi jarak antar elemen
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text(text = "Nama Lengkap") },
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = alamat,
            onValueChange = { alamat = it },
            label = { Text(text = "Alamat") },
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.fillMaxWidth()
        )

        // Bagian untuk pilihan Jenis Kelamin
        Column(Modifier.fillMaxWidth()) {
            Text(text = "Jenis Kelamin:")
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                listJenisKelamin.forEach { item ->
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = (jenisKelamin == item),
                                onClick = { jenisKelamin = item }
                            )
                            .padding(horizontal = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = (jenisKelamin == item),
                            onClick = { jenisKelamin = item }
                        )
                        Text(
                            text = item,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormDataDiriPreview() {
    // Anda bisa mengganti `TextEditTheme` dengan tema aplikasi Anda
    // TextEditTheme {
    FormDataDiri()
    // }
}
