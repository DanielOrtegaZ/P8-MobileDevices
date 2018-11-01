package a3cv6.escom.ipn.mx.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import a3cv6.escom.ipn.mx.fragment.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            val t = supportFragmentManager.beginTransaction()
            val id = R.id.container

            t.add(id,MainFragment.newInstance("APP DEV MOBILE DEVICES","3CV6","Ulises Velez Saldaña","13:30 hrs","Salon: 1212"))
            t.add(id,MainFragment.newInstance("LIDERAZGO Y DESARROLLO P","4CV2","Gisela Gonzalez Albarran","15:00 hrs","Salon: 2210"))
            t.add(id,MainFragment.newInstance("GESTION EMPRESARIAL","4CV4","Jazmin Ivette Jimenez","16:30 hrs","Salon: 2212"))
            t.add(id,MainFragment.newInstance("ADMIN SERVICIOS EN RED","4CV2","Josue Rangel Gonzalez","16:30 hrs","Salon: 2210"))
            t.commit()
        }
    }

}
