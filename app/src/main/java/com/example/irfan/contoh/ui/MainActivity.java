package com.example.irfan.contoh.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.irfan.contoh.R;

public class MainActivity extends AppCompatActivity {
    private EditText nama ;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Belajar Huruf Vokal ");

        nama = (EditText) findViewById(R.id.edit);
        btn =  (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam = nama.getText().toString();
            //    Toast.makeText(MainActivity.this, nam ,Toast.LENGTH_LONG).show();
                mulai(nam);


            }
        });

    }

   private void mulai(String nam){
        Intent intent = new Intent(this, HalamanAwalActivity.class);
        intent.putExtra(getString(R.string.key_name), nam);
        startActivity(intent);
   }

    @Override
    protected void onResume() {
        super.onResume();
        nama.setText("");
    }
}
