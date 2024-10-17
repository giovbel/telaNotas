package br.senai.sp.jandira.telahome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telahome.ui.theme.TelaHomeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaHomeTheme {
                telaNotas()
            }
        }
    }
}

@Composable
fun telaNotas() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF213787),
                            Color(0xFF245FB0),
                            Color(0xFF6E96E8)
                        )
                    ),
                )
        ) {
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo2),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                )
                Text(
                    text = "NOTAS",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Medium
                )
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .border(4.dp, Color(0xFF9DBFEF), RoundedCornerShape(30.dp)),
                    shape = RoundedCornerShape(100.dp),
                ) {

                }
            }

        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(630.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFC3D9FF),
                            Color(0xFFC3D9FF),
                            Color(0xFFC3D9FF),
                            Color(0xFFC3D9FF),
                            Color(0xFF9BBAF5),
                            Color(0xFF1B55CD),
                        )
                    ),
                ),
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
        ) {

            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {  },
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color(0xFF213787),
                        modifier = Modifier.size(48.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.7f)
                ) {
                    Card(
                        modifier = Modifier
                            .height(255.dp)
                            .width(276.dp)
                            .align(Alignment.Center)
                            .offset(x = -10.dp)
                                .graphicsLayer {
                                rotationZ = -10f
                            }
                            .border(4.dp, Color(0xFF020075), RoundedCornerShape(20.dp)),
                        shape = RoundedCornerShape(30.dp),
                        colors = CardDefaults.cardColors(Color(0xFFBCDDFF))
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(210.dp)
                                .align(Alignment.End),
                            colors = CardDefaults.cardColors(Color(0xFF90C6FF))
                        ) {
                        }
                    }
                    Card(
                        modifier = Modifier
                            .height(250.dp)
                            .width(280.dp)
                            .align(Alignment.Center)
                            .offset(y = 20.dp,  x = 25.dp)
                            .graphicsLayer {
                                rotationZ = -12f
                            }
                            .border(4.dp, Color(0xFF020075), RoundedCornerShape(20.dp)),
                        shape = RoundedCornerShape(30.dp),
                        colors = CardDefaults.cardColors(Color(0xFFFFFFD2))
                    ) {

                    }
                    Card(
                        modifier = Modifier
                            .height(260.dp)
                            .width(290.dp)
                            .align(Alignment.Center)
                            .offset(y = -15.dp,  x = 10.dp)

                            .border(4.dp, Color(0xFF020075), RoundedCornerShape(20.dp)),
                        shape = RoundedCornerShape(30.dp),
                        colors = CardDefaults.cardColors(Color(0xFFFFFFFF))
                    ) {

                    }

                }


                IconButton(
                    onClick = {  },
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Avançar",
                        tint = Color(0xFF213787),
                        modifier = Modifier.size(48.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.fillMaxWidth().height(20.dp)
            ){
                Button(onClick = {}) {
                    Text("aaqa")
                }
            }
        }

        Box(
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFF213787),
                            Color(0xFF245FB0),
                            Color(0xFF6E96E8)
                        )
                    ),
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .size(72.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.calendarioicon),
                        contentDescription = "",
                        modifier = Modifier.size(60.dp)
                    )

                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .size(72.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.chaticon),
                        contentDescription = "",
                        modifier = Modifier.size(60.dp)
                    )

                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .size(72.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.diarioicon),
                        contentDescription = "",
                        modifier = Modifier.size(60.dp)
                    )

                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .size(72.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.autoajuda),
                        contentDescription = "",
                        modifier = Modifier.size(60.dp)
                    )

                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .size(72.dp)
                        .background(Color.Transparent),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.doacaoicon),
                        contentDescription = "",
                        modifier = Modifier.size(60.dp)
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaHomeTheme {
        telaNotas()
    }
}