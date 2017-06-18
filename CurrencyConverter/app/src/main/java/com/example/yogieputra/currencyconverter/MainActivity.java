package com.example.yogieputra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmounEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmounEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.75;
        Toast.makeText(MainActivity.this, String.format("%.2f", poundAmount) + " Pounds", Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmounEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
