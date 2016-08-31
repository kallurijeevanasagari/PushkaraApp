package com.example.hp.pushkaraapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimeFragment extends Fragment  {

   // implements View.OnClickListener
    public TimeFragment() {
        // Required empty public constructor
    }
    //String[] values=new String[]{"00-01","01-02","02-03","04-05","05-06","06-07","07-08"
        //    ,"08-09","09-10","10-11","11-12","12-13","13-14","14-15","15-16","16-17","17-18"
        //    ,"18-19","19-20","20-21","21-22","22-23","23-24"};

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Spinner spinner=(Spinner)findViewById(R.id.spinner2);
       // spinner.setAdapter(new CustomAdapter(this,R.layout.spinner2,values));

        return inflater.inflate(R.layout.fragment_time, container, false);
    }

   // @Override
   // public void onClick(View v) {

   // }
}
