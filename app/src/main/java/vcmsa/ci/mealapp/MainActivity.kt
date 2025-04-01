// Title: Meal App
// Date: 27 March 2025
// Version: 1.0
// Available:

package vcmsa.ci.mealapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // The onCreate is the entry point for the activity.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Layout for activity is set. The layout is defined in res/layout/activity_main.xml
        setContentView(R.layout.activity_main)

        // Retrieve the UI elements from the layout by their IDs
        // EditText for user to input the time of day "Morning,Afternoon,etc."
        val mealTimeInput: EditText = findViewById(R.id.mealTime)
        // TextView for user to see what meal they will eat when the click on button.
        val resultText: TextView = findViewById(R.id.resultText)
        // Button for user to click and display what meal they will be eating according to the time in EditText.
        val suggestMealButton: Button = findViewById(R.id.suggestMealButton)
        // Button for user to click and reset what was in the EditText.
        val btnReset: Button = findViewById(R.id.btnReset)
        // Title: Create and use variables in Kotlin
        // Author: Android Developers
        // Date: 28 March 2025
        // Version: 1.0
        // Available:https://developer.android.com/codelabs/basic-android-kotlin-compose-variables

        // OnClickListener is set for the Meal Suggestion Button
        suggestMealButton.setOnClickListener {
            // Retrieve the meal time from input field as a String
            val timeOfDay = mealTimeInput.text.toString().trim() // Trim input to remove spaces

            // Check for different meal times and display the corresponding meal suggestion
            if (timeOfDay.equals("Morning", ignoreCase = true)) {
                // If the time of the day is Morning, user will eat scrambled eggs on toast
                resultText.text = "Meal of the day is: Scrambled eggs on toast"
            } else if (timeOfDay.equals("Mid-morning", ignoreCase = true)) {
                //If the time of the day is Mid-morning, user will eat a fruit salad with yogurt.
                resultText.text = "Meal of the day is: Fruit salad with yougurt"
            }
            // Fixed typo: Changed "Aternoon" to "Afternoon"
            else if (timeOfDay.equals("Afternoon", ignoreCase = true)) {
                //If the time of the day is Afternoon,user will eat a grilled chicken salad.
                resultText.text = "Meal of the day is: Grilled chicken sandwich"
            } else if (timeOfDay.equals("Mid-afternoon", ignoreCase = true)) {
                //If the time of the day is Afternoon,user will eat a granola bar with smoothie.
                resultText.text = "Meal of the day is: Granola bar with smoothie"
            } else if (timeOfDay.equals("Dinner", ignoreCase = true)) {
                //If the time of the day is Afternoon,user will eat a pasta dish.
                resultText.text = "Meal of the day is: Pasta"
            } else if (timeOfDay.equals("After dinner", ignoreCase = true)) {
                //If the time of the day is Afternoon,user will eat ice cream as a treat.
                resultText.text = "Meal of the day is: Ice Cream"
            } else {
                // Handle invalid inputs
                resultText.text = "Invalid input! Please enter Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, or After Dinner."
            }
        }
        // Title: Kotlin If... Else
        // Author: w3schools
        // Date: 26 March 2025
        // Version: 1.0
        // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

        btnReset.setOnClickListener {
            mealTimeInput.text.clear() // Clears the input field
            resultText.text = "" // Clears the result text

        // Title: How to create a button in Kotlin that opens a new activity (Android Studio)?
        // Author: stackOverflow
        // Date: 28 March 2025
        // Version: 1.0
        // Available:  https://stackoverflow.com/questions/45108239/how-to-create-a-button-in-kotlin-that-opens-a-new-activity-android-studio

        // Title: Reset
        // Author: kotlin
        // Date: 28 March 2025
        // Version: 1.0
        // Available: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.js/reset.html




        }
    }
}