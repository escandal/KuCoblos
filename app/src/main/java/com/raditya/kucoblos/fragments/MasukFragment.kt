package com.raditya.kucoblos.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.raditya.kucoblos.Communicator
import com.raditya.kucoblos.R
import kotlinx.android.synthetic.main.fragment_masuk.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MasukFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MasukFragment : Fragment() {
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
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var objView = inflater.inflate(R.layout.fragment_masuk, container, false)
        var btn_masuk = objView.findViewById<Button>(R.id.btn_masuk)
        var btn_lupa_kode_akses = objView.findViewById<Button>(R.id.btn_lupakodeakses)
        var btn_daftar_disini = objView.findViewById<Button>(R.id.btn_daftar_disini)

        communicator = activity as Communicator
        btn_masuk.setOnClickListener {
            if(warning()){
                communicator.masuktovote()
                Toast.makeText(activity,"Berhasil",Toast.LENGTH_SHORT).show()
            }
        }
        btn_lupa_kode_akses.setOnClickListener {
            communicator.masuktokodeakses()
        }
        btn_daftar_disini.setOnClickListener {
            communicator.daftardisini()
        }
        return objView
    }
    private fun warning():kotlin.Boolean{
        if(ET_nik_masuk.text.toString().trim().isEmpty()){
            ET_nik_masuk.error="Masukkan NIK"
            return false
        }else if(ET_kodeakses_masuk.text.toString().trim().isEmpty()){
            ET_kodeakses_masuk.error="Masukkan Kode Akses"
            return false
        }
        return true
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MasukFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MasukFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}