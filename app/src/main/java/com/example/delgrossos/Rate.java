package com.example.delgrossos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rate extends AppCompatActivity {

    EditText yeetBalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        yeetBalls = (EditText) findViewById(R.id.rateFeedbckInput);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        HomeBttnFragment hb = new HomeBttnFragment();
        ft.add(R.id.rateContainer, hb);
        ft.commit();
    }

    public void createFeedback (View view) {
        SharedPreferences eteranlMeatbeallz = getSharedPreferences("spagetPeople", MODE_PRIVATE); //eternalMeatballz is the sharedPref object instantiated name. spagetPeople is the file
        SharedPreferences.Editor freditMercury = eteranlMeatbeallz.edit(); //instantiate editor via the noodleUser
        freditMercury.putString("sauceySecrets", yeetBalls.getText().toString());  //saves the input from the layout as string in the variable "noodleUsers", aka username. noodleUsers lives in spagetPeople
        freditMercury.apply();
        Toast.makeText(this, "Thank you for this input, may his noodliness bless you", Toast.LENGTH_LONG).show();

    }

    /*public void returnFeedback (View view){
        EditText et = findViewById(R.id.rateFeedbckInput); //find the text box by its id. EditText is a new object that holds the id of the inputbox on the layout
        Intent intent = new Intent(this, MainActivity.class); //returns to homepage
        intent.putExtra("comment", et.getText().toString()); //converts input to string and puts it in an intent to carry to main activity
        startActivity(intent);
    }*/
}

