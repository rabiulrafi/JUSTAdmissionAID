package com.example.dell.justadmissionaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView seatplan, results, info, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seatplan=(CardView)findViewById(R.id.Seatplan);
        results= (CardView)findViewById(R.id.Results);
        info= (CardView)findViewById(R.id.Info);
        about=(CardView)findViewById(R.id.About);

        seatplan.setOnClickListener(this);
        results.setOnClickListener(this);
        info.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
         switch (v.getId())
         {
             case R.id.Seatplan: i = new Intent(this,SeatPlan.class); startActivity(i); break;
             case R.id.Results: i = new Intent(this, Results.class);startActivity(i); break;
             case R.id.Info: i= new Intent(this, Info.class); startActivity(i); break;
             case R.id.About: i = new Intent(this, About.class); startActivity(i); break;
             default:break;


         }

    }
}
