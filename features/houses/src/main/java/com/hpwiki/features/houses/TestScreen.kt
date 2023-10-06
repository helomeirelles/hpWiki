package com.hpwiki.features.houses

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.hpwiki.data.DataOrException
import com.hpwiki.models.Houses

@Composable
fun TestScreen(viewModel: TestViewModel = hiltViewModel()) {
    val hpData = produceState<DataOrException<Houses, Boolean, Exception>>(
        initialValue = DataOrException(loading = true)
    ) {
        value = viewModel.getHouses()
    }.value

    Text(text = "Test Screen: ${hpData.data?.get(0)?.House}")
    MyFun()
}

@Preview
@Composable
fun MyFun() {
    Button(colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow), modifier = Modifier
        .border(
            width = 1.dp,
            brush = Brush.verticalGradient(listOf(Color.Gray, Color.Gray)),
            shape = CircleShape
        )
        .size(20.dp),
        shape = CircleShape,

        onClick = { /*TODO*/ }) {
        
    }
}