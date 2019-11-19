package com.example.delgrossos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    private String dasInput = "";
    EditText sadSpagetBoi;
    TextView whoAmEye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        sadSpagetBoi = (EditText) findViewById(R.id.loginInputBox); //creates refernce to the input text box on the layout
        whoAmEye = (TextView) findViewById(R.id.displayUserTxtBox);

        SharedPreferences eteranlMeatbeallz = getSharedPreferences("spagetPeople", MODE_PRIVATE);
        // String rocknRamen = eteranlMeatbeallz.getString("noodleUsers", "Pastafarian");
        whoAmEye.setText(eteranlMeatbeallz.getString("noodleUsers", "Pastafarian"));

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        HomeBttnFragment hb = new HomeBttnFragment();
        ft.add(R.id.loginContainer, hb);
        ft.commit();
    }

    public void createUser (View view) {
        SharedPreferences eteranlMeatbeallz = getSharedPreferences("spagetPeople", MODE_PRIVATE); //eternalMeatballz is the sharedPref object instantiated name. spagetPeople is the file
        SharedPreferences.Editor freditMercury = eteranlMeatbeallz.edit(); //instantiate editor via the noodleUser
        freditMercury.putString("noodleUsers", sadSpagetBoi.getText().toString()); //saves the input from the layout as string in the variable "noodleUsers", aka username. noodleUsers lives in spagetPeople
        freditMercury.apply();
        Toast.makeText(this, "Praise the noodle, you are now one of us!", Toast.LENGTH_LONG).show();
    }

    public void displayUser (View view) {
        SharedPreferences eteranlMeatbeallz = getSharedPreferences("spagetPeople", MODE_PRIVATE);
       // String rocknRamen = eteranlMeatbeallz.getString("noodleUsers", "Pastafarian");
        whoAmEye.setText(eteranlMeatbeallz.getString("noodleUsers", "Pastafarian"));
    }

}

