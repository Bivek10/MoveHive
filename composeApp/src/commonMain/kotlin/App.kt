import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dependencies.MyViewModel
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.KoinContext



@Composable
@Preview
fun App(){
    MaterialTheme{
        KoinContext{
            NavHost(navController = rememberNavController(),
               startDestination = "home"
            ){
                composable(route = "home") {
                    val viewModel = koinViewModel<MyViewModel>()
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = viewModel.getHelloWorldString()
                        )
                    }
                }
            }
        }
        
    }
    
}