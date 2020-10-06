package github.hongbeomi.randomcat.ui.main

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainItemDecoration(
    private val space : Int
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        when(parent.getChildLayoutPosition(view) % 3) {
            0 -> {
                outRect.apply {
                    right = space / 2
                    bottom = space
                }
            }
            1 -> {
                outRect.apply {
                    left = space / 2
                    right = space / 2
                    bottom = space
                }
            }
            2 -> {
                outRect.apply {
                    left = space / 2
                    bottom = space
                }
            }
        }
    }

}