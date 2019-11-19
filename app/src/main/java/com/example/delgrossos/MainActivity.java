package com.example.delgrossos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    TextView dynamicUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences eteranlMeatbeallz = getSharedPreferences("spagetPeople", MODE_PRIVATE);
        //String carryOver = getIntent().getStringExtra("comment"); //sets string from the rating page
        String carryOver = eteranlMeatbeallz.getString("sauceySecrets", "Pastafarian");

        TextView dynamicUser = (TextView) findViewById(R.id.dynamicUsertxtBx);
        dynamicUser.setText(eteranlMeatbeallz.getString("noodleUsers", "Pastafarian"));

        FragmentManager fm = getSupportFragmentManager(); //initiate fragment manger to bring in a fragment
        FragmentTransaction ft = fm.beginTransaction(); //starts a new fragment that uses the instantiated fragment manager

        CommentFragment workPlease = new CommentFragment(carryOver);
        ft.add(R.id.MainActivityContainer, workPlease);
        ft.commit();

    }

    public void OpenRateMe (View view) {    //listener for rate me page. Apply class to rate me button's "onclick"
        Intent intent = new Intent(this, Rate.class);
        startActivity(intent);
    }

    public void OpenAboutMe (View view) {    //listener for about me page. Apply class to about me button's "onclick"
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
    public void OpenLogin (View view) {    //listener for about me page. Apply class to about me button's "onclick"
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
