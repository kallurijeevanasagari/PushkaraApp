package com.example.hp.pushkaraapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
    EditText name;
    EditText pass;
    Button submit;
    Button reset;
    //TextView textView;

    // String[] values=new String[]{"jeevana","sagari","jeevanasagari","kanchana","surendrareddy","chandrakala"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit1);
        pass = (EditText) findViewById(R.id.edit2);
        submit = (Button) findViewById(R.id.button1);
        reset = (Button) findViewById(R.id.button2);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        spinner.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add("Chandrakala");
        categories.add("Jeevana");
        categories.add("Jeevanasagari");
        categories.add("Sagari");
        categories.add("Kanchana");
        categories.add("Surendrareddy");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        Collections.sort(categories);
        spinner.setAdapter(dataAdapter);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String na = name.getText().toString();
                String pa = pass.getText().toString();

                switch (v.getId()) {

                    case R.id.button1:
                        if (na.equals("ap") && pa.equals("ap123")) {

                            Intent intent = new Intent(MainActivity.this, Second.class);
                            intent.putExtra("data", String.valueOf(spinner.getSelectedItem()));

                            // startActivityForResult(intent, 0);
                            startActivity(intent);
                            spinner.setSelection(0);
                            name.setText("");
                            pass.setText("");
                            Toast.makeText(getApplicationContext(), "correct Login " + na + " ", Toast.LENGTH_SHORT).show();
                        } else {
                            spinner.setSelection(0);
                            name.setText("");
                            pass.setText("");
                            Toast.makeText(getApplicationContext(), "Incorrect Login", Toast.LENGTH_SHORT).show();
                        }


                        break;

                    default:
                        break;


                }


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.setSelection(0);
                name.setText("");
                pass.setText("");

            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();


        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

