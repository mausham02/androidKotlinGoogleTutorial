package com.example.googletutorial

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    public fun scroll_to_item() {
        onView(withId(R.id.recycle_view)).perform(
            RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(9)
        )

        onView(withText(R.string.affirmation10))
            .check(matches(isDisplayed()))
    }
}