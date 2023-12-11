package com.example.mvvmnavigation.ui.theme.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
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
import com.example.mvvmnavigation.navigation.ROUTE_LOGIN
import com.example.mvvmnavigation.navigation.ROUTE_PROFILE
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme
import com.example.mvvmnavigation.ui.theme.screens.sellpostad.SellingPostScreen

@Composable
fun ProfileScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.mygray))
            .verticalScroll(rememberScrollState()), // Enable scrolling if the content exceeds the screen height
        verticalArrangement = Arrangement.Top,
    ) {
        @Composable
        fun bigboldertext(textbigbolder:String){
            Text(
                text = "$textbigbolder",
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 17.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white)
                )
            )
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.mytheme))
                .height(250.dp)
        ){
            Text(
                text = "Profile",
                fontSize = 22.sp,
                modifier = Modifier.padding(top = 20.dp, start = 10.dp),
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.white)
                )
            )
            Row (
                modifier = Modifier.padding(top = 15.dp, start = 10.dp)
            ){
                Column (

                ){
                    Card (
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp),

                        colors = CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.mygray)
                        ),
                        ){
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                            contentDescription = "profile",
                            tint = colorResource(id = R.color.white),
                            modifier = Modifier
                                .width(30.dp)
                                .height(30.dp)
                        )
                    }
                }
                Column {
                    Text(
                        text = "Praisemunene87@gmail.com",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 2.dp, start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.black)
                        )
                    )
                    Text(
                        text = "Cryptomine merchant patner",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_verified_24),
                        contentDescription = "profile",
                        tint = colorResource(id = R.color.white),
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                    )
                    Text(
                        text = "verified merchant |",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 8.dp, start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.mygray)
                        )
                    )
                    Text(
                        text = "balance ",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 8.dp, start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.mygray)
                        )
                    )
                    Text(
                        text = "55 USDT",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 8.dp, start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.black)
                        )
                    )
                }

                Row (
                    modifier = Modifier.padding(top = 20.dp)
                ){

                    Text(
                        text = "Email",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.mygray)
                        )
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.baseline_verified_24),
                        contentDescription = "profile",
                        tint = colorResource(id = R.color.mygreen),
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                    )
                    Text(
                        text = "Number",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.mygray)
                        )
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.baseline_verified_24),
                        contentDescription = "profile",
                        tint = colorResource(id = R.color.mygreen),
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)

                    )
                    Text(
                        text = "Address",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 10.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Normal,
                            color = colorResource(id = R.color.mygray)
                        )
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.baseline_verified_24),
                        contentDescription = "profile",
                        tint = colorResource(id = R.color.mygreen),
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                    )
                }

            }
        }

        Text(
            text = "Info",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 13.dp, start = 10.dp),
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                color = colorResource(id = R.color.white)
            )
        )
        Row (
            modifier = Modifier.padding(top = 13.dp)
        ){
            Column (
                modifier = Modifier.width(170.dp)
            ){
                Text(
                    text = "11",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 3.dp, start = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraBold,
                        color = colorResource(id = R.color.white)
                    )
                )

                Text(
                    text = "Total trades",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 3.dp, start = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
            }
            Column(
                modifier = Modifier.width(170.dp),
                horizontalAlignment = Alignment.End

            ) {
                Text(
                    text = "99.4%",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 3.dp, end = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraBold,
                        color = colorResource(id = R.color.white)
                    )
                )

                Text(
                    text = "Completion rate",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 3.dp, end = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )

            }
        }
        Row (
            modifier = Modifier.padding(top = 10.dp)
        ){
            Column(
                modifier = Modifier.width(170.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Deposit",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
                Text(
                    text = "Refferal profits",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                )
            }
            Column (
                modifier = Modifier.width(170.dp),
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = "100 USDT(s)",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, ),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
                Text(
                    text = "40 USDT(s)",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, ),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
            }
        }

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(22.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.baseline_verified_24),
                contentDescription = "profile",
                tint = colorResource(id = R.color.white),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Email",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            )
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = "praisemunene87@gmail.com",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, end = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
            }
        }
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Divider(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(0.85f),color = colorResource(id = R.color.mylightgray))
        }



        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(22.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.baseline_phone_android_24),
                contentDescription = "profile",
                tint = colorResource(id = R.color.white),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Number",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            )
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = "+254712982944",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, end = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
            }
        }
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Divider(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(0.85f),color = colorResource(id = R.color.mylightgray))
        }

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(22.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                contentDescription = "profile",
                tint = colorResource(id = R.color.white),
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            )
            Text(
                text = "Address",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            )
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Text(
                    text = "praisemunene87@gmail.com",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 10.dp, end = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                )
            }
        }
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Divider(modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(0.85f),color = colorResource(id = R.color.mylightgray))
        }

      Column(
          modifier = Modifier.fillMaxWidth(),
          horizontalAlignment = Alignment.CenterHorizontally
      ) {
          Button(onClick = {
              navController.navigate(ROUTE_LOGIN)
          },
              colors = ButtonDefaults.buttonColors(
                  containerColor = colorResource(id = R.color.mytheme)
              ),
              shape = RoundedCornerShape(10.dp),
              modifier = Modifier.padding(10.dp).fillMaxWidth(0.9f)
          ) {
              Text(text = "Log out",
                  fontSize = 14.sp,
                  style = TextStyle(
                      fontWeight = FontWeight.Normal,
                      color = Color.White
                  )
              )
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
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    MVVMNavigationTheme {
        ProfileScreen(rememberNavController())
    }
}