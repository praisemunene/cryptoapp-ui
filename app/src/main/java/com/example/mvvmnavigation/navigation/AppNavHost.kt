package com.example.mvvmnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.screens.BMIcalc.BmiScreen
import com.example.mvvmnavigation.ui.theme.screens.calculator.CalculatorScreen
import com.example.mvvmnavigation.ui.theme.screens.home.HomeScreen
import com.example.mvvmnavigation.ui.theme.screens.intents.IntentsScreen
import com.example.mvvmnavigation.ui.theme.screens.login.loginScreen
import com.example.mvvmnavigation.ui.theme.screens.profile.ProfileScreen
import com.example.mvvmnavigation.ui.theme.screens.sell.SellingScreen
import com.example.mvvmnavigation.ui.theme.screens.sellpostad.SellingPostScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUTE_HOME
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUTE_BMIcalc) {
            BmiScreen(navController = navController)
        }
        composable(ROUTE_CALCULATOR) {
            CalculatorScreen(navController = navController)
        }
        composable(ROUTE_INTENTS) {
            IntentsScreen(navController = navController)
        }
        composable(ROUTE_LOGIN) {
            loginScreen(navController = navController)
        }
        composable(ROUTE_SELL) {
            SellingScreen(navController = navController)
        }
        composable(ROUTE_SELLPOSTAD) {
            SellingPostScreen(navController =  navController)
        }
        composable(ROUTE_PROFILE) {
            ProfileScreen(navController =  navController)
        }
    }
}