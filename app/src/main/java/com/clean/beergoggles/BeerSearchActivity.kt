package com.clean.beergoggles

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class BeerSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beer_search)
        setSupportActionBar(findViewById(R.id.toolbar))

        val rollButton: Button = findViewById(R.id.web_search_button)

        val searchField: EditText = findViewById(R.id.web_search_input)
        val resultField: TextView = findViewById(R.id.web_search_output)

        val searchEngine = SearchEngine()

        rollButton.setOnClickListener {
            searchEngine.search(searchField.text.toString()
            ) { result: String ->
                resultField.text = result
                Log.d("BeerSearchActivity", "web search result: $result")
            }
        }
    }
}