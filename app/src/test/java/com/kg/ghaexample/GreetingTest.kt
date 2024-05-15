package com.kg.ghaexample

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.kg.ghaexample.ui.theme.AppTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Example UI Test for Greeting Component using Robolectric.
 */
@RunWith(RobolectricTestRunner::class)
class GreetingTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private fun initializeTest(greeting: String) {
        composeTestRule.setContent {
            AppTheme {
                Greeting(greeting)
            }
        }
    }

    @Test
    fun `GIVEN Greeting WHEN non-empty input THEN Greeting should show correct text`() {
        initializeTest("Android")

        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }

    @Test
    fun `GIVEN Greeting WHEN empty input THEN Greeting should show correct text`() {
        initializeTest("")

        composeTestRule.onNodeWithText("Hello !").assertIsDisplayed()
    }
}
