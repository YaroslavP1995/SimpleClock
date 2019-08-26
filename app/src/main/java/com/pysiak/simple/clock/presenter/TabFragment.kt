package com.pysiak.simple.clock.presenter

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pysiak.simple.clock.R
import android.widget.TextView

class TabFragment : Fragment() {
   /* val EXTRA_MESSAGE = "EXTRA_MESSAGE"

    fun newInstance(message: String): TabFragment {
        val fragment = TabFragment()
        val args = Bundle()
        args.putString(EXTRA_MESSAGE, message)
        fragment.setArguments(args)
        return fragment
    }*/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      return inflater.inflate(R.layout.layout_one,container,false)

       /* val message = arguments?.getString(EXTRA_MESSAGE)
        val result = inflater.inflate(R.layout.layout_one, container, false)
        val pageMain = result.findViewById<View>(R.id.textViewFragmentOneId) as TextView
        pageMain.text = message
        return result*/
    }
}
