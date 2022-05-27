package com.kim.listviewpractice2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.listviewpractice2.Datas.Student
import com.kim.listviewpractice2.R

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId,mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = inf.inflate(R.layout.student_list_item,null)
        }

        val row = tempRow!!

        val studentData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthyearTxt = row.findViewById<TextView>(R.id.birthyearTxt)

        nameTxt.text = studentData.name
        birthyearTxt.text = studentData.birthyear.toString()

        return row
    }
}