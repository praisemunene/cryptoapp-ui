package com.example.mvvmnavigation.ui.theme.screens.sell


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
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
import com.example.mvvmnavigation.navigation.ROUTE_PROFILE
import com.example.mvvmnavigation.navigation.ROUTE_SELL
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SellingScreen(navController: NavController){
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
                fontSize = 20.sp,
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
                    .padding(start = 10.dp, top = 5.dp),
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
            modifier = Modifier
                .background(color = colorResource(id = R.color.mytheme))
                .fillMaxSize()
                .height(80.dp)
                .clip(RoundedCornerShape(100.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){
            bigboldertext("P2P")
        }

        Row (
            modifier = Modifier.padding(top = 10.dp)
        ){
            TextButton(onClick = {
                navController.navigate(ROUTE_CALCULATOR)
            }) {
                Text(
                    text = "Buy",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                )
            }

        TextButton(onClick = {
            navController.navigate(ROUTE_SELL)
        }) {
            Text(
                text = "Sell",
                fontSize = 17.sp,
                modifier = Modifier
                    .padding(start = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
        }
        }
        Row (
        ){
            Text(
                text = "USDT sport market price",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = colorResource(id = R.color.white)
                )
            )
            Text(
                text = "141.30",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = colorResource(id = R.color.myred)
                )
            )

        }
        Row {
            Text(
                text = "Buying price range",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(top = 10.dp, start = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = colorResource(id = R.color.myred)
                )
            )

            Text(
                text = "141.30 - 144.79",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = colorResource(id = R.color.white)
                )
            )
        }


        @Composable
        fun allads(email:String,price:Double,amountAvailable:Int,trades:Int,percentage:Double) {
            Row(
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Column {
                    Text(
                        text = "$email",
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(start = 10.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.white)
                        )
                    )
                }
                Column(
                    modifier = Modifier.padding(top = 4.dp)
                ) {
                    Row {
                        Text(
                            text = "$trades " + " trades |",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 24.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Gray
                            )
                        )
                        Text(
                            text = "$percentage " + "%",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 3.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = Color.Gray
                            )
                        )
                    }
                }
            }
            Text(
                text = "Price",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 10.dp, top = 5.dp),
                style = androidx.compose.ui.text.TextStyle(
                    color = Color.Gray
                )
            )

            Row {
                Text(
                    text = "$price",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 10.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.white)
                    )
                )
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
            Row {


                Row (
                    modifier = Modifier.width(200.dp)
                ){

                    Text(
                        text = "Available USDT",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 5.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            color = Color.Gray
                        )
                    )
                    Text(
                        text = "$amountAvailable" + " USDT",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 5.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            color = colorResource(id = R.color.white)
                        )
                    )
                }
                Row (
                    modifier = Modifier
                        .width(200.dp)
                        .padding(end = 10.dp),
                    horizontalArrangement = Arrangement.End
                ){
                    Button(onClick = {

                    },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.myred)
                        ),
                        shape = RoundedCornerShape(10.dp)

                    ) {
                        Text(
                            text = "Sell",
                            fontSize = 15.sp,
//                            modifier = Modifier
//                                .padding(start = 10.dp, top = 5.dp),
                            style = androidx.compose.ui.text.TextStyle(
                                color = colorResource(id = R.color.white)
                            )
                        )
                    }
                }
            }
            Row (
                modifier = Modifier.padding(start = 10.dp)
            ){
                Card (
                    modifier = Modifier
                        .height(20.dp)
                        .width(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.mygreen)
                    ),
//                    shape = RoundedCornerShape(3.dp)
                ){

                }
                Text(
                    text = "MPESA Kenya(safaricom)",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,),
                    style = androidx.compose.ui.text.TextStyle(
                        color = Color.Gray
                    )
                )
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            ){
                Divider(
                    modifier = Modifier.fillMaxWidth(0.9f),
                    color = colorResource(id = R.color.mylightgray)
                )
            }
        }
        allads("praisemunene87@gmail.com",141.88, 46, 10 , 98.67 )
        allads("johndoe865457@gmail.com",141.88, 46, 10 , 98.67 )
        allads("usertest677677@gmail.com",141.88, 46, 10 , 98.67 )
        allads("jemmimamugure@gmail.com",141.88, 46, 10 , 98.67 )
        allads("ronnymutuma56@gmail.com",141.88, 46, 10 , 98.67 )
        allads("rootuseradmin1@gmail.com",141.88, 46, 10 , 98.67 )
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
fun SellScreen() {
    MVVMNavigationTheme {
        SellingScreen(rememberNavController())
    }
}
