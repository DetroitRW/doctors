package com.example.doctors


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doctors.databinding.DoctorsCardBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val doctorsList = ArrayList<DoctorsInfo>()

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding = DoctorsCardBinding.bind(itemView)

        fun bind(doctorsInfo: DoctorsInfo) = with(binding) {
            //imageViewAvatar.setImageIcon() = doctorsInfo.icon
            textViewName.text = doctorsInfo.name
            textViewSpecialization.text = doctorsInfo.specialization
            textViewData.text = doctorsInfo.data
            textViewTime.text = doctorsInfo.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.doctors_card, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(doctorsList[position])
    }

    override fun getItemCount(): Int {
        return doctorsList.size
    }

    fun addDoctors(doctorsInfo: DoctorsInfo) {
        doctorsList.add(doctorsInfo)
        notifyDataSetChanged()
    }
}