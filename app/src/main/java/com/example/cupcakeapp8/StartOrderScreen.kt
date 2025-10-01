package com.example.cupcakeapp8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cupcakeapp8.ui.theme.CupcakeApp8Theme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.dimensionResource
import com.example.cupcakeapp8.R


@Composable
fun StartOrderScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                dimensionResource(R.dimen.padding_small)
            )
        ) {
            // Aquí irán los elementos de la parte superior
        }
    }
}


@Preview
@Composable
fun StartOrderPreview() {
    CupcakeApp8Theme {
        StartOrderScreen()
    }
}

