package com.example.smartagriculture.viewmodel

import android.app.Application
import android.view.View
import androidx.lifecycle.SavedStateHandle
import com.example.common.base.BaseViewModel
import com.example.common.data.BaseUrl
import com.example.common.data.CommitParam
import com.example.smartagriculture.R
import com.example.smartagriculture.util.nav

class MineViewModel(application: Application, savedStateHandle: SavedStateHandle
) : BaseShpViewModel(application, savedStateHandle) {

    fun toRevisedInformation(view: View): Unit {
        nav(view).navigate(R.id.action_mainFragment_to_revisedInformationFragment)
    }
    fun toPhone(view: View): Unit {
        nav(view).navigate(R.id.action_mainFragment_to_phoneFragment)
    }
    fun toUpdatePwd(view: View): Unit {
        nav(view).navigate(R.id.action_mainFragment_to_updatePwdFragment)
    }
    fun toSetting(view: View): Unit {
        nav(view).navigate(R.id.action_mainFragment_to_settingFragment)
    }
    fun toProblem(view: View): Unit {
        nav(view).navigate(R.id.action_mainFragment_to_problemFragment)
    }

    fun getProblem(page:String): Unit {
        val commitParam = CommitParam()
        commitParam.page = page
        commitParam.pageSize = "10"
        val map = hashMapOf<String, String>()
        map[getApplication<Application>().resources.getString(R.string.token)] = getUserId().value.toString()
        noHttpRx.postHttpJson(
            map,
            "常见问题",
            BaseUrl.BASE_URL3 + BaseUrl.PROBLEM,
            commitParam.toJson(commitParam),
            onDialogGetListener
        )
    }
    fun getInformation(): Unit {
        val commitParam = CommitParam()
        val map = hashMapOf<String, String>()
        map[getApplication<Application>().resources.getString(R.string.token)] = getUserId().value.toString()
        noHttpRx.postHttpJson(
            map,
            "个人资料",
            BaseUrl.BASE_URL3 + BaseUrl.INGORMATION,
            commitParam.toJson(commitParam),
            onDialogGetListener
        )
    }

}