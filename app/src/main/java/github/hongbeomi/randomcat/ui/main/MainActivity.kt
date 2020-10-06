package github.hongbeomi.randomcat.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import github.hongbeomi.randomcat.R
import github.hongbeomi.randomcat.databinding.ActivityMainBinding
import github.hongbeomi.randomcat.ui.detail.DetailActivity
import github.hongbeomi.randomcat.ui.detail.DetailActivity.Companion.KEY_URL
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setUpViewModel()
        setUpRecyclerView()
        setUpView()
    }

    private fun setUpViewModel() {
        viewModel = getViewModel()
    }

    private fun setUpRecyclerView() {
        mainAdapter = MainAdapter { url ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra(KEY_URL, url)
            }
            startActivity(intent)
        }
        binding.recyclerViewMain.apply {
            adapter = mainAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 3)
            addItemDecoration(MainItemDecoration(
                resources.getDimensionPixelSize(R.dimen.dp_2)
            ))
        }
        lifecycleScope.launch {
            viewModel.imageList.collect {
                mainAdapter.submitData(it)
            }
        }
    }

    private fun setUpView() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }
    }

}