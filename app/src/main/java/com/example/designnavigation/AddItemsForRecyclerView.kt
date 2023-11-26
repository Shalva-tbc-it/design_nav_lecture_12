package com.example.designnavigation

import com.example.designnavigation.data_model.Item


abstract class AddItemsForRecyclerView {
    abstract fun createItemList(): List<Item>

    fun sendDataToDataClass(): List<Item> {
        return createItemList()
    }
}
class AddItems : AddItemsForRecyclerView() {
    override fun createItemList(): List<Item> {
        return listOf(
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/2121876/pexels-photo-2121876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/4207785/pexels-photo-4207785.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/4207475/pexels-photo-4207475.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                    ),
                title = "First",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/3910065/pexels-photo-3910065.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/2121876/pexels-photo-2121876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/237655/pexels-photo-237655.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "First",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/8408535/pexels-photo-8408535.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/12010418/pexels-photo-12010418.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/863020/pexels-photo-863020.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "Second",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/14875293/pexels-photo-14875293.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/3739993/pexels-photo-3739993.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/1626590/pexels-photo-1626590.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "Second",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/2121876/pexels-photo-2121876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/6707632/pexels-photo-6707632.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/4207890/pexels-photo-4207890.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "First",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/3910065/pexels-photo-3910065.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/735091/pexels-photo-735091.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/954551/pexels-photo-954551.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "Three",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/8408535/pexels-photo-8408535.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/19095058/pexels-photo-19095058.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/1758206/pexels-photo-1758206.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "Three",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = mutableListOf(
                    "https://images.pexels.com/photos/14875293/pexels-photo-14875293.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/1031030/pexels-photo-1031030.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                    "https://images.pexels.com/photos/1118175/pexels-photo-1118175.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                ),
                title = "Second",
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
        )
    }

}