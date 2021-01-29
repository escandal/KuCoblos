package com.raditya.kucoblos.fragments

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.raditya.kucoblos.*
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlin.reflect.typeOf

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var objView = inflater.inflate(R.layout.fragment_home, container, false)
        var imagebutton=objView.findViewById<ImageButton>(R.id.ibCari)
        imagebutton.setOnClickListener {
            var txt = etSearch.text.toString()
            var googleSearch = Uri.parse("https://www.google.com/search?q=$txt")
            var googleIntent = Intent(Intent.ACTION_VIEW,googleSearch)
            startActivity(googleIntent)
        }
        //klik by ImageView
        var beritaone = objView.findViewById<ImageButton>(R.id.dwiS)
        beritaone.setOnClickListener{
            var intentNews = Intent(activity,News::class.java)
            startActivity(intentNews)
        }
        var beritatwo = objView.findViewById<ImageButton>(R.id.edhiP)
        beritatwo.setOnClickListener{
            var intentNews = Intent(activity,News2::class.java)
            startActivity(intentNews)
        }
        var beritathree = objView.findViewById<ImageButton>(R.id.PssiPer)
        beritathree.setOnClickListener{
            var intentNews = Intent(activity,News3::class.java)
            startActivity(intentNews)
        }
        var beritafour = objView.findViewById<ImageButton>(R.id.vacine)
        beritafour.setOnClickListener{
            var intentNews = Intent(activity,News4::class.java)
            startActivity(intentNews)
        }
        var beritafive = objView.findViewById<ImageButton>(R.id.kapolri)
        beritafive.setOnClickListener{
            var intentNews = Intent(activity,News5::class.java)
            startActivity(intentNews)
        }
        var beritasix = objView.findViewById<ImageButton>(R.id.bouy)
        beritasix.setOnClickListener{
            var intentNews = Intent(activity,News6::class.java)
            startActivity(intentNews)
        }
        var beritaseven = objView.findViewById<ImageButton>(R.id.bouy1)
        beritaseven.setOnClickListener{
            var intentNews = Intent(activity,News7::class.java)
            startActivity(intentNews)
        }
        //Klik by textView
        var beritaoneteks = objView.findViewById<TextView>(R.id.tvJudulBerita)
        beritaoneteks.setOnClickListener{
            var intentNews = Intent(activity,News::class.java)
            startActivity(intentNews)
        }
        var beritatwoteks = objView.findViewById<TextView>(R.id.tvJudulBerita1)
        beritatwoteks.setOnClickListener{
            var intentNews = Intent(activity,News2::class.java)
            startActivity(intentNews)
        }
        var beritathreeteks = objView.findViewById<TextView>(R.id.tvJudulBerita2)
        beritathreeteks.setOnClickListener{
            var intentNews = Intent(activity,News3::class.java)
            startActivity(intentNews)
        }
        var beritafourteks = objView.findViewById<TextView>(R.id.tvJudulBerita3)
        beritafourteks.setOnClickListener{
            var intentNews = Intent(activity,News4::class.java)
            startActivity(intentNews)
        }
        var beritafiveteks = objView.findViewById<TextView>(R.id.tvJudulBerita4)
        beritafiveteks.setOnClickListener{
            var intentNews = Intent(activity,News5::class.java)
            startActivity(intentNews)
        }
        var beritasixteks = objView.findViewById<TextView>(R.id.tvJudulBerita5)
        beritasixteks.setOnClickListener{
            var intentNews = Intent(activity,News6::class.java)
            startActivity(intentNews)
        }
        var beritaseventeks  = objView.findViewById<TextView>(R.id.tvJudulBerita6)
        beritaseventeks .setOnClickListener{
            var intentNews = Intent(activity,News7::class.java)
            startActivity(intentNews)
        }

        return objView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

