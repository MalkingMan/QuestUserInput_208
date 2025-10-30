package com.example.textedit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp


@Composable

fun FormDataDiri(modifier : Modifier
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
                 shape = MaterialTheme.shapes.large,
                 modifier = Modifier.fillMaxWidth(widht = 250.dp),
                 label = {Text(text = "Nama Lengkap")},
                 onValueChange = {
                     textNama = it
                 }

             )
        }

    )

    Row{
        gender.forEach { item ->
            Row(modifier = Modifier.selectable(
                selected = textJK == item,
                onClick = {textJK = item}
            ), verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = textJK == item,
                    onClick = {textJK = item}
                )
        }
            Text(text = item)
        }
    }

    OutlinedTextField(
        value = textAlamat,
        singleLine = true,
        modifier = Modifier.width(width = 250.dp),
        label = {Text(text = "Alamat Lengkap")},
        onValueChange = {
            textAlamat = it
        }
    )

    HorizontalDivider(
        modifier = Modifier.padding(
        buttom = dimensionResource(30dp),
        top = dimensionResource(
            id = R.dimen.padding_medium
        )),
        thickness = dimensionResource(id = R.dimen.divider_tipis)
        color = Color.DarkGray
    )

    Button(
        modifier = Modifier.fillMaxWidth(fraction = if),

        enabled = textAlamat.isNotEmpty(),
        onclick = {
            nama = textNama
            jenis = textJK
            alamat = textAlamat
        }

    ){
    Text(text = stringResource(id = R.string.submit))
    }


    HorizontalDivider(
        modifier = Modifier.padding(
            buttom = dimensionResource(30dp),
            top = dimensionResource(
                id = R.dimen.padding_medium
            )),
        thickness = dimensionResource(1dp),
        color = Color.DarkGray
    )

    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Black),













}

