package com.accounthub.accounthub11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para cambiar de pagina
    public void follow (View view)
    {
        Intent followUp = new Intent(this, Loading.class);
        startActivity(followUp);
    }
}