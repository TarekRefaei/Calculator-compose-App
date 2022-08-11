package com.example.mycomposableapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycomposableapp.ui.theme.LightGray
import com.example.mycomposableapp.ui.theme.Orange

@Composable
fun Calculator(
    buttonSpacing: Dp = 8.dp,
    states: CalculatorStates,
    onAction:(CalculatorActions)-> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(buttonSpacing),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = states.number1 + (states.operation?.symbol?:"") + states.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
               CalculatorButton(
                   symbol ="AC" ,
                   modifier = Modifier
                       .background(LightGray)
                       .aspectRatio(ratio = 2f)
                       .weight(2f),
                   onClick = {
                       onAction(CalculatorActions.Clear)
                   }
               )
                CalculatorButton(
                    symbol ="Del" ,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                )
                CalculatorButton(
                    symbol ="/" ,
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculatorOperations.Divide))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol ="7" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    symbol ="8" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol ="9" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    symbol ="×" ,
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculatorOperations.Multiply))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol ="4" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol ="5" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol ="6" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    symbol ="-" ,
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculatorOperations.Minus))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol ="1" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol ="2" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol ="3" ,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    symbol ="+" ,
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operations(CalculatorOperations.Add))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol ="0" ,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(ratio = 2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )
                CalculatorButton(
                    symbol ="." ,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    symbol ="=" ,
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(ratio = 1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}