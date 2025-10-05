package com.example.mynavigationapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class ContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_contact, container, false)


        val name = view.findViewById<EditText>(R.id.name)
        val number = view.findViewById<EditText>(R.id.number)
        val email = view.findViewById<EditText>(R.id.email)
        val btnEnviar = view.findViewById<Button>(R.id.btnEnviar)
        val txtResult = view.findViewById<TextView>(R.id.txtResult)


        btnEnviar.setOnClickListener {

            val name = name.text.toString()
            val number = number.text.toString()
            val email = email.text.toString()

            val mensaje = if (name.isEmpty() || number.isEmpty() || email.isEmpty()) {
                "Please fill all the fields so we can contact you 😊"
            } else {
                "We have received your information, we will contact you as soon as possible ❤️"
            }

            // Display result in TextView
            txtResult.text = mensaje
        }

        return view

        //return inflater.inflate(R.layout.fragment_contact, container, false)

    }
}