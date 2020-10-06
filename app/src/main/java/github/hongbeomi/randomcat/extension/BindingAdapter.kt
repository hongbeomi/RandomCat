package github.hongbeomi.randomcat.extension

import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable
import github.hongbeomi.randomcat.R

@BindingAdapter("bind:loadUrl")
fun bindUrlImage(view: ImageView, url: String?) {
    url ?: return

    val shimmer = Shimmer.ColorHighlightBuilder()
        .setBaseColor(ResourcesCompat.getColor(view.resources, R.color.greyScaleDark, view.resources.newTheme()))
        .setHighlightColor(ResourcesCompat.getColor(view.resources, R.color.greyScaleLittleDark, view.resources.newTheme()))
        .setDuration(1800)
        .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
        .setAutoStart(true)
        .build()

    val shimmerDrawable = ShimmerDrawable().apply {
        setShimmer(shimmer)
    }

    Glide.with(view)
        .load(url)
        .placeholder(shimmerDrawable)
        .into(view)
}