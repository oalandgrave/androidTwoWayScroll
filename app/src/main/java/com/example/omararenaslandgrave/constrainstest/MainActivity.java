package com.example.omararenaslandgrave.constrainstest;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        Button primero = new Button(this);
        primero.setText("Primer");

        this.constraintLayout = new ConstraintLayout(this);
        this.constraintLayout.setLayoutParams( new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT));
        ConstraintSet mConstraintSet = new ConstraintSet();

        mConstraintSet.connect( primero.getId() , ConstraintSet.TOP  , ConstraintSet.PARENT_ID, ConstraintSet.TOP , 400);
        mConstraintSet.connect(primero.getId() , ConstraintSet.START , ConstraintSet.PARENT_ID, ConstraintSet.START , 350);
        //star es left
        //end es rifght


        mConstraintSet.constrainWidth(primero.getId() , ConstraintSet.WRAP_CONTENT);
        mConstraintSet.constrainHeight(primero.getId() , mConstraintSet.WRAP_CONTENT);

        this.constraintLayout.addView(primero);
        mConstraintSet.applyTo(constraintLayout);
        setContentView(constraintLayout);
    }
}
