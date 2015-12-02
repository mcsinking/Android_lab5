package com.lab5.mcsin.lab5;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity
{
    //Declare variables here - inside the class but outside of any function
    //to make them accessible to other functions. Make them private so that
    //no other class can manipulate their values(only this class's functions
    //can manipulate the values)

    private EditText input1;
    private TextView output1;
    private  TextView output2;
    private  Button button1;

    @Override
    public void onCreate(Bundle savedData)
    {
        super.onCreate(savedData);
        setContentView(R.layout.activity_main);
        // Create and initialize the layout
       LinearLayout myLayout = (LinearLayout)findViewById(R.id.root);

        //Instantiate the controls (create them in memory)
        input1 = (EditText)findViewById(R.id.input_1);
        output1 = (TextView)findViewById(R.id.output_1);
        output2 = (TextView)findViewById(R.id.output_2);

//        button1 = new Button(this);
        button1=(Button)findViewById(R.id.button1);

        //add a click listener to the button
        button1.setOnClickListener(myListener);

    }

    //Create an onClickListener object
    private OnClickListener myListener = new OnClickListener()
    {
        @Override
        public void onClick(View v) {
            // Do something here
            output1.setText("The teaspoons of number are:"+input1.getText());
            int tablespoons=Integer.parseInt(input1.getText().toString())+3;
            output2.setText("The tablespoons of number are:"+tablespoons);
        }

    };

}
