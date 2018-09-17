package ssun.pe.kr.myapplication

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.view.Gravity
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter1: MainAdapter
    private lateinit var adapter2: MainAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // PagerSnapHelper
        adapter1 = MainAdapter()
        rv1.adapter = adapter1
        rv1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        PagerSnapHelper().attachToRecyclerView(rv1)
        adapter1.submitList(makeItemList())
        indicator1.attachToRecyclerView(rv1)

        // RecyclerViewSnap
        adapter2 = MainAdapter2()
        rv2.adapter = adapter2
        rv2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        GravitySnapHelper(Gravity.START).attachToRecyclerView(rv2)
        adapter2.submitList(makeItemList())
    }

    private fun makeItemList() = listOf(
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deep_purple,
            R.color.indigo,
            R.color.blue,
            R.color.light_blue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.light_green,
            R.color.lime,
            R.color.yellow,
            R.color.amber,
            R.color.orange,
            R.color.deep_orange,
            R.color.brown,
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deep_purple,
            R.color.indigo,
            R.color.blue,
            R.color.light_blue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.light_green,
            R.color.lime,
            R.color.yellow,
            R.color.amber,
            R.color.orange,
            R.color.deep_orange,
            R.color.brown,
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deep_purple,
            R.color.indigo,
            R.color.blue,
            R.color.light_blue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.light_green,
            R.color.lime,
            R.color.yellow,
            R.color.amber,
            R.color.orange,
            R.color.deep_orange,
            R.color.brown,
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deep_purple,
            R.color.indigo,
            R.color.blue,
            R.color.light_blue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.light_green,
            R.color.lime,
            R.color.yellow,
            R.color.amber,
            R.color.orange,
            R.color.deep_orange,
            R.color.brown
    ).map { Item(ContextCompat.getColor(this, it)) }
}
