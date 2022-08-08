package uk.ac.westminster.cs.carapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IdentifyCarImage extends AppCompatActivity {
    ImageView pickCarImage1;
    ImageView pickCarImage2;
    ImageView pickCarImage3;
    String imageAnswer;
    TextView carImageNameDisplay;
    Button btnNext;

    int randomCarIndex1 = (int) (Math.random() * (32));
    int randomCarIndex2 = (int) (Math.random() * (32));
    int randomCarIndex3 = (int) (Math.random() * (32));

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
        setContentView(R.layout.activity_identify_car_image);

        pickCarImage1 = (ImageView) findViewById(R.id.carImageView1);
        pickCarImage2 = (ImageView) findViewById(R.id.carImageView2);
        pickCarImage3 = (ImageView) findViewById(R.id.carImageView3);
        carImageNameDisplay = (TextView) findViewById(R.id.carImageNameDisplay);


        pickCarImage1.setImageResource(carImages[randomCarIndex1]);
        pickCarImage2.setImageResource(carImages[randomCarIndex2]);
        pickCarImage3.setImageResource(carImages[randomCarIndex3]);


        int randomImageIndex = (int) (Math.random() * (3));
        int firstCar = randomCarIndex1;
        int secondCar = randomCarIndex2;
        int thirdCar = randomCarIndex3;

        if (0 == randomImageIndex) {
            carImageNameDisplay.setText(carAnswers[randomCarIndex1]);
            imageAnswer=carAnswers[randomCarIndex1].toString();
        } else if (1 == randomImageIndex) {
            carImageNameDisplay.setText(carAnswers[randomCarIndex2]);
            imageAnswer=carAnswers[randomCarIndex2].toString();
        } else if (2 == randomImageIndex) {
            carImageNameDisplay.setText(carAnswers[randomCarIndex3]);
            imageAnswer=carAnswers[randomCarIndex3].toString();
        }




        pickCarImage1 = findViewById(R.id.carImageView1);
        pickCarImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomImageIndex == 0) {
                    ((TextView) findViewById(R.id.carImageResult)).setText("CORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(0, 255, 0));
                } else {
                    ((TextView) findViewById(R.id.carImageResult)).setText("INCORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(255, 0, 0));
                }
            }


        });

        pickCarImage2 = findViewById(R.id.carImageView2);
        pickCarImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomImageIndex == 1) {
                    ((TextView) findViewById(R.id.carImageResult)).setText("CORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(0, 255, 0));
                } else {
                    ((TextView) findViewById(R.id.carImageResult)).setText("INCORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(255, 0, 0));
                }
            }


        });

        pickCarImage3 = findViewById(R.id.carImageView3);
        pickCarImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomImageIndex == 2) {
                    ((TextView) findViewById(R.id.carImageResult)).setText("CORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(0, 255, 0));
                } else {
                    ((TextView) findViewById(R.id.carImageResult)).setText("INCORRECT!");
                    ((TextView) findViewById(R.id.carImageResult)).setTextColor(Color.rgb(255, 0, 0));
                }
            }


        });



    }

    public void showNext(View view) {
        finish();
        startActivity(getIntent());
    }
}