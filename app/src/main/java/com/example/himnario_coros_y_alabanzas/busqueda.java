package com.example.himnario_coros_y_alabanzas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class busqueda extends AppCompatActivity {

    Dto datos = new Dto();

    boolean estadoGuardar = false;
    boolean estadoEliminar = false;

    private ProgressDialog pd;
    AlertDialog.Builder dialogo1;
    AlertDialog.Builder dialogo;
    ProgressDialog progressDialog;

    //List<Productos> productosList;
    //List<> productosList;
    ProductsAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
    }
}
