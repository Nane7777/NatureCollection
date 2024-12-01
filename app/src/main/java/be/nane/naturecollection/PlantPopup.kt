package be.nane.naturecollection

import android.app.Dialog
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import be.nane.naturecollection.adapter.PlantAdapter
import com.bumptech.glide.Glide

class PlantPopup(
    private val adapter: PlantAdapter,
    private val currentPlant : PlantModel
) : Dialog(adapter.context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.popup_plant_details)
        setupComponents()
    }

    private fun setupComponents() {
        // actualiser l'image de la plante
        val plantImage = findViewById<ImageView>(R.id.image_item)
        Glide.with(adapter.context).load(Uri.parse(currentPlant.imageUrl)).into(plantImage)

        // actualiser le nom de la plante
        findViewById<TextView>(R.id.popup_plant_name).text = currentPlant.name

        // actualiser la description de la plante
        findViewById<TextView>(R.id.popup_plant_description_subtitle).text = currentPlant.description

        // actualiser la croissance de la plante
        findViewById<TextView>(R.id.popup_plant_grow_subtitle).text = currentPlant.grow

        // actualiser la consommation d'eau de la plante
        findViewById<TextView>(R.id.popup_plant_water_subtitle).text = currentPlant.water

    }
}