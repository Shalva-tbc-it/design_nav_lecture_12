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
                image = "https://img.freepik.com/free-psd/cartoon-flower-bouquet_187299-9963.jpg?w=996&t=st=1700917366~exp=1700917966~hmac=392e2596fbe211f1155ca6eb8fe5c716fbfb024d8b13ab61c3723787b0ad0714",
                title = title,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://img.freepik.com/free-psd/cartoon-flower-bouquet_187299-9963.jpg?w=996&t=st=1700917366~exp=1700917966~hmac=392e2596fbe211f1155ca6eb8fe5c716fbfb024d8b13ab61c3723787b0ad0714",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://pngtree.com/freepng/ceramic-vase_5780349.html",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
            Item(
                image = "https://pngtree.com/freepng/beautiful-still-life-dried-flower-vase-plant_5889793.html",
                title = R.string.marble_flower_vase,
                rate = R.string._4_7,
                sold = R.string._8_563_sold,
                price = R.string._85_00
            ),
        )
    }

}