package com.example.afinal;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity implements TextWatcher {

    private EditText et_4;
    private EditText et_5;
    private EditText et_6;
    private EditText et_7;
    private EditText et_8;
    private EditText et_9;
    private EditText et_10;
    private EditText et_11;
    private EditText et_12;
    private EditText et_13;
    private EditText et_14;
    private EditText et_15;
    private EditText et_16;
    private EditText et_17;
    private EditText et_18;
    private EditText et_19;
    private EditText et_20;
    private EditText et_21;
    private EditText et_22;
    private EditText et_23;
    private EditText et_24;
    private EditText et_25;
    private EditText et_26;
    private EditText et_27;
    private EditText et_28;
    private EditText et_29;
    private EditText et_30;
    private EditText et_31;
    private EditText et_32;
    private EditText et_33;
    private EditText et_34;
    private EditText et_35;
    private EditText et_36;
    private EditText et_37;
    private EditText et_38;
    private EditText et_39;
    private EditText et_40;
    private EditText et_41;
    private EditText et_42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et_4 = (EditText) findViewById(R.id.editTextNumberDecimal4);
        et_5 = (EditText) findViewById(R.id.editTextNumberDecimal5);
        et_6 = (EditText) findViewById(R.id.editTextNumberDecimal6);
        et_7 = (EditText) findViewById(R.id.editTextNumberDecimal7);
        et_8 = (EditText) findViewById(R.id.editTextNumberDecimal8);
        et_9 = (EditText) findViewById(R.id.editTextNumberDecimal9);
        et_10 = (EditText) findViewById(R.id.editTextNumberDecimal10);
        et_11 = (EditText) findViewById(R.id.editTextNumberDecimal11);
        et_12 = (EditText) findViewById(R.id.editTextNumberDecimal12);
        et_13 = (EditText) findViewById(R.id.editTextNumberDecimal13);
        et_14 = (EditText) findViewById(R.id.editTextNumberDecimal14);
        et_15 = (EditText) findViewById(R.id.editTextNumberDecimal15);
        et_16 = (EditText) findViewById(R.id.editTextNumberDecimal16);
        et_17 = (EditText) findViewById(R.id.editTextNumberDecimal17);
        et_18 = (EditText) findViewById(R.id.editTextNumberDecimal18);
        et_19 = (EditText) findViewById(R.id.editTextNumberDecimal19);
        et_20 = (EditText) findViewById(R.id.editTextNumberDecimal20);
        et_21 = (EditText) findViewById(R.id.editTextNumberDecimal21);
        et_22 = (EditText) findViewById(R.id.editTextNumberDecimal22);
        et_23 = (EditText) findViewById(R.id.editTextNumberDecimal23);
        et_24 = (EditText) findViewById(R.id.editTextNumberDecimal24);
        et_25 = (EditText) findViewById(R.id.editTextNumberDecimal25);
        et_26 = (EditText) findViewById(R.id.editTextNumberDecimal26);
        et_27 = (EditText) findViewById(R.id.editTextNumberDecimal27);
        et_28 = (EditText) findViewById(R.id.editTextNumberDecimal28);
        et_29 = (EditText) findViewById(R.id.editTextNumberDecimal29);
        et_30 = (EditText) findViewById(R.id.editTextNumberDecimal30);
        et_31 = (EditText) findViewById(R.id.editTextNumberDecimal31);
        et_32 = (EditText) findViewById(R.id.editTextNumberDecimal32);
        et_33 = (EditText) findViewById(R.id.editTextNumberDecimal33);
        et_34 = (EditText) findViewById(R.id.editTextNumberDecimal34);
        et_35 = (EditText) findViewById(R.id.editTextNumberDecimal35);
        et_36 = (EditText) findViewById(R.id.editTextNumberDecimal36);
        et_37 = (EditText) findViewById(R.id.editTextNumberDecimal37);
        et_38 = (EditText) findViewById(R.id.editTextNumberDecimal38);
        et_39 = (EditText) findViewById(R.id.editTextNumberDecimal39);
        et_40 = (EditText) findViewById(R.id.editTextNumberDecimal40);
        et_41 = (EditText) findViewById(R.id.editTextNumberDecimal41);
        et_42 = (EditText) findViewById(R.id.editTextNumberDecimal42);
        et_4.addTextChangedListener(this);
        et_5.addTextChangedListener(this);
        et_6.addTextChangedListener(this);
        et_7.addTextChangedListener(this);
        et_8.addTextChangedListener(this);
        et_9.addTextChangedListener(this);
        et_10.addTextChangedListener(this);
        et_11.addTextChangedListener(this);
        et_12.addTextChangedListener(this);
        et_13.addTextChangedListener(this);
        et_14.addTextChangedListener(this);
        et_15.addTextChangedListener(this);
        et_16.addTextChangedListener(this);
        et_17.addTextChangedListener(this);
        et_18.addTextChangedListener(this);
        et_19.addTextChangedListener(this);
        et_20.addTextChangedListener(this);
        et_21.addTextChangedListener(this);
        et_22.addTextChangedListener(this);
        et_23.addTextChangedListener(this);
        et_24.addTextChangedListener(this);
        et_25.addTextChangedListener(this);
        et_26.addTextChangedListener(this);
        et_27.addTextChangedListener(this);
        et_28.addTextChangedListener(this);
        et_29.addTextChangedListener(this);
        et_30.addTextChangedListener(this);
        et_31.addTextChangedListener(this);
        et_32.addTextChangedListener(this);
        et_33.addTextChangedListener(this);
        et_34.addTextChangedListener(this);
        et_35.addTextChangedListener(this);
        et_36.addTextChangedListener(this);
        et_37.addTextChangedListener(this);
        et_38.addTextChangedListener(this);
        et_39.addTextChangedListener(this);
        et_40.addTextChangedListener(this);
        et_41.addTextChangedListener(this);
        et_42.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        listen_count();
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    double sum = .0;
    public void listen_count()
    {
        sum=0;
        double[] cal_count = {.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0,.0};
        if(!(et_4.getText().toString().equals("")) && !et_4.getText().toString().equals(".")) {cal_count[0] = Double.parseDouble(et_4.getText().toString())/30.0*105.0;} else {cal_count[0] = .0;}
        if(!(et_5.getText().toString().equals("")) && !et_5.getText().toString().equals(".")) {cal_count[1] = Double.parseDouble(et_5.getText().toString())/30.0*165.0;} else {cal_count[1] = .0;}
        if(!(et_6.getText().toString().equals("")) && !et_6.getText().toString().equals(".")) {cal_count[2] = Double.parseDouble(et_6.getText().toString())/30.0*96.0;} else {cal_count[2] = .0;}
        if(!(et_7.getText().toString().equals("")) && !et_7.getText().toString().equals(".")) {cal_count[3] = Double.parseDouble(et_7.getText().toString())/30.0*252.0;} else {cal_count[3] = .0;}
        if(!(et_8.getText().toString().equals("")) && !et_8.getText().toString().equals(".")) {cal_count[4] = Double.parseDouble(et_8.getText().toString())/30.0*246.0;} else {cal_count[4] = .0;}
        if(!(et_9.getText().toString().equals("")) && !et_9.getText().toString().equals(".")) {cal_count[5] = Double.parseDouble(et_9.getText().toString())/30.0*381.0;} else {cal_count[5] = .0;}
        if(!(et_10.getText().toString().equals("")) && !et_10.getText().toString().equals(".")) {cal_count[6] = Double.parseDouble(et_10.getText().toString())/30.0*120.0;} else {cal_count[6] = .0;}
        if(!(et_11.getText().toString().equals("")) && !et_11.getText().toString().equals(".")) {cal_count[7] = Double.parseDouble(et_11.getText().toString())/30.0*111.0;} else {cal_count[7] = .0;}
        if(!(et_12.getText().toString().equals("")) && !et_12.getText().toString().equals(".")) {cal_count[8] = Double.parseDouble(et_12.getText().toString())/30.0*126.0;} else {cal_count[8] = .0;}
        if(!(et_13.getText().toString().equals("")) && !et_13.getText().toString().equals(".")) {cal_count[9] = Double.parseDouble(et_13.getText().toString())/30.0*159.0;} else {cal_count[9] = .0;}
        if(!(et_14.getText().toString().equals("")) && !et_14.getText().toString().equals(".")) {cal_count[10] = Double.parseDouble(et_14.getText().toString())/30.0*222.0;} else {cal_count[10] = .0;}
        if(!(et_15.getText().toString().equals("")) && !et_15.getText().toString().equals(".")) {cal_count[11] = Double.parseDouble(et_15.getText().toString())/30.0*252.0;} else {cal_count[11] = .0;}
        if(!(et_16.getText().toString().equals("")) && !et_16.getText().toString().equals(".")) {cal_count[12] = Double.parseDouble(et_16.getText().toString())/30.0*90.0;} else {cal_count[12] = .0;}
        if(!(et_17.getText().toString().equals("")) && !et_17.getText().toString().equals(".")) {cal_count[13] = Double.parseDouble(et_17.getText().toString())/30.0*93.0;} else {cal_count[13] = .0;}
        if(!(et_18.getText().toString().equals("")) && !et_18.getText().toString().equals(".")) {cal_count[14] = Double.parseDouble(et_18.getText().toString())/30.0*96.0;} else {cal_count[14] = .0;}
        if(!(et_19.getText().toString().equals("")) && !et_19.getText().toString().equals(".")) {cal_count[15] = Double.parseDouble(et_19.getText().toString())/30.0*108.0;} else {cal_count[15] = .0;}
        if(!(et_20.getText().toString().equals("")) && !et_20.getText().toString().equals(".")) {cal_count[16] = Double.parseDouble(et_20.getText().toString())/30.0*108.0;} else {cal_count[16] = .0;}
        if(!(et_21.getText().toString().equals("")) && !et_21.getText().toString().equals(".")) {cal_count[17] = Double.parseDouble(et_21.getText().toString())/30.0*126.0;} else {cal_count[17] = .0;}
        if(!(et_22.getText().toString().equals("")) && !et_22.getText().toString().equals(".")) {cal_count[18] = Double.parseDouble(et_22.getText().toString())/30.0*126.0;} else {cal_count[18] = .0;}
        if(!(et_23.getText().toString().equals("")) && !et_23.getText().toString().equals(".")) {cal_count[19] = Double.parseDouble(et_23.getText().toString())/30.0*141.0;} else {cal_count[19] = .0;}
        if(!(et_24.getText().toString().equals("")) && !et_24.getText().toString().equals(".")) {cal_count[20] = Double.parseDouble(et_24.getText().toString())/30.0*150.0;} else {cal_count[20] = .0;}
        if(!(et_25.getText().toString().equals("")) && !et_25.getText().toString().equals(".")) {cal_count[21] = Double.parseDouble(et_25.getText().toString())/30.0*153.0;} else {cal_count[21] = .0;}
        if(!(et_26.getText().toString().equals("")) && !et_26.getText().toString().equals(".")) {cal_count[22] = Double.parseDouble(et_26.getText().toString())/30.0*153.0;} else {cal_count[22] = .0;}
        if(!(et_27.getText().toString().equals("")) && !et_27.getText().toString().equals(".")) {cal_count[23] = Double.parseDouble(et_27.getText().toString())/30.0*189.0;} else {cal_count[23] = .0;}
        if(!(et_28.getText().toString().equals("")) && !et_28.getText().toString().equals(".")) {cal_count[24] = Double.parseDouble(et_28.getText().toString())/30.0*189.0;} else {cal_count[24] = .0;}
        if(!(et_29.getText().toString().equals("")) && !et_29.getText().toString().equals(".")) {cal_count[25] = Double.parseDouble(et_29.getText().toString())/30.0*204.0;} else {cal_count[25] = .0;}
        if(!(et_30.getText().toString().equals("")) && !et_30.getText().toString().equals(".")) {cal_count[26] = Double.parseDouble(et_30.getText().toString())/30.0*198.0;} else {cal_count[26] = .0;}
        if(!(et_31.getText().toString().equals("")) && !et_31.getText().toString().equals(".")) {cal_count[27] = Double.parseDouble(et_31.getText().toString())/30.0*231.0;} else {cal_count[27] = .0;}
        if(!(et_32.getText().toString().equals("")) && !et_32.getText().toString().equals(".")) {cal_count[28] = Double.parseDouble(et_32.getText().toString())/30.0*252.0;} else {cal_count[28] = .0;}
        if(!(et_33.getText().toString().equals("")) && !et_33.getText().toString().equals(".")) {cal_count[29] = Double.parseDouble(et_33.getText().toString())/30.0*120.0;} else {cal_count[29] = .0;}
        if(!(et_34.getText().toString().equals("")) && !et_34.getText().toString().equals(".")) {cal_count[30] = Double.parseDouble(et_34.getText().toString())/30.0*102.0;} else {cal_count[30] = .0;}
        if(!(et_35.getText().toString().equals("")) && !et_35.getText().toString().equals(".")) {cal_count[31] = Double.parseDouble(et_35.getText().toString())/30.0*111.0;} else {cal_count[31] = .0;}
        if(!(et_36.getText().toString().equals("")) && !et_36.getText().toString().equals(".")) {cal_count[32] = Double.parseDouble(et_36.getText().toString())/30.0*153.0;} else {cal_count[32] = .0;}
        if(!(et_37.getText().toString().equals("")) && !et_37.getText().toString().equals(".")) {cal_count[33] = Double.parseDouble(et_37.getText().toString())/30.0*153.0;} else {cal_count[33] = .0;}
        if(!(et_38.getText().toString().equals("")) && !et_38.getText().toString().equals(".")) {cal_count[34] = Double.parseDouble(et_38.getText().toString())/30.0*177.0;} else {cal_count[34] = .0;}
        if(!(et_39.getText().toString().equals("")) && !et_39.getText().toString().equals(".")) {cal_count[35] = Double.parseDouble(et_39.getText().toString())/30.0*210.0;} else {cal_count[35] = .0;}
        if(!(et_40.getText().toString().equals("")) && !et_40.getText().toString().equals(".")) {cal_count[36] = Double.parseDouble(et_40.getText().toString())/30.0*216.0;} else {cal_count[36] = .0;}
        if(!(et_41.getText().toString().equals("")) && !et_41.getText().toString().equals(".")) {cal_count[37] = Double.parseDouble(et_41.getText().toString())/30.0*342.0;} else {cal_count[37] = .0;}
        if(!(et_42.getText().toString().equals("")) && !et_42.getText().toString().equals(".")) {cal_count[38] = Double.parseDouble(et_42.getText().toString())/30.0*372.0;} else {cal_count[38] = .0;}
        for(double db : cal_count)
            sum+=db;
        TextView tv = (TextView) findViewById(R.id.textView50);
        tv.setText("您消耗"+sum+"大卡");
    }
    public void button_clear_cal(View view)
    {
        et_4.setText("");
        et_5.setText("");
        et_6.setText("");
        et_7.setText("");
        et_8.setText("");
        et_9.setText("");
        et_10.setText("");
        et_11.setText("");
        et_12.setText("");
        et_13.setText("");
        et_14.setText("");
        et_15.setText("");
        et_16.setText("");
        et_17.setText("");
        et_18.setText("");
        et_19.setText("");
        et_20.setText("");
        et_21.setText("");
        et_22.setText("");
        et_23.setText("");
        et_24.setText("");
        et_25.setText("");
        et_26.setText("");
        et_27.setText("");
        et_28.setText("");
        et_29.setText("");
        et_30.setText("");
        et_31.setText("");
        et_32.setText("");
        et_33.setText("");
        et_34.setText("");
        et_35.setText("");
        et_36.setText("");
        et_37.setText("");
        et_38.setText("");
        et_39.setText("");
        et_40.setText("");
        et_41.setText("");
        et_42.setText("");
    }
}