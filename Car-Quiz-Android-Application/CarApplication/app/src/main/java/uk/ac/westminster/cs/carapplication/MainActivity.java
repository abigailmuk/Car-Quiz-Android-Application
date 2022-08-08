package uk.ac.westminster.cs.carapplication;
//Importing required classes
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Initialising buttons
    Button btnIdentifyCarMake;
    Button btnHints;
    Button btnIdentifyCarImage;
    Button btnAdvancedLevel;


    //The onCreate function which will start the application created upon opening the application
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //------------------------------Creating the buttons to open new activities------------------------------------------/

        // Activity 1 - Make a button which opens the activity called "Identify the Car Make"
        btnIdentifyCarMake = (Button) findViewById(R.id.btnIdentifyCarMake);
        //Identify the Car Make button event listener
        btnIdentifyCarMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call the function which will open Activity Class, "IdentifyCarMake"
                openIdentifyCarMake();
            }
        });


        // Activity 1 - Make a button which opens the activity called "Hints"
        btnHints = (Button) findViewById(R.id.btnHints);
        //Hints button event listener
        btnHints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call the function which will open Activity Class, "Hints"
                openHints();
            }
        });


        // Activity 1 - Make a button which opens the activity called "Identify the Car Image"
        btnIdentifyCarImage = (Button) findViewById(R.id.btnIdentifyCarImage);
        //Identify the Car Image button event listener
        btnIdentifyCarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call the function which will open Activity Class, "IdentifyCarImage"
                openIdentifyCarImage();
            }
        });

        // Activity 1 - Make a button which opens the activity called "Advanced Level"
        btnAdvancedLevel = (Button) findViewById(R.id.btnAdvancedLevel);
        //Advanced Level button event listener
        btnAdvancedLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call the function which will open Activity Class, "Advanced Level"
                openAdvancedLevel();
            }
        });

    }

    //------------------------------Opening new activity functions------------------------------------------/

    //The function which will open a new activity - this activity is "Identify the Car Make"
    public void openIdentifyCarMake(){
        //An intent which will open the activity class, "Identify the Car Make"
        Intent intent = new Intent(this, IdentifyCarMake.class);
        startActivity(intent);
    }

    //The function which will open a new activity - this activity is "Hints"
    public void openHints(){
        //An intent which will open the activity class, "Hints"
        Intent intent = new Intent(this, Hints.class);
        startActivity(intent);
    }

    //The function which will open a new activity - this activity is "Identify the Car Image"
    public void openIdentifyCarImage(){
        //An intent which will open the activity class, "Identify the Car Image"
        Intent intent = new Intent(this, IdentifyCarImage.class);
        startActivity(intent);
    }

    //The function which will open a new activity - this activity is "Advanced Level"
    public void openAdvancedLevel(){
        //An intent which will open the activity class, "Advanced Level"
        Intent intent = new Intent(this, AdvancedLevel.class);
        startActivity(intent);
    }
}