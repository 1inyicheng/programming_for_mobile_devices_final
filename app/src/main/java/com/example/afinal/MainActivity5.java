package com.example.afinal;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void button_re(View view)
    {
        EditText et_min = (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText et_max = (EditText) findViewById(R.id.editTextNumberDecimal3);
        if(et_min.getText().toString().equals("") || et_max.getText().toString().equals(""))
        {

        }
        else
        {
            int min = Integer.parseInt(et_min.getText().toString());
            int max = Integer.parseInt(et_max.getText().toString());;
            TextView tv = (TextView) findViewById(R.id.textView11);
            tv.setText(Integer.toString(((int)(Math.random() * (max - min + 1)) + min)));
        }
    }
}