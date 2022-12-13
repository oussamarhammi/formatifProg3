package com.example.finaltests2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finaltests2.databinding.RecycleBinding;

public class Recycle  extends AppCompatActivity {
    private RecycleBinding binding;
    RecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = RecycleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        this.initRecycler();
        this.remplirRecycler();
        binding.recyclerView.setOnClickListener(view3 -> {
            {

                Intent i = new Intent(this,Pageb.class);
                startActivity(i);
            }
        });
    }
    private void remplirRecycler() {
        for (int i = 0 ; i < 101 ; i++) {



            Nomr listNombre =  new Nomr();
            listNombre.nombre = i;
            adapter.list.add(listNombre);

        }

        adapter.notifyDataSetChanged();
    }



    private void initRecycler() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new RecycleAdapter();
        recyclerView.setAdapter(adapter);
    }
}
