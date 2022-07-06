package ork.liesa.tweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRVAdapter(var tweetList:List<Tweet>):
    RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):TweetViewHolder {
        var  itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_items, parent, false)
        return TweetViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
            holder.tvName.text = currentTweet.name
            holder.tvWords.text = currentTweet.word
            holder.tvNum.text = currentTweet.num
            holder.tvNum1.text = currentTweet.num1
            holder.tvNum2.text = currentTweet.num2
            holder.tvNum3.text = currentTweet.num3
        }


    override fun getItemCount(): Int {
   return tweetList.size
    }
}

class TweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var  tvName=itemView.findViewById<TextView>(R.id.tvName)
        var  tvWords=itemView.findViewById<TextView>(R.id.tvWords)
        var  tvNum=itemView.findViewById<TextView>(R.id.tvNum)
        var  tvNum1=itemView.findViewById<TextView>(R.id.tvNum1)
        var  tvNum2=itemView.findViewById<TextView>(R.id.tvNum2)
        var  tvNum3=itemView.findViewById<TextView>(R.id.tvNum3)
        var  imgReply=itemView.findViewById<ImageView>(R.id.imgReply)
        var  imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
        var  imgReact=itemView.findViewById<ImageView>(R.id.imgReact)
        var  imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
    }
