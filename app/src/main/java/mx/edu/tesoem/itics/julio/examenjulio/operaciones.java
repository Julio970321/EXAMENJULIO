package mx.edu.tesoem.itics.julio.examenjulio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);


    }

    public void llama(View view) {
        Intent intent = new Intent(this, suma.class);
        startActivity(intent);
    }

    public void llamo(View view) {
        Intent intent = new Intent(this, restar.class);
        startActivity(intent);
    }

    public void llame(View view) {
        Intent intent = new Intent(this, potencia.class);
        startActivity(intent);
    }

    public void llami(View view) {
        System.exit(0);
    }
    }
