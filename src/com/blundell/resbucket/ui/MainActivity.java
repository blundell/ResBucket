package com.blundell.resbucket.ui;

import com.blundell.resbucket.Constants;
import com.blundell.resbucket.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(Constants.DEBUG){
        	findViewById(R.id.debug_drawable).setVisibility(View.VISIBLE);
        }
    }
}