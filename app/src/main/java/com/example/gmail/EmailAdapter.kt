package com.example.gmail
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSender: TextView = itemView.findViewById(R.id.textViewSender)
        val tvTime: TextView = itemView.findViewById(R.id.tv_time)
        val textViewSubject: TextView = itemView.findViewById(R.id.textViewSubject)
        val textViewPreview: TextView = itemView.findViewById(R.id.textViewPreview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.textViewSender.text = email.sender
        holder.tvTime.text = email.time
        holder.textViewSubject.text = email.subject
        holder.textViewPreview.text = email.preview
    }

    override fun getItemCount(): Int = emailList.size
}