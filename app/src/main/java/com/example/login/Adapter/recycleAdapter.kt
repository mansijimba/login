//package com.example.login.Adapter
//
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.login.R
//
//class recycleAdapter ( var nameList: ArrayList<String>,
//                       var descriptionList: ArrayList<String>
//
//    )  override fun getCount(): Int {
//        return nameList.size
//    }
//
//    override fun getItem(p0: Int): Any? {
//        return null
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return 0
//    }
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//
//        var view : View = LayoutInflater.from(parent?.context).inflate(
//            R.layout.sample_grid_design_1,
//            parent,false)
//        var label : TextView = view.findViewById(R.id.textView2)
//
//        label.text = nameList[position]
//        image.setImageResource(imageList[position])
//
//        return view
//
//
//
//}