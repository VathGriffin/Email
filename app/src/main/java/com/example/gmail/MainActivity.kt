package com.example.gmail
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var emailList: List<Email>
    private lateinit var filteredList: MutableList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewEmails)
        recyclerView.layoutManager = LinearLayoutManager(this)

        emailList = listOf(
            Email("sender1", "Subject 1", "Preview of email 1", "12:00 PM"),
            Email("sender2", "Subject 2", "Preview of email 2", "1:30 PM"),
            Email("sender3", "Subject 3", "Preview of email 3", "2:45 PM"),
            Email("sender4", "Subject 4", "Preview of email 4", "3:15 AM"),
            Email("sender5", "Subject 5", "Preview of email 5", "4:00 PM"),
            Email("sender6", "Subject 6", "Preview of email 6", "5:34 AM")
        )

        filteredList = emailList.toMutableList()
        emailAdapter = EmailAdapter(filteredList)
        recyclerView.adapter = emailAdapter

        val searchIcon: ImageView = findViewById(R.id.searchIcon)
        searchIcon.setOnClickListener {

        }
    }
}