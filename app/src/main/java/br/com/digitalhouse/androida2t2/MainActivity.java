package br.com.digitalhouse.androida2t2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextAddress;
    EditText editTextProfession;
    Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextProfession = findViewById(R.id.editTextProfession);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String endereco = editTextAddress.getText().toString();
                String profissao = editTextProfession.getText().toString();

                if (nome.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
                } else if (!email.contains("@")) {
                    Toast.makeText(MainActivity.this, "E-mail invalido!", Toast.LENGTH_SHORT).show();
                } else if (endereco.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o campo endereço", Toast.LENGTH_SHORT).show();
                } else if (profissao.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o campo profissão", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Dados Ok", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
