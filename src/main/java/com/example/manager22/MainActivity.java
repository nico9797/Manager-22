package com.example.manager22;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] teams={"Juventus","Inter","Milan","Roma","Lazio","Napoli","Atalanta","Sassuolo",
            "Torino","Salernitana","Fiorentina","Udinese","Empoli","Cremonese","Bologna","Verona","Sampdoria",
            "Spezia","Lecce","Monza"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        listView=(ListView) findViewById(R.id.customListView);

        CustomBaseAdapter adapter=new CustomBaseAdapter(getApplicationContext(),teams);
        listView.setAdapter(adapter);
    }
}