package uk.ac.westminster.cs.carapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class IdentifyCarMake extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button btnSubmit;
    Spinner spin;
    ImageView img;
    TextView carNameDisplay;

    int randomCarIndex = (int) (Math.random() * (32));

    Integer[] carImages = {
            R.drawable.alfaromeo_mito,
            R.drawable.audi_a1,
            R.drawable.bentleycar,
            R.drawable.bmw3series,
            R.drawable.citroen_c3,
            R.drawable.citroen_c4,
            R.drawable.citroen_ds4s,
            R.drawable.ferraricar,
            R.drawable.fiat500,
            R.drawable.fordfocus,
            R.drawable.hondacar,
            R.drawable.hyundai,
            R.drawable.jaguar,
            R.drawable.jeepcar,
            R.drawable.kiagt,
            R.drawable.lamborghini,
            R.drawable.landrover,
            R.drawable.lexus,
            R.drawable.minicooper,
            R.drawable.mitsubishi,
            R.drawable.nissan,
            R.drawable.peugeot,
            R.drawable.peugeot_e2008,
            R.drawable.rangerover,
            R.drawable.renault,
            R.drawable.seat,
            R.drawable.smartcar,
            R.drawable.suzukiswift,
            R.drawable.tesla,
            R.drawable.toyotacar,
            R.drawable.vauxhallcorsa,
            R.drawable.volkswagonpolo,
            R.drawable.volvocar
    };

    String[] carAnswers = {
            "Alfa Romeo Mito",
            "Audi A1",
            "Bentley",
            "BMW 3 Series",
            "Citroen C3",
            "Citroen C4",
            "Citroen DS 4S",
            "Ferrari",
            "Fiat 500",
            "Ford Focus",
            "Honda",
            "Hyundai",
            "Jaguar",
            "Jeep",
            "Kia GT",
            "Lamborghini",
            "Land Rover",
            "Lexus",
            "Mini Cooper",
            "Mitsubishi",
            "Nissan",
            "Peugeot",
            "Peugeot e2008",
            "Range Rover",
            "Renault",
            "Seat",
            "Smart",
            "Suzuki Swift",
            "Tesla",
            "Toyota",
            "Vauxhall Corsa",
            "Volkswagon Polo",
            "Volvo"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_car_make);

        img = (ImageView) findViewById(R.id.CarMakeImage);
        carNameDisplay = (TextView) findViewById(R.id.DisplayCarMakeName);
        btnSubmit = (Button) findViewById(R.id.btnSubmitCarMake);
        spin = (Spinner) findViewById(R.id.CarMakeSpinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.CarImages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);


        img.setImageResource(carImages[randomCarIndex]);
        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String usersAnswer = spin.getSelectedItem().toString();


                if (carAnswers[randomCarIndex].equals(usersAnswer)) {
                    ((TextView) findViewById(R.id.IdentifyVerdict)).setText("CORRECT!");
                    ((TextView) findViewById(R.id.IdentifyVerdict)).setTextColor(Color.rgb(0, 255, 0));
                    //((TextView) findViewById(R.id.DisplayCarMakeName)).setText((CharSequence) carNameDisplay);
                    ((TextView) findViewById(R.id.DisplayCarMakeName)).setTextColor(Color.rgb(0, 255, 0));

                }

                if (!carAnswers[randomCarIndex].equals(usersAnswer)){
                    ((TextView) findViewById(R.id.IdentifyVerdict)).setText("INCORRECT");
                    //((TextView) findViewById(R.id.))
                    ((TextView) findViewById(R.id.IdentifyVerdict)).setTextColor(Color.rgb(255, 0, 0));

//new Handler().postDelayed(new Runnable() {
//Override
//public void run() {
                    //finish();
                    //startActivity(getIntent());
                    //}
                    //}, 5000);
                }

                btnSubmit.setVisibility(View.GONE);

            }
        });

    };

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void showNext(View view){
                finish();
                startActivity(getIntent());
    }


}



