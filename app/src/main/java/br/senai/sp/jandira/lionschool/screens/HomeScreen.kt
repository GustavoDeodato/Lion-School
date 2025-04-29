package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color(0xFF9C27B0))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF)),

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .height(200.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)


                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.logo

                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxSize()
                            .padding(5.dp)


                    )
                }
                Column(
                    modifier = Modifier
                        .weight(2f)
                        .padding(5.dp)

                ) {
                    Text(
                        text = stringResource(R.string.Lion),
                        fontSize = 40.sp,
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.SemiBold


                    )
                    Text(
                        text = stringResource(R.string.School),
                        fontSize = 40.sp,
                        color = Color(0xFF3347B0),
                        fontWeight = FontWeight.SemiBold


                    )
                }
            }
            Column (
                modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(150.dp),


                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ){
                    Text(
                        text = stringResource(R.string.Find_your),
                        fontSize = 20.sp,
                        color = Color(0xFF3347B0)
                    )
                Card (
                    modifier = Modifier
                        .width(60.dp)
                        .height(6.dp),
                    shape = RoundedCornerShape(
                            20.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    )

                ){  }

                Text(
                    text = stringResource(R.string.Your_destination),
                    modifier = Modifier
                        .padding(30.dp),
                    fontSize = 16.sp,
                    color = Color(0xFF9E9FA4),
                )


            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF2196F3)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(48.dp)
                        .width(276.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors =
                ){
                        Text(
                            text = stringResource(R.string.Get_Started)
                        )
                }
            }



        }


    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}