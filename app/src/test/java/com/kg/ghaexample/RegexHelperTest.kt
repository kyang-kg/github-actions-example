package com.kg.ghaexample

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import com.kg.ghaexample.helper.isDouble
import junit.framework.TestCase.assertEquals
import org.junit.Test

class RegexHelperTest {
    @Test
    fun `GIVEN string WHEN is valid positive double with no leading zero THEN isDouble should return true`() {
        assertEquals(true, "1.23".isDouble())
    }

    @Test
    fun `GIVEN string WHEN is double with leading zero THEN isDouble should return false`() {
        assertEquals(false, "01.23".isDouble())
    }

    @Test
    fun `GIVEN string WHEN is not valid double THEN isDouble should return false`() {
        assertEquals(false, "a1.23".isDouble())
    }
}