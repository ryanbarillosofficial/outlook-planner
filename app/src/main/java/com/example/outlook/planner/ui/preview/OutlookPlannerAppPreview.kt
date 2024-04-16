package com.example.outlook.planner.ui.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.outlook.planner.OutlookPlannerApp
import com.example.outlook.planner.ui.theme.OutlookPlannerTheme

/**
 * This is designated for preview of [OutlookPlannerApp]
 */
@Preview(showBackground = true)
@Composable
fun OutlookPlannerPreview() {
    OutlookPlannerTheme(darkTheme = false) {
        OutlookPlannerApp()
    }
}


@Preview(showBackground = true)
@Composable
fun OutlookPlannerPreviewDark() {
    OutlookPlannerTheme(darkTheme = true) {
        OutlookPlannerApp()
    }
}