package com.example.week3lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstMembers;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstMembers = (ListView)findViewById(R.id.lstMembers);

        String[] values = new String[]{
          "김소정", "김소정", "정은비", "최유나", "황은비", "김예원"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        lstMembers.setAdapter(adapter);

        button = (Button) findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               openActivity2();
           }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, labgrid.class);
        startActivity(intent );
    }
}