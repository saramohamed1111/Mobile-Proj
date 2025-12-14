package com.example.todolist

import org.junit.Assert.*
import org.junit.Test

class TaskValidationTest {

    // Test Case 1: Validate that a task is not empty
    @Test
    fun `validate task name is not empty`() {
        val input = "Buy Milk"
        val result = input.isNotEmpty()
        assertTrue("Task name should not be empty", result)
    }

    // Test Case 2: Validate business logic (Example: Task name length)
    @Test
    fun `validate task name is long enough`() {
        val input = "Go"
        val result = input.length > 3
        assertFalse("Task name should be longer than 3 characters", result)
    }
}
