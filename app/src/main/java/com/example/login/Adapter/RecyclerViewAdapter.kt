//package com.example.login.Adapter
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.recyclerview.widget.RecyclerView
//import com.example.login.R
//import com.example.login.recyclerview
//import org.w3c.dom.Text
//
//class RecyclerViewAdapter(var nameList: ArrayList<String>,
//                          var descriptionList: ArrayList<String>
//) : RecyclerViewHolder.Adapter
//
//    class RecyclerViewHolder(view: View) : recyclerview.viewholder(){
//        //bind views from layout file
//        var title:TextView=view.findViewById(R.id.textView4)
//        var description: TextView = view.findViewById(R.id.textView3)
//
//    }
//
//    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): RecyclerViewHolder {
//        // when users opens activity this method links layout file to our activity
//        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.activity_sample_recycler_view,parent,false)
//        return RecyclerViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return nameList.size
//    }
//
//    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
//        holder.title.text =  nameList[position]
//        holder.description.text =  descriptionList[position]
//    }
//
//}
