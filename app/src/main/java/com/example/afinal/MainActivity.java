package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void button_Click(View view)
    {
        EditText et_acc = (EditText) findViewById(R.id.editTextText);
        EditText et_pw = (EditText) findViewById(R.id.editTextText2);
        if(et_acc.getText().toString().equals("test") && et_pw.getText().toString().equals("test"))
        {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        else // debug
        {
            //Toast.makeText(this, ""+et_acc.getText().toString().equals("test")+" "+et_pw.toString().toString().equals("test"), Toast.LENGTH_SHORT).show();
        }
    }
}