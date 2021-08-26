package com.example.walletapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class WalletRecyclerViewAdapter(var walletList:List<App>, var context: Context:Context):RecyclerView.Adapter<AppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.wallet_list_item, false)
        return AppViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        var currentWallet = walletList[position]
        holder.description.text = currentWallet.description
        holder.reference.text = currentWallet.reference
        holder.date.text = currentWallet.date
        holder.amount.text = currentWallet.amount.toString()
        holder.amount.text = currentWallet.transactionType

        holder.setOnClickListener{
            var intent= Intent(context, display::class.java)
            intent.putExtra("post_id",currentWallet.id)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var description = itemView.findViewById<TextView>(R.id.tvdecription)
        var reference = itemView.findViewById<TextView>(R.id.tvref)
        var date = itemView.findViewById<TextView>(R.id.tvdate)
        var amount = itemView.findViewById<TextView>(R.id.tvamount)


    }

