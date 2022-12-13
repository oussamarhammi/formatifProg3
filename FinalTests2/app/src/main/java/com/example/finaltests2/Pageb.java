package com.example.finaltests2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finaltests2.databinding.ActivityMainBinding;
import com.example.finaltests2.databinding.PagebBinding;

public class Pageb extends Activity {
    private PagebBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("pageb");
        setContentView(R.layout.pageb);

        binding = PagebBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.button2.setOnClickListener(view3 -> {
            {

                Intent i = new Intent(this,Recycle.class);
                startActivity(i);
            }
        });
    }
}