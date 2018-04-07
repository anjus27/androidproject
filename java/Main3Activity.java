package com.example.user.mygovtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
 ListView L1;
    String[] values = new String[] { "MARRIAGE REGISTERATION",
            "APPLY PASSPORT",
            "TAX REGISTERATION",
            "DEATH REGISTERATION",
            "LAND TAX",
            "ELECTRICITY BILL PAYMENT",
            "OTHER DOCCUMENTS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        L1=(ListView)findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        L1.setAdapter(adapter);
        L1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:

                        Intent i1=new Intent(Main3Activity.this,Main4Activity.class);
                          startActivity(i1);
                        break;
                    case 1:
                        Intent i2=new Intent(Main3Activity.this,Main5Activity.class);
                        startActivity(i2);
                        break;
                    case 2:
                        Intent i3=new Intent(Main3Activity.this,Main6Activity.class);
                        startActivity(i3);
                        break;
                    case 3:
                        Intent i4=new Intent(Main3Activity.this,Main7Activity.class);
                        startActivity(i4);
                        break;
                    case 4:
                        Intent i5=new Intent(Main3Activity.this,Main8Activity.class);
                        startActivity(i5);
                        break;
                    case 5:
                        Intent i6=new Intent(Main3Activity.this,Main9Activity.class);
                        startActivity(i6);
                        break;
                    case 6:
                        Intent i7=new Intent(Main3Activity.this,Main10Activity.class);
                        startActivity(i7);
                        break;
                }
            }
        });


    }
    }

