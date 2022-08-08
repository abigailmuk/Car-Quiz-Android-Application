package uk.ac.westminster.cs.carapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class AdvancedLevel extends AppCompatActivity {
    ImageView ivGuess_car_name1;
    ImageView ivGuess_car_name2;
    ImageView ivGuess_car_name3;

    EditText edtGuess_car_name1;
    EditText edtGuess_car_name2;
    EditText edtGuess_car_name3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_level);

        edtGuess_car_name1 = findViewById(R.id.edtGuess_car_name1);
        edtGuess_car_name2 = findViewById(R.id.edtGuess_car_name2);
        edtGuess_car_name3 = findViewById(R.id.edtGuess_car_name3);

        String guessCarName1 = edtGuess_car_name1.getText().toString().trim();
        String guessCarName2 = edtGuess_car_name2.getText().toString().trim();
        String guessCarName3 = edtGuess_car_name3.getText().toString().trim();

        ivGuess_car_name1 = findViewById(R.id.guessImageView1);
        ivGuess_car_name2 = findViewById(R.id.guessImageView2);
        ivGuess_car_name3 = findViewById(R.id.guessImageView3);
    }




}