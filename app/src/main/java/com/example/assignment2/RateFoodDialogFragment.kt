package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class RateFoodDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): AlertDialog {
        val view = layoutInflater.inflate(R.layout.dialog_rate_food, null)

        val rgRating = view.findViewById<RadioGroup>(R.id.rg_rating)
        val btnSubmitRating = view.findViewById<View>(R.id.btn_submit_rating)
        val btnCancelRating = view.findViewById<View>(R.id.btn_cancel_rating)

        btnSubmitRating.setOnClickListener {
            // Call feedback
            println("Feedback submitted!")
            dismiss()
        }

        btnCancelRating.setOnClickListener {
            dismiss()
        }

        return AlertDialog.Builder(requireContext())
            .setView(view)
            .create()
    }
}