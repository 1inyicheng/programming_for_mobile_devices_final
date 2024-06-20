package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void button_Click_sp(View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void button_Click_upg(View view)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void button_Click_rd(View view)
    {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void button_Click_cal(View view)
    {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}