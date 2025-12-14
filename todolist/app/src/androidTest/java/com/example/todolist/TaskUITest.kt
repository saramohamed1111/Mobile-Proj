package com.example.todolist

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class TaskUITest {

    // Rule to launch the MainActivity before each test
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun addTask_and_verifyDisplay() {
        // 1. Find the TextField by its Label and Type text
        composeTestRule.onNodeWithText("Enter Task")
            .performTextInput("Buy Coffee")

        // 2. Find the Add button by its Text and Click it
        composeTestRule.onNodeWithText("Add")
            .performClick()

        // 3. Assert (Check) that the new task is displayed on the screen
        composeTestRule.onNodeWithText("Buy Coffee")
            .assertIsDisplayed()
    }
}