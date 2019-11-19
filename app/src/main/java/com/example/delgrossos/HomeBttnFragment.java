package com.example.delgrossos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeBttnFragment extends Fragment {


    public HomeBttnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatBoi = inflater.inflate(R.layout.fragment_home_bttn, container, false); //instantiate the layout
        Button theGuy = inflatBoi.findViewById(R.id.homeBttn); //instantiate button object, set reference to button in inflated layout

        theGuy.setOnClickListener(new View.OnClickListener() {  //set click listener programmatically to the button(that holds the reference)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class); //create intent to go to main activity
                startActivity(intent);
            }
        });

        return inflatBoi; //this is important. This object


    }

    /*public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/
}
