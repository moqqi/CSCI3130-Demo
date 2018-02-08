package com.example.acme.csci3130_demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by iMoqii on 2018-02-08.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void passwordValidateCase() {
        // Type text and then press the button.
        onView(withId(R.id.editText1))
                .perform(typeText("password"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView1)).check(matches(withText("Password Not Strong.")));
    }

    @Test
    public void passwordValidateMinCase() {
        // Type text and then press the button.
        onView(withId(R.id.editText1))
                .perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView1)).check(matches(withText("Password Not Strong.")));
    }

    @Test
    public void passwordValidateMaxCase() {
        // Type text and then press the button.
        onView(withId(R.id.editText1))
                .perform(typeText("TestcaseTestcaseTestcase1"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView1)).check(matches(withText("Password Not Strong.")));
    }

    @Test
    public void passwordValidateDigitCase() {
        // Type text and then press the button.
        onView(withId(R.id.editText1))
                .perform(typeText("Testcase"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView1)).check(matches(withText("Password Not Strong.")));
    }

    @Test
    public void passwordValidateUpperCase() {
        // Type text and then press the button.
        onView(withId(R.id.editText1))
                .perform(typeText("testcase1"), closeSoftKeyboard());
        onView(withId(R.id.button1)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView1)).check(matches(withText("Password Not Strong.")));
    }
}
