package com.example.designnavigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.designnavigation.R
import com.example.designnavigation.data_model.Item
import com.example.designnavigation.databinding.FragmentItemInfoBinding
import com.squareup.picasso.Picasso

class ItemInfoFragment : Fragment() {

    private var _binding: FragmentItemInfoBinding? = null
    private val binding get() = _binding!!
    private lateinit var item: Item


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val args: ItemInfoFragmentArgs by navArgs()
        item = args.items

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentItemInfoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setVaseInfo()


    }

    private fun setVaseInfo() = with(binding) {
        Picasso.get()
            .load(item.image[0])
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_foreground)
            .into(binding.imgMainPhoto)

        tvTitle.text = item.title
        tvSold.setText(item.sold)
        tvRate.setText(item.rate)
        tvPrice.setText(item.price)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}