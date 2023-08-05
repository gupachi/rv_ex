package com.jw.rv_ex

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jw.rv_ex.ui.theme.Rv_exTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = mutableListOf<String>()

        items.add("a")
        items.add("b")
        items.add("c")





        val rv = findViewById<RecyclerView>(R.id.rvItems)
        val rvAdapter = RvAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(this)

        rvAdapter.itemClick = object : RvAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                Toast.makeText(baseContext,items[position],Toast.LENGTH_LONG).show()
            }
        }
    }

    }