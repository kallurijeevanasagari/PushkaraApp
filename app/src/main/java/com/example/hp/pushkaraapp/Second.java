package com.example.hp.pushkaraapp;


import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.InputType;
import android.view.MenuItem;
import android.view.View;
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


public class Second extends Activity  {


     Spinner spinner3, spinner2;
     Button submit,reset;
    //RequestQueue requestQueue;

    String insertUrl ="/http://192.168.56.1/puskaraapp/pushkara.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_time);
        EditText editText=(EditText) findViewById(R.id.edit5);
        Bundle bundle=getIntent().getExtras();
        final String data=bundle.get("data").toString();
        editText.setText(data);
        editText.setEnabled(false);

        addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();


    }
    public void addItemsOnSpinner2() {

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add("00-01");
        list.add("01-02");
        list.add("02-03");
        list.add("03-04");
        list.add("04-05");
        list.add("05-06");
        list.add("06-07");
        list.add("07-08");
        list.add("08-09");
        list.add("09-10");
        list.add("10-11");
        list.add("11-12");
        list.add("12-13");
        list.add("13-14");
        list.add("14-15");
        list.add("15-16");
        list.add("16-17");
        list.add("17-18");
        list.add("18-19");
        list.add("19-20");
        list.add("20-21");
        list.add("21-22");
        list.add("22-23");
        list.add("23-24");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }


    public void addListenerOnButton() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        submit = (Button) findViewById(R.id.button4);
        final EditText e6=(EditText)findViewById(R.id.edit6);



        e6.setInputType(InputType.TYPE_CLASS_NUMBER);
        //String data=e6.get("data").toString();
        //final String num=e6.getText().toString();
        //String dept=getText("data").toString();
        submit.setOnClickListener(new View.OnClickListener() {

            EditText e5=(EditText)findViewById(R.id.edit5);
              Editable dept=e5.getText();
            //requestQueue=Volley.newRequestQueue(getApplcatonContext());
            //String num=e6.getText().toString();

            @Override
            public void onClick(View v) {

                Toast.makeText(Second.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner2.getSelectedItem()) +
                                "\nSpinner 2 : "+ String.valueOf(spinner3.getSelectedItem())+
                                "\n number :"+e6.getText()+"\n dept: "+dept,
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
//            submit=(Button)findViewById(R.id.button4);
//            reset=(Button)findViewById(R.id.button5);
//
//        EditText editText=(EditText) findViewById(R.id.edit5);
//        Bundle bundle=getIntent().getExtras();
//        final String data=bundle.get("data").toString();
//        editText.setText(data);
//        editText.setEnabled(false);
//       // addItemsOnSpinner();
//        final Spinner spinner=(Spinner)findViewById(R.id.spinner2);
//        spinner.setOnItemSelectedListener(this);
//        List<String> categories = new ArrayList<String>();
//
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(dataAdapter);
//
//        final Spinner spinner5=(Spinner)findViewById(R.id.spinner3);
//        spinner5.setOnItemSelectedListener(this);
//        List<String> ghartnames = new ArrayList<String>();
//        ghartnames.add("Amaravathi");
//
//        ghartnames.add("Dharanikota");
//        ghartnames.add("Sithanagaram-1");
//        ghartnames.add("Sithanagaram-2");
//        ghartnames.add("Vijayapuri South");
//        ghartnames.add("Anupu");
//        ghartnames.add("Satrasala-1");
//        ghartnames.add("Satrasala-2");
//        ghartnames.add("Tallayapalem-1");
//        ghartnames.add("Tallayapalem-2");
//        ghartnames.add("Penumudi-1");
//        ghartnames.add("Penumudi-2");
//        ghartnames.add("Daida-1");
//        ghartnames.add("Daida-2");
//        ghartnames.add("Pondugala");
//        ghartnames.add("Vykuntapuram");
//        ghartnames.add("Nandularevu; H/o Madipadu");
//        ghartnames.add("Madipadu");
//        ghartnames.add("Rayapudi-1");
//        ghartnames.add("Rayapudi-2");
//        ghartnames.add("Harichandrapura m-1");
//        ghartnames.add("Harichandrapuram-2");
//        ghartnames.add("Pedakonduru");
//        ghartnames.add("Chilumuru");
//        ghartnames.add("Gajulalanka");
//        ghartnames.add("Gottimukkala");
//        ghartnames.add("Bhatrupalem-1");
//        ghartnames.add("Bhatrupalem-2");
//        ghartnames.add("Tangeda-1");
//        ghartnames.add("Tangeda-2");
//        ghartnames.add("Ramapuram");
//        ghartnames.add("Regulagadda");
//        ghartnames.add("Vellampalli");
//        ghartnames.add("Katrapadu");
//        ghartnames.add("Govindapuram");
//        ghartnames.add("Ginjupalli");
//        ghartnames.add("Taduvai");
//        ghartnames.add("Chinthapalli");
//        ghartnames.add("Chammarru");
//        ghartnames.add("Kogantivaripalem");
//        ghartnames.add("Konuru");
//        ghartnames.add("Kasthala");
//        ghartnames.add("Borupalem");
//        ghartnames.add("Venkatayapalem");
//        ghartnames.add("Chirravuru");
//        ghartnames.add("Gundimenda");
//        ghartnames.add("Prathuru");
//        ghartnames.add("Ramachandrapuram");
//        ghartnames.add("Veerlapalem");
//        ghartnames.add("Godavarru");
//        ghartnames.add("Athalurivaripalem");
//        ghartnames.add("Vallabhapuram-1");
//        ghartnames.add("Vallabhapuram-2");
//        ghartnames.add("Munnangi");
//        ghartnames.add("Pidaparthipalem");
//        ghartnames.add("Kollipara-1");
//        ghartnames.add("Kollipara-2");
//        ghartnames.add("Kotha Bommuvanipalem-1");
//        ghartnames.add("Kotha Bommuvanipalem-2");
//        ghartnames.add("Bommuvanipalem-1");
//        ghartnames.add("Bommuvanipalem-2");
//        ghartnames.add("Annavarapu Lanka");
//        ghartnames.add("Epuru");
//        ghartnames.add("Suggunalanka");
//        ghartnames.add("Chintalalanka");
//        ghartnames.add("Pedalanka");
//        ghartnames.add("Aravinda Varadhi");
//        ghartnames.add("Juvvalapalem");
//        ghartnames.add("Potharlanka");
//        ghartnames.add("Thippala Katta");
//        ghartnames.add("Pedalanka (Kakula Donka)");
//        ghartnames.add("Oleru");
//        ghartnames.add("Ravi Ananthavaram");
//        ghartnames.add("Mynenivaripalem");
//        ghartnames.add("Chennupallivaripalem");
//        ghartnames.add("Gangadipalem");
//        ghartnames.add("Rajukalava");
//        ghartnames.add("Moorthota");
//        ghartnames.add("VIP Ghat C");
//        ghartnames.add("Pushkar Nagar, Penumudi");
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ghartnames);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5.setAdapter(adapter1);
//        Collections.sort(ghartnames);
//        final EditText e6=(EditText)findViewById(R.id.edit6);
//        e6.setInputType(InputType.TYPE_CLASS_NUMBER);
//
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            String num=e6.getText().toString();
//            String dept=data.toString();
//          //String
//
//            }
//        });
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//
//
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        // On selecting a spinner item
//
//
//
////
////        // Showing selected spinner item
//
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
//    class GhatSpinnerClass implements AdapterView.OnItemSelectedListener
//    {
//        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
//        {
//            String ghat = parent.getItemAtPosition(position).toString();
//            Toast.makeText(parent.getContext(), "ghat Name Selected: " + ghat, Toast.LENGTH_LONG).show();
//
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
//    }
//
//    class TimeSpinnerClass implements AdapterView.OnItemSelectedListener
//    {
//        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
//        {
//            String time = parent.getItemAtPosition(position).toString();
//            Toast.makeText(parent.getContext(), "Time Selected: " + time, Toast.LENGTH_LONG).show();
//
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
//    }

}
