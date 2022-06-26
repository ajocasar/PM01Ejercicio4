package com.example.pm01ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pm01ejercicio4.Procesos.SQLiteConexion;
import com.example.pm01ejercicio4.Procesos.Transacciones;
import com.example.pm01ejercicio4.Procesos.foto;

import java.util.ArrayList;

public class ActivityFotos extends AppCompatActivity
{
    SQLiteConexion conexion;
    ListView listafotos;
    ArrayList<String> ArregloFotos;
    ArrayList<foto> ArregloPhotos;
    Button btnPhotos;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);

        lista = (ListView) findViewById(R.id.listafotos);

        btnPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    conexion = new SQLiteConexion(this, Transacciones.NameDataBase, null, 1);
    listafotos = (ListView) findViewById(R.id.listafotos);

    }
}