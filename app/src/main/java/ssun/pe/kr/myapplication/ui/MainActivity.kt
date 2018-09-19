package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.PagerSnapHelper
import android.view.Gravity
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import ssun.pe.kr.myapplication.R
import ssun.pe.kr.myapplication.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter1: MainAdapter
    private lateinit var adapter2: MainAdapter2
    private lateinit var adapter3: MainAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel

        initViews()

        viewModel.items.observe(this, Observer {
            adapter1.submitList(it)
        })

        viewModel.installedApps.observe(this, Observer {
            adapter2.submitList(it)
            adapter3.submitList(it)
        })

        viewModel.getItems()
        viewModel.getInstalledApps()
    }

    private fun initViews() {
        setSupportActionBar(toolbar)

        // PagerSnapHelper
        adapter1 = MainAdapter()
        rv1.adapter = adapter1
        rv1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        PagerSnapHelper().attachToRecyclerView(rv1)
        indicator1.attachToRecyclerView(rv1)

        // LinearSnapHelper
        adapter2 = MainAdapter2()
        rv2.adapter = adapter2
        rv2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        LinearSnapHelper().attachToRecyclerView(rv2)

        // RecyclerViewSnap
        adapter3 = MainAdapter2()
        rv3.adapter = adapter3
        rv3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        GravitySnapHelper(Gravity.START).attachToRecyclerView(rv3)
    }
}
