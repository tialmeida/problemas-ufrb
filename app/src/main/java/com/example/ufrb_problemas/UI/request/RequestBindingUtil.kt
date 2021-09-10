package com.example.ufrb_problemas.UI.request

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.ufrb_problemas.R
import com.example.ufrb_problemas.model.data.File
import com.example.ufrb_problemas.model.data.Request
import com.example.ufrb_problemas.util.DateFormatter
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class RequestBindingUtil {
    companion object {
        @JvmStatic
        @SuppressLint("SetTextI18n")
        @BindingAdapter("requestPredictionDate")
        fun TextView.setPredictionText(request: Request) {
            text = "Previsão de conserto: ${DateFormatter.formatterDate(request.completion_prediction_date)}"
        }

        @JvmStatic
        @BindingAdapter("requestStatus")
        fun TextView.setStatus(request: Request) {
            text = request.status.displayName
        }

        @JvmStatic
        @BindingAdapter("requestTitle")
        fun TextView.setTitle(request: Request) {
            text = request.title
        }

        @JvmStatic
        @BindingAdapter("requestImage")
        fun CircleImageView.setImage(request: Request) {
            val file = findFile(request) ?: return
            Picasso.get().load(file.url)
                .placeholder(R.drawable.ic_baseline_block)
                .into(this)
        }

        private fun findFile(request: Request): File? {
            if(!request.alerts_requests.isNullOrEmpty()) {
                for(alertRequest in request.alerts_requests) {
                    if(!alertRequest.alert.images.isNullOrEmpty()) {
                        for(image in alertRequest.alert.images) {
                            return image.file
                        }
                    }
                }
            }

            return null
        }
    }
}