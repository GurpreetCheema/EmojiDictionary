package com.example.jchee.emojidictionary

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class emojiAdapter: RecyclerView.Adapter<emojiAdapter.TextHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        return TextHolder(
            LayourInflater.from(parent.context).inflate(
                R.layout.recylerview_item_row,
                parent,
                attachToRoot: false))

    }
    override fun getItemCount(): Int {
        return 10
    }

    class TextHolder(v: View) : RecycleView.ViewHolder(v), View.OnClickListener{
        override fun onClick(v: View?) {
            TODO(reason = "not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<emojiAdapter> {
        override fun createFromParcel(parcel: Parcel): emojiAdapter {
            return emojiAdapter(parcel)
        }

        override fun newArray(size: Int): Array<emojiAdapter?> {
            return arrayOfNulls(size)
        }
    }

} {
}