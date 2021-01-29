package com.raditya.kucoblos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.raditya.kucoblos.fragments.*
import kotlinx.android.synthetic.main.activity_splash_screen_activity.*

class SplashScreen_activity : AppCompatActivity(),Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_activity)

        Toast.makeText(this,"Halo Selamat datang",Toast.LENGTH_SHORT).show()

        val homeFragment = HomeFragment()
        val resultFragment = ResultFragment()
        val profileFragment = ProfileFragment()
        val masukFragment = MasukFragment()

        makeCurrentFragment(homeFragment)
        bottom_navigator.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_result -> makeCurrentFragment(resultFragment)
                R.id.ic_voting -> makeCurrentFragment(masukFragment)
                R.id.ic_profile -> makeCurrentFragment(profileFragment)
            }
            true
        }

        supportFragmentManager.beginTransaction().commit()

    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment)
            commit()
        }
    }

    override fun passDataCom(count: String) {
        val bundle = Bundle()
        bundle.putString("message",count)
        val transaksi = this.supportFragmentManager.beginTransaction()
        val rf = ResultFragment()
        rf.arguments=bundle
        transaksi.replace(R.id.vote_frag,rf)
        transaksi.commit()

    }

    override fun passDataCom2(count: String) {
        val bundle2 = Bundle()
        bundle2.putString("message2",count)
        val transaksi2 = this.supportFragmentManager.beginTransaction()
        val rf2 = ResultFragment()
        rf2.arguments=bundle2
        transaksi2.replace(R.id.vote_frag,rf2)
        transaksi2.commit()
    }

    override fun passDataCom3(count: String) {
        val bundle3 = Bundle()
        bundle3.putString("message3",count)
        val transaksi3 = this.supportFragmentManager.beginTransaction()
        val rf3 = ResultFragment()
        rf3.arguments=bundle3
        transaksi3.replace(R.id.vote_frag,rf3)
        transaksi3.commit()
    }

    override fun passDataCom4(count: String) {
        val bundle4 = Bundle()
        bundle4.putString("message4",count)
        val transaksi4 = this.supportFragmentManager.beginTransaction()
        val rf4 = ResultFragment()
        rf4.arguments=bundle4
        transaksi4.replace(R.id.vote_frag,rf4)
        transaksi4.commit()
    }

    override fun passDataCom5(count: String) {
        val bundle5 = Bundle()
        bundle5.putString("message5",count)
        val transaksi5 = this.supportFragmentManager.beginTransaction()
        val rf5 = ResultFragment()
        rf5.arguments=bundle5
        transaksi5.replace(R.id.vote_frag,rf5)
        transaksi5.commit()
    }

    override fun passDataCom6(count: String) {
        val bundle6 = Bundle()
        bundle6.putString("message6",count)
        val transaksi6 = this.supportFragmentManager.beginTransaction()
        val rf6 = ResultFragment()
        rf6.arguments=bundle6
        transaksi6.replace(R.id.vote_frag,rf6)
        transaksi6.commit()
    }

    override fun passDataCom7(count: String) {
        val bundle7 = Bundle()
        bundle7.putString("message7",count)
        val transaksi7 = this.supportFragmentManager.beginTransaction()
        val rf7 = ResultFragment()
        rf7.arguments=bundle7
        transaksi7.replace(R.id.vote_frag,rf7)
        transaksi7.commit()
    }

    override fun passDataCom8(count: String) {
        val bundle8 = Bundle()
        bundle8.putString("message8",count)
        val transaksi8 = this.supportFragmentManager.beginTransaction()
        val rf8 = ResultFragment()
        rf8.arguments=bundle8
        transaksi8.replace(R.id.vote_frag,rf8)
        transaksi8.commit()
    }

    override fun masuktovote() {
        val transaksivote = this.supportFragmentManager.beginTransaction()
        val votefrag = VotingFragment()

        transaksivote.replace(R.id.masuk_frag,votefrag)
        transaksivote.commit()
    }

    override fun kodeaksestomasuk() {
        val transaksimasuk = this.supportFragmentManager.beginTransaction()
        val masukfrag = MasukFragment()

        transaksimasuk.replace(R.id.lupakodeakses_frag,masukfrag)
        transaksimasuk.commit()
    }

    override fun masuktokodeakses() {
        val transaksikodeakses = this.supportFragmentManager.beginTransaction()
        val kodeaksesfrag = LupaKodeAksesFragment()

        transaksikodeakses.replace(R.id.masuk_frag,kodeaksesfrag)
        transaksikodeakses.commit()
    }

    override fun aboutUs() {
        val transaksiaboutus = this.supportFragmentManager.beginTransaction()
        val aboutusfrag = AboutUsFragment()

        transaksiaboutus.replace(R.id.profile_frag,aboutusfrag)
        transaksiaboutus.commit()
    }

    override fun panduan() {
        val transaksipanduan = this.supportFragmentManager.beginTransaction()
        val panduanfrag = PanduanFragment()

        transaksipanduan.replace(R.id.daftar_frag,panduanfrag)
        transaksipanduan.commit()
    }

    override fun daftardisini() {
        val transaksidaftardisini = this.supportFragmentManager.beginTransaction()
        val daftardisini = DaftarFragment()

        transaksidaftardisini.replace(R.id.masuk_frag,daftardisini)
        transaksidaftardisini.commit()
    }

    override fun daftartomasuk() {
        val transaksimasuk = this.supportFragmentManager.beginTransaction()
        val masukfrag = MasukFragment()

        transaksimasuk.replace(R.id.daftar_frag,masukfrag)
        transaksimasuk.commit()
    }

}