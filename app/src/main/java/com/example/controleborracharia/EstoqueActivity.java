package com.example.controleborracharia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AutoText;
import android.view.View;
import android.widget.Button;

public class EstoqueActivity extends AppCompatActivity {

    private Button btnPesquisar,btnLancarPneus,btnLancarRefroma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estoque);

        btnPesquisar=findViewById(R.id.buttonPesquisar);
        btnLancarPneus=findViewById(R.id.buttonLancarPneu);
        btnLancarRefroma=findViewById(R.id.buttonLancarReforma);


        btnLancarPneus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LancamentoActivity.class);
                startActivity(intent);



            }
        });




    }
}
