package com.raditya.kucoblos.fragments

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.raditya.kucoblos.R
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
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
        var objView= inflater.inflate(R.layout.fragment_result, container, false)
        //Presiden
        var resultvote1 :String? = objView.persenSuara1.text.toString()
        var resultvote2 :String? = objView.persenSuara2.text.toString()
        var resultvote3 :String? = objView.persenSuara3.text.toString()
        var resultvote4 :String? = objView.persenSuara4.text.toString()

        //DPR
        var resultvote1Dpr :String? = objView.persenSuaraDpr1.text.toString()
        var resultvote2Dpr :String? = objView.persenSuaraDpr2.text.toString()
        var resultvote3Dpr :String? = objView.persenSuaraDpr3.text.toString()
        var resultvote4Dpr :String? = objView.persenSuaraDpr4.text.toString()

        //Presiden
        resultvote1 = arguments?.getString("message")
        objView.persenSuara1.setText(resultvote1)

        resultvote2 = arguments?.getString("message2")
        objView.persenSuara2.setText(resultvote2)

        resultvote3 = arguments?.getString("message3")
        objView.persenSuara3.setText(resultvote3)

        resultvote4 = arguments?.getString("message4")
        objView.persenSuara4.setText(resultvote4)

        //DPR
        resultvote1Dpr = arguments?.getString("message5")
        objView.persenSuaraDpr1.setText(resultvote1Dpr)

        resultvote2Dpr = arguments?.getString("message6")
        objView.persenSuaraDpr2.setText(resultvote2Dpr)

        resultvote3Dpr = arguments?.getString("message7")
        objView.persenSuaraDpr3.setText(resultvote3Dpr)

        resultvote4Dpr = arguments?.getString("message8")
        objView.persenSuaraDpr4.setText(resultvote4Dpr)
        return objView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ResultFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ResultFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}