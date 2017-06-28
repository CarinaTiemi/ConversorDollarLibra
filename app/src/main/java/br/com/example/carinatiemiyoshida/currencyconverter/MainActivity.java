package br.com.example.carinatiemiyoshida.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickConvert(View view){
        EditText value = (EditText) findViewById(R.id.valueEditText);
        double aux = Double.parseDouble(value.getText().toString());
        double converter = aux * 0.78;
        Toast.makeText(MainActivity.this,String.format("%.2f",converter)+" pounds", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
