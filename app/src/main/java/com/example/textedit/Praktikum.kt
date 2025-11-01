package com.example.textedit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Praktikum(modifier: Modifier = Modifier) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val listGender = listOf("Laki-laki", "Perempuan")
    val listStatus = listOf("Janda", "Lajang", "Duda")

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFF3C5F8), Color.White)
                )
            ),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFBA68C8))
                    // 1. Ganti padding dengan height() untuk tinggi yang lebih pasti dan besar
                    .height(120.dp), // Coba nilai 120.dp atau sesuaikan
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = "Formulir Pendaftaran",
                    color = Color.White,
                    fontSize = 29.sp,
                    fontWeight = FontWeight.Medium,
                    // 2. Padding pada teks dipertahankan agar ada jarak dari tepi
                    modifier = Modifier.padding(start = 16.dp, bottom = 12.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))


            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .wrapContentHeight()
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 24.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "NAMA LENGKAP", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    OutlinedTextField(
                        value = nama,
                        onValueChange = { nama = it },
                        placeholder = { Text("Isian nama lengkap") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "JENIS KELAMIN", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    listGender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = (jenisKelamin == item),
                                    onClick = { jenisKelamin = item }
                                )
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = (jenisKelamin == item),
                                onClick = { jenisKelamin = item }
                            )
                            Text(text = item)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "STATUS PERKAWINAN", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    listStatus.forEach { item ->
                        Row(
                            modifier = Modifier
                                .selectable(
                                    selected = (status == item),
                                    onClick = { status = item }
                                )
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = (status == item),
                                onClick = { status = item }
                            )
                            Text(text = item)
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))


                    Text(text = "ALAMAT", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    OutlinedTextField(
                        value = alamat,
                        onValueChange = { alamat = it },
                        placeholder = { Text("Alamat") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(30.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF3F51B5)
                        )
                    ) {
                        Text(
                            text = "Submit",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }
}

