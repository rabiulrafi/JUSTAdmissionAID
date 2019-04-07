package com.example.dell.justadmissionaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SeatPlan extends AppCompatActivity {

    public EditText roll;
    public Button query_button;
    public TextView result_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_plan);

        roll= (EditText)findViewById(R.id.roll);
        query_button= (Button)findViewById(R.id.query);
        result_name= (TextView) findViewById(R.id.name);

        query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseAccess databaseAccess= DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                String r=roll.getText().toString();
                String name= databaseAccess.getName(r);

                result_name.setText(name);
                databaseAccess.close();
            }
        });
    }
}
