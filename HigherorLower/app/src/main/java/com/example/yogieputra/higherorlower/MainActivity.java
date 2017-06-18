package com.example.yogieputra.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;


    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }


    public void btnClick(View view){
        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        int guessInt = Integer.parseInt(numberEditText.getText().toString());

        if (guessInt > randomNumber){
            makeToast("Higher! The random number is: " + randomNumber);
        } else if (guessInt < randomNumber) {
            makeToast("Lower! The random number is: " + randomNumber);
        } else {
            makeToast("That's right! Try again!");

            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
