package com.example.delgrossos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CommentFragment extends Fragment {

    private String tacoMonkey;

    public CommentFragment(String gir){
        this.tacoMonkey = gir;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View inflatorZim = inflater.inflate(R.layout.fragment_comment, container, false);
        TextView dib = inflatorZim.findViewById(R.id.comntFragFdbckTxt);
        dib.setText(this.tacoMonkey);



        return inflatorZim;
        //return inflater.inflate(R.layout.fragment_comment, container, false);
    }
}











