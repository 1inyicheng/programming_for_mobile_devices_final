package com.example.afinal;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    int r = (int)(Math.random() * 101); // 0 to 100
    int min = 1;
    int max = 100;
    public void button_Click(View view)
    {
        EditText et = (EditText) findViewById(R.id.editTextNumberDecimal);
        int g = Integer.parseInt(et.getText().toString());
        //Toast.makeText(this, ""+r, Toast.LENGTH_SHORT).show(); // debug
        //Toast.makeText(this, ""+g, Toast.LENGTH_SHORT).show(); // debug
        if(g<r)
        {
            min=g;
            TextView tv_min = (TextView) findViewById(R.id.textView5);
            tv_min.setText(Integer.toString(min));
        }
        else if(g>r)
        {
            max=g;
            TextView tv_max = (TextView) findViewById(R.id.textView6);
            tv_max.setText(Integer.toString(max));
        }
        else if(g==r)
        {
            TextView tv = (TextView) findViewById(R.id.textView7);
            tv.setText("The answer is "+r);
        }
        else
        {

        }
    }
    public void button_re(View view)
    {
        TextView tv = (TextView) findViewById(R.id.textView7);
        tv.setText("The answer is");
        TextView tv_min = (TextView) findViewById(R.id.textView5);
        TextView tv_max = (TextView) findViewById(R.id.textView6);
        tv_min.setText("1");
        tv_max.setText("100");
        EditText et = (EditText) findViewById(R.id.editTextNumberDecimal);
        et.setText("");
        int min = 1;
        int max = 100;
        r = (int)(Math.random() * 101); // 0 to 100
    }
}