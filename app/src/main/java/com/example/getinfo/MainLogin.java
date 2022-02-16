package com.example.getinfo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.getinfo.databinding.ActivityMainLoginBinding;

public class MainLogin extends AppCompatActivity {

    ActivityMainLoginBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Click Action for Admin Button
        binding.adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Admin",Toast.LENGTH_SHORT).show();
            }
        });

        //Click Action for User Button
        binding.userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"User",Toast.LENGTH_SHORT).show();
            }
        });


        //Click Action for Request Button
        binding.requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Request",Toast.LENGTH_SHORT).show();
            }
        });


        //Click Action for About Button
        binding.aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_SHORT).show();
            }
        });

    }
}