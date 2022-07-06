package ork.liesa.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ork.liesa.tweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var tweet=Tweet("Khloe @khloeh 47min","I choose happiness over everything ","","","","","","35","10","13","89")
        var tweet1=Tweet("Robert @robby 3min","I treat others the way I want to be treated","","","","","","64","36","88","92")
        var tweet2=Tweet("Mwangi @mwas 20min","I understand how precious time is","","","","","","63","36","53","73")
        var tweet3=Tweet("Shee @shesh  12min","I'm not sure what will happen tomorrow","","","","","","65","64","46","65")
        var tweet4=Tweet("Lisa @lisas  34min","My opinion of me is more important than others' opinion of me.","","","","","","47","36","73","38")
        var tweet5=Tweet("liz @lisabell  30min","I deserve to be.I am responsible for my own happiness.","","","","","","76","45","73","27")

        var  contactList=listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)
        var contactAdapter=TweetRVAdapter(contactList)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=contactAdapter

    }
}
