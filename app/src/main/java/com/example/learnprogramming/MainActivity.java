package com.example.learnprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.topics_item));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,HtmlActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "you have Clicked on HTML " , Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,CssActivity.class);
                        startActivity(intent1);
                        Toast.makeText(MainActivity.this, "you have Clicked on CSS " , Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Intent intent2= new Intent(MainActivity.this,JavascriptActivity.class);
                        startActivity(intent2);
                        Toast.makeText(MainActivity.this, "you have Clicked on Javascript " , Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,CprogrammingActivity.class);
                        startActivity(intent3);
                        Toast.makeText(MainActivity.this, "you have Clicked on C programing " , Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Intent intent4 = new Intent(MainActivity.this,JavaActivity.class);
                        startActivity(intent4);
                        Toast.makeText(MainActivity.this, "you have Clicked on JAVA " , Toast.LENGTH_SHORT).show();
                        break;

                    case 5:
                        Intent intent5 = new Intent(MainActivity.this,PythonActivity.class);
                        startActivity(intent5);
                        Toast.makeText(MainActivity.this, "you have Clicked on Python " , Toast.LENGTH_SHORT).show();
                        break;

                    case 6:
                        Intent intent6 = new Intent(MainActivity.this,SqlActivity.class);
                        startActivity(intent6);
                        Toast.makeText(MainActivity.this, "you have Clicked on Database " , Toast.LENGTH_SHORT).show();
                        break;

                    case 7:
                        Intent intent7 = new Intent(MainActivity.this,PracticeActivity.class);
                        startActivity(intent7);
                        Toast.makeText(MainActivity.this, "Go to practice problem chapter" , Toast.LENGTH_SHORT).show();
                        break;








                }
            }
        });


    }
}