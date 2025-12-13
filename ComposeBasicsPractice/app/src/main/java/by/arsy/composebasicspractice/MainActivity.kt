package by.arsy.composebasicspractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import by.arsy.composebasicspractice.ui.theme.ComposeBasicsPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            Modifier.weight(1f)
        ) {
            QuadrantElement(
                titleText = "Text composable",
                descriptionText = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF)
            )
            QuadrantElement(
                titleText = "Image composable",
                descriptionText = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantElement(
                titleText = "Row composable",
                descriptionText = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8)
            )
            QuadrantElement(
                titleText = "Column composable",
                descriptionText = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun RowScope.QuadrantElement(
    titleText: String,
    descriptionText: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp)
            .weight(1f)
    ) {
        Text(
            text = titleText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descriptionText,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantScreenPreview() {
    ComposeBasicsPracticeTheme {
        QuadrantScreen()
    }
}