package com.example.myandroidapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myandroidapp.ui.navigation.VocabMasterApp
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testNavigationBetweenScreens() {
        composeTestRule.setContent {
            VocabMasterApp()
        }

        // Verify Home screen is displayed
        composeTestRule.onNodeWithText("Home").assertExists()

        // Navigate to Smart Cards
        composeTestRule.onNodeWithText("Smart Cards").performClick()
        composeTestRule.onNodeWithText("Smart Cards").assertExists()

        // Navigate to Story Mode
        composeTestRule.onNodeWithText("Story Mode").performClick()
        composeTestRule.onNodeWithText("Story Mode").assertExists()

        // Navigate to Memory Palace
        composeTestRule.onNodeWithText("Memory Palace").performClick()
        composeTestRule.onNodeWithText("Memory Palace").assertExists()

        // Navigate to Profile
        composeTestRule.onNodeWithText("Profile").performClick()
        composeTestRule.onNodeWithText("John Doe").assertExists()

        // Navigate to Settings
        composeTestRule.onNodeWithText("Settings").performClick()
        composeTestRule.onNodeWithText("Enable Notifications").assertExists()
    }
}
