package com.example.mvvmnavigation.ui.theme.screens.home

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_BMIcalc
import com.example.mvvmnavigation.navigation.ROUTE_CALCULATOR
import com.example.mvvmnavigation.navigation.ROUTE_HOME
import com.example.mvvmnavigation.navigation.ROUTE_INTENTS
import com.example.mvvmnavigation.navigation.ROUTE_LOGIN
import com.example.mvvmnavigation.navigation.ROUTE_PROFILE
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme
import java.time.format.TextStyle

@Composable
fun HomeScreen(navController: NavController) {


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.mygray))
                .verticalScroll(rememberScrollState()), // Enable scrolling if the content exceeds the screen height
            verticalArrangement = Arrangement.Top,


        ) {
            Image(
                painter = painterResource(id = R.drawable.favologo), contentDescription = "logo",
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(top = 20.dp, start = 20.dp)

            )
            Text(
                text = "Cryptomine",
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 6.dp, bottom = 16.dp, start = 10.dp)
                    .fillMaxWidth()
                    .size(30.dp)
            )

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.mygray)),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card (
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(160.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.mylightgray)
                    )
                ){
                    Image(
                        painter = painterResource(id = R.drawable.pic9), contentDescription = "pic",
                        modifier = Modifier
                            .fillMaxSize()

                    )
                }
            }
            Column{
                Text(
                    text = "Hello there welcome to cryptomine",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp)
                    )
            }
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card(
//                    border = BorderStroke(1.dp, color = colorResource(id = R.color.mytheme)),
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(200.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.mylightgray)
                    )

                ) {
                    Text(
                        text = "Quick account summary",
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                                    color = colorResource(id = R.color.mytheme)
                        )
                    )
                        Text(
                            text = "praisemunene87@gmail.com",
                            fontSize = 17.sp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp),
                            style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                            color = colorResource(id = R.color.white)
                        )
                        )
                    Row {
                        Text(
                            text = "Balance : ",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 15.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = colorResource(id = R.color.white)
                            )
                        )
                        Text(
                            text = "55 USDT",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 15.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            color = Color.Gray
                        )
                        )

                    }
                    Row {
                        Text(
                            text = "Trade profits : ",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 15.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = colorResource(id = R.color.white)
                            )
                        )
                        Text(
                            text = "5 USDT",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 15.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Gray
                            )
                        )

                    }

                    Row {
                        Text(
                            text = "Referral profits : ",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 15.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = colorResource(id = R.color.white)
                            )
                        )
                        Text(
                            text = "30 USDT",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 15.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Gray
                            )
                        )

                    }

                }
                Text(
                    text = "Earn crypto assets with your phone now",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 6.dp)
                )
                Text(
                    text = "All you need is an account",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 10.dp, bottom = 20.dp)
                )
                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(1.dp),

                )
            }



//works to here
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.mygray)),
//                    .border = BorderStroke(1.dp, color = colorResource(id = R.color.mytheme))

            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Card(
                        modifier = Modifier
                            .width(170.dp)
                            .height(100.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mylightgray)
                        )
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_headset_mic_24),
                            contentDescription = "headphones",
                            tint = colorResource(id = R.color.white),
                            modifier = Modifier.padding(top = 10.dp, start = 10.dp)

                        )
                        Text(
                            text = "Help center",
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold ,
                                color = colorResource(id = R.color.white)
                            ),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp, bottom = 6.dp)
                            )
                        Text(
                            text = "Questions/guide/info",
                            color = Color.Gray,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                    Card (
                        modifier = Modifier
                            .width(170.dp)
                            .height(100.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mylightgray)
                        )

                    ){
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_bar_chart_24),
                            contentDescription = "trade",
                            tint = colorResource(id = R.color.white),
                            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                        )
                        Text(
                            text = "Quick trade",
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold ,
                                color = colorResource(id = R.color.white)
                            ),
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp, bottom = 6.dp)
                        )
                        Text(
                            text = "Trade asset with p2p",
                            color = Color.Gray,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
//works to here updated





//            this chunk doesnt work?
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally

                ){

                    Text(
                        text = "LTC/USDT",
                        fontSize = 16.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                            color = colorResource(id = R.color.white)
                        )
                    )
                    Text(
                        text = "74.47",
                        fontSize = 15.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                        )
                    )
                    Text(
                        text = "3.56%",
                        fontSize = 14.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal ,
                        )
                    )
                }





                Column (
                    horizontalAlignment = Alignment.CenterHorizontally

                ){

                    Text(
                        text = "BTC/USDT",
                        fontSize = 16.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                            color = colorResource(id = R.color.white)
                        )
                    )
                    Text(
                        text = "74.47",
                        fontSize = 15.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                        )
                    )
                    Text(
                        text = "3.56%",
                        fontSize = 14.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal ,
                        )
                    )
                }



                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Text(
                        text = "ETH/USDT",
                        fontSize = 16.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                            color = colorResource(id = R.color.white)
                        )
                    )
                    Text(
                        text = "74.47",
                        fontSize = 15.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold ,
                        )
                    )
                    Text(
                        text = "3.56%",
                        fontSize = 14.sp,
                        color = Color.Green,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal ,
                        )
                    )
                }
            }


//works to here currently
            
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(0.9f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp, bottom = 25.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(start = 10.dp)
                        .height(110.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.mylightgray)
                    )
                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.pic3),
//                        contentDescription = "picture",
//                        modifier = Modifier
//                            .fillMaxSize()
//
//                    )
                }
                Column(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = "Get ready to explore the cryptoworld",
                        fontSize = 21.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                    Text(
                        text = "why aren't you invested in crypto yet? join 100,000+ others and earn crypto now",
                        fontSize = 14.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                    Column(
                        horizontalAlignment = Alignment.End
                    ) {


                        Text(
                            text = "Signup/login",
                            fontSize = 14.sp,
                            textAlign = TextAlign.End,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Normal,
                                color = colorResource(id = R.color.mytheme)
                            ),
                            modifier = Modifier.padding(start = 40.dp)
                        )
                    }
                }
            }
        }


//            code above isnt working
           Column (
               modifier = Modifier
                   .height(5.dp)
                   .fillMaxWidth()
                   .background(color = Color.Gray)
                   .padding(top = 20.dp, bottom = 20.dp)

           ){

           }




            Column (){
                Text(
                    text = "Ranking List",
                    modifier = Modifier.padding(start = 10.dp, top = 20.dp, bottom = 20.dp),
                    fontSize = 18.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontWeight = FontWeight.Bold ,
                        color = colorResource(id = R.color.white)
                    )
                )
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Card (
                        modifier = Modifier
                            .height(45.dp)
                            .padding(end = 10.dp)
                            .width(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygreen)
                        )
                    ){
                        Text(
                            text = "Gainers",
                            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold ,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                    Card (
                        modifier = Modifier
                            .height(45.dp)
                            .width(150.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.myred)
                        )
                    ){
                        Text(
                            text = "Loosers",
                            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold ,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Column {

                    Text(
                        text = "pair",
                        fontSize = 13.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                }
                Column {

                    Text(
                        text = "price",
                        fontSize = 13.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                }
                Column {

                    Text(
                        text = "percentage",
                        fontSize = 13.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    )
                }
            }



            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.mygreen)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygreen)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }



            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.myred)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.myred)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }


            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.mygreen)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygreen)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }



            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.mygreen)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygreen)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.myred)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.myred)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }


            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.mygreen)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygreen)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }




            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column {
                    Text(
                        text = "DRC/USDT",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }

                Column {
                    Text(
                        text = "14.28",
                        fontSize = 18.sp,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.myred)
                        )
                    )
                }

                Column (

                ) {
                    Card (
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .width(120.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.myred)
                        )
                    ){


                        Text(
                            text = "+1.93%",
                            modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            style = androidx.compose.ui.text.TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }







            BottomAppBar(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(top = 12.dp)


            ) {
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_HOME)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_home_24),
                        contentDescription = "home"
                    )
//            Icon(imageVector = Icons.Default.home, contentDescription = )
                    Text(
                        text = "Home",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_CALCULATOR)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_currency_exchange_24),
                        contentDescription = "p2p"
                    )
                    Text(
                        text = "p2p",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_BMIcalc)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_post_add_24),
                        contentDescription = "Post ad"
                    )
                    Text(
                        text = "Post ad",
                        modifier = Modifier.padding(top = 40.dp, bottom = 1.dp)
                    )
                }
                IconButton(
                    onClick = {
                        navController.navigate(ROUTE_PROFILE)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                        contentDescription = "profile"
                    )
                    Text(
                        text = "Profile",
                        modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                    )
                }
            }


        }

    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MVVMNavigationTheme {
        HomeScreen(rememberNavController())
    }
}