package mx.edu.tesoem.itics.julio.examenjulio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class saludar extends AppCompatActivity {
    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludar);
        Bundle parametros = this.getIntent().getExtras();


        bienvenida = (TextView) findViewById(R.id.textView3);
        bienvenida.setText("bienvenido " +parametros.getString("nombre").toString());
    }
}
