package com.myuni.sampleone.plano

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myuni.sampleone.R
import kotlinx.android.synthetic.main.fragment_plano_estudos.view.*

/**
 * A placeholder fragment containing a simple view.
 */
class PlanoDiarioFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_plano_estudos, container, false)
        rootView.section_label.text = getString(R.string.section_format, arguments?.getInt(ARG_SECTION_NUMBER))
        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): PlanoDiarioFragment {
            val fragment = PlanoDiarioFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}