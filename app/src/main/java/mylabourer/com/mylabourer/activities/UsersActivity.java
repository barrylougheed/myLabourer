package mylabourer.com.mylabourer.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import mylabourer.com.mylabourer.R;

/**
 * Created by barry on 29/08/2017.
 */

public class UsersActivity extends AppCompatActivity{

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        String nameFromIntent  = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome"+ nameFromIntent);
    }





}
