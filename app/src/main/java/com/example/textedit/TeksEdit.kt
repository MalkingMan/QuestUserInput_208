package com.example.textedit

import android.R
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import ....

@Composable

Fun FormDataDiri(modifier : Modifier
){
    var textNama by remember { mutableStateOf(value ="") }
    var textAlamat by remember { mutableStateOf(value="") }
    var textJK by remember { mutableStateOf(value="") } }

    var nama by remember { mutableStateOf(value ="") }
    var alamat by remember { mutableStateOf(value="") }
    var jenis by remember { mutableStateOf(value ="") }

    val gender:List<string> = ListOf("laki-Laki","Perempuan")

    Column(modifier = modifier.padding(top 50,dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally {
             OutlinedTextField(
                 value = textNama,
                 singleLine = true,
             )
        }

    )
}

