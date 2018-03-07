package co.quindio.sena.ejemplosqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Laboratorio 2");
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"usuarios",null,1);


    }

    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){

            case R.id.btnConsultaListaPersonasRecycler:
                miIntent=new Intent(MainActivity.this,ListaPersonasRecycler.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }

    }
}
