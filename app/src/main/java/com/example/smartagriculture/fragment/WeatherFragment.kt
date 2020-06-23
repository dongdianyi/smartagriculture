package com.example.smartagriculture.fragment

import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.common.BaseFragment
import com.example.smartagriculture.R
import com.example.smartagriculture.adapter.WeatherAdapter
import com.example.smartagriculture.bean.MyWeatherData
import com.example.smartagriculture.databinding.FragmentWeatherBinding
import com.example.smartagriculture.viewmodel.DataViewModel
import kotlinx.android.synthetic.main.fragment_weather.*

/**
 * A simple [Fragment] subclass.
 */
class WeatherFragment : BaseFragment<DataViewModel,FragmentWeatherBinding>() {


    override fun initLayout(): Int {
        return R.layout.fragment_weather
    }

    override fun initView(view: View) {
    }

    override fun initData() {
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        weather_recycler.layoutManager = linearLayoutManager
        var datas = mutableListOf<MyWeatherData>()
        datas.add(MyWeatherData(0, -8, "昨天"))
        datas.add(MyWeatherData(3, -6, "今天"))
        datas.add(MyWeatherData(4, -6, "星期一"))
        var weatherAdapter: WeatherAdapter<MyWeatherData> = WeatherAdapter(requireContext(),R.layout.beta_weather,datas)
        weather_recycler.adapter =weatherAdapter

    }

}