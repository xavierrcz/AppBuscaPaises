package com.example.appbuscapaises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appbuscapaises.controller.PaisController;

public class MainActivity extends AppCompatActivity {



    private LinearLayout lnTitulo;
    private TextView tvCodigo;
    private TextView tvDesc;
    private Button btSalvar;

    private RecyclerView rvPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       PaisController.getViaEndereco("1058",rvPaises);

    }
}