package com.example.common.data

import com.google.gson.Gson
import java.io.Serializable
import java.util.*


/**
 * Created by ddy on 2018/3/27
 * 传参数设置
 */
class CommitParam : Serializable {
    lateinit var pageSize: String
    var page: String? = null
    var warntype: Int? = null
    var id: Int? = null
    var companyId: String? = null
    var parkType: String? = null
    var parkId: String? = null
    var query: String? = null
    var massifName: String? = null
    var type: String? = null
    var parentId: String? = null
    var number: String? = null
    var pageNum: String? = null
    var materialsTypeId: String? = null
    var productName: String? = null
    var informationId: String? = null
    var userId: String? = null
    lateinit var userIds: MutableList<Map<String, String>>
    var name: String? = null
    var ip: String? = null
    var chatUser: String? = null
    var category: String? = null
    var groupid: String? = null
    var username: String? = null
    var password: String? = null
    var longitude: String? = null
    var latitude: String? = null


    fun toJson(commitParam: CommitParam): String {
        return Gson().toJson(commitParam);//传参转json
    }
}
