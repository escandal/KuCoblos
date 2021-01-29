package com.raditya.kucoblos.fragments

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.raditya.kucoblos.Communicator
import com.raditya.kucoblos.R
import kotlinx.android.synthetic.main.fragment_voting.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [VotingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VotingFragment : Fragment() {
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
        var objView= inflater.inflate(R.layout.fragment_voting, container, false)
        var intentVoting1=Intent(this.activity,VotingFragment::class.java)
        var btn_vote1pres = objView.findViewById<Button>(R.id.btnIvPaslon1)
        var btn_vote2pres = objView.findViewById<Button>(R.id.btnIvPaslon2)
        var btn_vote3pres = objView.findViewById<Button>(R.id.btnIvPaslon3)
        var btn_vote4pres = objView.findViewById<Button>(R.id.btnIvPaslon4)

        var btn_vote1dpr = objView.findViewById<Button>(R.id.btndDprPaslon1)
        var btn_vote2dpr = objView.findViewById<Button>(R.id.btndDprPaslon2)
        var btn_vote3dpr = objView.findViewById<Button>(R.id.btndDprPaslon3)
        var btn_vote4dpr = objView.findViewById<Button>(R.id.btndDprPaslon4)
        var x :Int = 0
        communicator = activity as Communicator

        //Presiden
        btn_vote1pres.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                    dialog, which ->x +=1
                    communicator.passDataCom(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote2pres.setOnClickListener{
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom2(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote3pres.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom3(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote4pres.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom4(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        //DPR
        btn_vote1dpr.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom5(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote2dpr.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom6(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote3dpr.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom7(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
        }
        btn_vote4dpr.setOnClickListener {
            var BuilderDialog = AlertDialog.Builder(activity)
                .setMessage("Apakah anda yakin dengan pilihan ini?")
                .setPositiveButton("Setuju"){
                        dialog, which ->x +=1
                    communicator.passDataCom8(x.toString())
                }
                .setNegativeButton("Tidak"){dialog, which ->  }
            BuilderDialog.show()
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
         * @return A new instance of fragment VotingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VotingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

