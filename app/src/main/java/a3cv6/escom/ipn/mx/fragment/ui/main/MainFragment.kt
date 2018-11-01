package a3cv6.escom.ipn.mx.fragment.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import a3cv6.escom.ipn.mx.fragment.R
import android.content.Context
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainFragment : Fragment(), View.OnClickListener {

    private var materia = ""
    private var grupo = ""
    private var profesor = ""
    private var hora = ""
    private var place = ""

    private lateinit var claseUI : TextView
    private lateinit var profesorUI : TextView
    private lateinit var horaUI: TextView
    private lateinit var placeUI: TextView

    companion object {
        fun newInstance(m:String,g:String,p:String,hr:String,pl:String) = MainFragment().apply {
            arguments = Bundle().apply {
                putString("MATERIA",m)
                putString("GRUPO",g)
                putString("PROFESOR",p)
                putString("HORA",hr)
                putString("PLACE",pl)
            }
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        arguments?.getString("MATERIA")?.let { materia = it }
        arguments?.getString("GRUPO")?.let { grupo = it }
        arguments?.getString("PROFESOR")?.let { profesor = it }
        arguments?.getString("HORA")?.let { hora = it }
        arguments?.getString("PLACE")?.let { place = it }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false) // This is the View
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        claseUI = view.findViewById<TextView>(R.id.Materia)
        horaUI = view.findViewById<TextView>(R.id.Time)
        profesorUI = view.findViewById<TextView>(R.id.Profesor)
        placeUI = view.findViewById<TextView>(R.id.Place)
        view.findViewById<ImageButton>(R.id.button).setOnClickListener(this)

        claseUI.text = materia + " (" + grupo +")"
        horaUI.text = hora
        profesorUI.text = profesor
        placeUI.text = place
    }

    override fun onClick(v: View?) {
        Toast.makeText(activity,"Get Location",Toast.LENGTH_SHORT).show()
    }
}
