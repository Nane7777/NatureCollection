package be.nane.naturecollection.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import be.nane.naturecollection.R

class PlantAdapter {

    // boîte pour ranger tous les composants à contrôler
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

}