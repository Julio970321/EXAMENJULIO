package mx.edu.tesoem.itics.julio.examenjulio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button saludobtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        saludobtn = (Button) findViewById(R.id.saludobtn);
        saludobtn.setOnClickListener(this);


    }

    public void onClick(View view) {
        Toast.makeText(this, "hola k hace", Toast.LENGTH_LONG).show();
        saludobtn.setEnabled(true);}



    public void operaciones(View view) {
        Intent intent = new Intent(this,operaciones.class);
        startActivity(intent);
    }


}
