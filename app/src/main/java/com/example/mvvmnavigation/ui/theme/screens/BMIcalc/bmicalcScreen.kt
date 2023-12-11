package com.example.mvvmnavigation.ui.theme.screens.BMIcalc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.shape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_BMIcalc
import com.example.mvvmnavigation.navigation.ROUTE_CALCULATOR
import com.example.mvvmnavigation.navigation.ROUTE_HOME
import com.example.mvvmnavigation.navigation.ROUTE_INTENTS
import com.example.mvvmnavigation.navigation.ROUTE_PROFILE
import com.example.mvvmnavigation.navigation.ROUTE_SELLPOSTAD
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BmiScreen(navController: NavController){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.mygray))
            .verticalScroll(rememberScrollState()), // Enable scrolling if the content exceeds the screen height
        verticalArrangement = Arrangement.Top,

    ) {

        @Composable
        fun textbold(boldtext:String){
            Text(
                text = "$boldtext",
                fontSize = 17.sp,
                modifier = Modifier
                    .padding(start = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white)
                )
            )
        }
        @Composable
        fun bigboldertext(textbigbolder:String){
            Text(
                text = "$textbigbolder",
                fontSize = 22.sp,
                modifier = Modifier.padding(top = 17.dp),
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white)
                )
            )
        }

        @Composable
        fun graytext(textgray:String){
            Text(
                text = "$textgray",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = Color.Gray
                )
            )
        }
        @Composable
        fun normalwhitetext(whitenormaltext:String){
            Text(
                text = "$whitenormaltext",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = colorResource(id = R.color.white)
                )
            )
        }





        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            bigboldertext("Post Ad")
            Column (
               modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ){
                graytext("Hint:Don't forget the name on the mpesa message")
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .height(700.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.dimlightgray)
                ),


            ){
               Row (
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(top = 15.dp),
                   horizontalArrangement = Arrangement.SpaceEvenly
               ){
                   Button(onClick = {
                       navController.navigate(ROUTE_BMIcalc)
                   },
                       colors = ButtonDefaults.buttonColors(
                           containerColor = colorResource(id = R.color.mytheme)
                       ),
                       shape = RoundedCornerShape(13.dp),
                       modifier = Modifier.width(160.dp)

                       ) {
                    Text(
                        text = "Buy",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 5.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            color = colorResource(id = R.color.white)
                        )
                    )
                   }
                   Button(onClick = {
                       navController.navigate(ROUTE_SELLPOSTAD)
                   },
                       colors = ButtonDefaults.buttonColors(
                           containerColor = colorResource(id = R.color.mylightgray)
                       ),
                       shape = RoundedCornerShape(13.dp)
                       ,
                       modifier = Modifier.width(160.dp)

                       ) {
                       Text(
                           text = "Sell",
                           fontSize = 15.sp,
                           modifier = Modifier
                               .padding(start = 10.dp, top = 5.dp),
                           style = androidx.compose.ui.text.TextStyle(
                               color = colorResource(id = R.color.white)
                           )
                       )
                   }
               }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column (
                        modifier = Modifier.width(160.dp)
                    ){
                        graytext("Assets")
                        Button(onClick = {

                        },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.mylightgray)
                            ),
                            shape = RoundedCornerShape(13.dp),
                            modifier = Modifier.width(160.dp)

                        ) {
                            Text(
                                text = "USDT",
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp),
                                style = androidx.compose.ui.text.TextStyle(
                                    color = colorResource(id = R.color.white)
                                )
                            )
                        }


                    }
                    Column (
                        modifier = Modifier.width(160.dp)
                    ){
                        graytext("With fiat")
                        Button(onClick = {

                        },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorResource(id = R.color.mylightgray)
                            ),
                            shape = RoundedCornerShape(13.dp),
                            modifier = Modifier.width(160.dp)

                        ) {
                            Text(
                                text = "KES",
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp),
                                style = androidx.compose.ui.text.TextStyle(
                                    color = colorResource(id = R.color.white)
                                )
                            )
                        }


                    }
                }

                Row {
                    graytext("Balance :")
                    normalwhitetext("55 USDT")
                }
                graytext("Price range")
                normalwhitetext("136.96 - 140.11")
                graytext("Your price")
                var price by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = price,
                    onValueChange = {price = it},
//                    label = { Text(text = "Password")},
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(top = 13.dp)
                        .background(color = colorResource(id = R.color.mygray)),
                    shape = RoundedCornerShape(15.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = colorResource(id = R.color.mylightgray),
                        textColor = colorResource(id = R.color.white),
                        cursorColor = colorResource(id = R.color.white)

                    )

                )



                graytext("Amount Affordable")
                var amountaffordable by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = amountaffordable,
                    onValueChange = {amountaffordable = it},
//                    label = { Text(text = "Password")},
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(top = 13.dp)
                        .background(color = colorResource(id = R.color.mygray)),
                    shape = RoundedCornerShape(15.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = colorResource(id = R.color.mylightgray),
                        textColor = colorResource(id = R.color.white),
                        cursorColor = colorResource(id = R.color.white)

                    )

                )


                graytext("Payment Number(MPESA Kenya safaricom)")
                var paymentnumber by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = paymentnumber,
                    onValueChange = {paymentnumber = it},
//                    label = { Text(text = "Password")},
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(top = 13.dp)
                        .background(color = colorResource(id = R.color.mygray)),
                    shape = RoundedCornerShape(15.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = colorResource(id = R.color.mylightgray),
                        textColor = colorResource(id = R.color.white),
                        cursorColor = colorResource(id = R.color.white)
                    )

                )

                graytext("Enter Your name")
                var name by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = name,
                    onValueChange = {name = it},
//                    label = { Text(text = "Password")},
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(top = 13.dp)
                        .background(color = colorResource(id = R.color.mygray)),
                    shape = RoundedCornerShape(15.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = colorResource(id = R.color.mylightgray),
                        textColor = colorResource(id = R.color.white),
                        cursorColor = colorResource(id = R.color.white)

                    )

                )
//                Column (
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier.fillMaxWidth()
//                ){
//                    Divider(
//                        modifier = Modifier
//                            .fillMaxWidth(0.9f)
//                            .padding(top = 14.dp),
//                        color = colorResource(id = R.color.mylightgray)
//                    )
//
//                }

                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){

                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .height(45.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.mygreen),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Post Ad")
                    }
                }
                Column (modifier = Modifier.height(20.dp)){

                }


            }
        }







            BottomAppBar(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()



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







@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    MVVMNavigationTheme {
        BmiScreen(rememberNavController())
    }
}