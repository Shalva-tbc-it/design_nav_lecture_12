package com.example.designnavigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.designnavigation.AddItems
import com.example.designnavigation.adapter.ItemRecyclerViewAdapter
import com.example.designnavigation.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {

    private lateinit var adapter: ItemRecyclerViewAdapter
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!
    private val addItems = AddItems()
    private val itemList = addItems.sendDataToDataClass()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomePageBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView()
        listener()
    }

    private fun listener() = with(binding) {
        imgSearch.setOnClickListener {
            imgSearch.visibility = View.GONE
            imgCancel.visibility = View.VISIBLE
            edSearch.visibility = View.VISIBLE
        }
        imgCancel.setOnClickListener {
            edSearch.text?.clear()
            imgSearch.visibility = View.VISIBLE
            imgCancel.visibility = View.GONE
            edSearch.visibility = View.GONE
        }

        edSearch.addTextChangedListener {
            adapter.filter(it.toString())
        }
    }



    private fun recyclerView() = with(binding) {
        adapter = ItemRecyclerViewAdapter()
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = adapter
        adapter.apply {
            setData(item = itemList.toMutableList())

            setOnItemClickListener { item ->
                findNavController().navigate(
                    HomePageFragmentDirections.actionHomePageFragmentToItemInfoFragment(
                        item
                    )
                )
            }
        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}