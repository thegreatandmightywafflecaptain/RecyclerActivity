package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_numbers : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* Step 3a: Provide Adapter Parent */ {

    val numbers = _numbers
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        val numberView = textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply{
                layoutParams = ViewGroup.LayoutParams(300, 300)
            }
        )
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.numberView.text = numbers[position].toString()
    }

    //Step 3b: Complete function definitions for adapter

}