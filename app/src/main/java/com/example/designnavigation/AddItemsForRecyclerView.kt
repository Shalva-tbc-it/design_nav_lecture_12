package com.example.designnavigation

import com.example.designnavigation.data_model.Item


abstract class AddItemsForRecyclerView {
    abstract fun createItemList(): List<Item>

    fun sendDataToDataClass(): List<Item> {
        return createItemList()
    }
}
class AddItems : AddItemsForRecyclerView() {

    private val title = R.string.marble_flower_vase
    override fun createItemList(): List<Item> {
        return listOf(
            Item(
                image = "https://images.pexels.com/photos/2121876/pexels-photo-2121876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = title,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/3910065/pexels-photo-3910065.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/8408535/pexels-photo-8408535.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/14875293/pexels-photo-14875293.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/2121876/pexels-photo-2121876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = title,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/3910065/pexels-photo-3910065.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/8408535/pexels-photo-8408535.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://images.pexels.com/photos/14875293/pexels-photo-14875293.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
        )
    }

}