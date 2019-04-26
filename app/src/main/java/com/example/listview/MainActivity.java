package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String [] nome ={"Pie","Oreo","Nougat","Marshmallow","Lollipop","Android Wear(KitKat)","KitKat","Jelly Bean","Ice Cream Sandwich","Honeycomb","Gingerbread","Froyo","Eclair","Donut","Cupcake","Beta*","Alpha*"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView v =(ListView) findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,nome);
        v.setAdapter(adapter);

        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = nome[position];
                Toast.makeText(getBaseContext(),valor,Toast.LENGTH_LONG).show();
            }
        });
    }

}
