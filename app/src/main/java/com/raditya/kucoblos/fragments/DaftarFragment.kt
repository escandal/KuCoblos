package com.raditya.kucoblos.fragments

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.raditya.kucoblos.Communicator
import com.raditya.kucoblos.R
import kotlinx.android.synthetic.main.fragment_daftar.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaftarFragment : Fragment() {
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
        var objView = inflater.inflate(R.layout.fragment_daftar, container, false)
        var btn_panduan = objView.findViewById<Button>(R.id.btn_panduan)
        var btn_verifikasi = objView.findViewById<Button>(R.id.btn_verifikasi_ktp)
        var btn_daftar =objView.findViewById<Button>(R.id.btn_daftar)
        communicator = activity as Communicator
        btn_panduan.setOnClickListener {
            communicator.panduan()
        }
        btn_verifikasi.setOnClickListener {
            cameraPermission()
            var takePict = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(takePict, 123)
        }
        btn_daftar.setOnClickListener {
            communicator.daftartomasuk()
        }
        return objView
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 123 && resultCode == Activity.RESULT_OK && data != null){
            var thumbnail = data.extras
            iv_verifikasi_ktp.setImageBitmap(thumbnail?.get("data") as Bitmap)
        }
    }
    private fun cameraPermission() {
        var permissions = arrayOf(Manifest.permission.CAMERA)
        var needPermission : ArrayList<String> = ArrayList()
        for (i in permissions){
            if (activity?.let { ContextCompat.checkSelfPermission(it,i) } != PackageManager.PERMISSION_GRANTED){
                needPermission.add(i)
            }
        }
        if(!needPermission.isEmpty()){
            activity?.let { ActivityCompat.requestPermissions(it,needPermission.toArray(arrayOfNulls(needPermission.size)),123) }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DaftarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DaftarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}