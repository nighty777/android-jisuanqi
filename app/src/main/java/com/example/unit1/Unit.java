package com.example.unit1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class Unit extends AppCompatActivity {
    double mm=0,cm=0,dm=0,m=0,km=0;
    double mm3=0,cm3=0,dm3=0,m3=0;
    String strMm="",strCm="",strDm="",strM="",strKm="";
    String strmm3="",strcm3="",strdm3="",strm3="";
    boolean isMmTouch=true,isCmTouch=false,isDmTouch=false,isMTouch=false,isKmTouch=false;
    boolean mm3touch=true,cm3touch=false,dm3touch=false,m3touch=false;
    private  EditText editText_mm3;
    private  EditText editText_cm3;
    private  EditText editText_dm3;
    private  EditText editText_m3;
    //
    private EditText etMm;
    private  EditText etDm;
    private EditText etCm;
    private EditText etM;
    private EditText etKm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit);
        editText_mm3=findViewById(R.id.editText_mm3);
        editText_cm3=findViewById(R.id.editText_cm3);
        editText_dm3=findViewById(R.id.editText_dm3);
        editText_m3=findViewById(R.id.editText_m3);
        editText_mm3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mm3touch=true;
                cm3touch=false;
                dm3touch=false;
                m3touch=false;
                return false;
            }
        });

        editText_cm3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mm3touch=false;
                cm3touch=true;
                dm3touch=false;
                m3touch=false;
                return false;
            }
        });

        editText_dm3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mm3touch=false;
                cm3touch=false;
                dm3touch=true;
                m3touch=false;
                return false;
            }
        });

        editText_m3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mm3touch=false;
                cm3touch=false;
                dm3touch=false;
                m3touch=true;
                return false;
            }
        });

        editText_mm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(mm3touch){
                    strmm3=editable.toString();
                    if(strmm3.length()==0) strmm3="0";
                    mm3=Double.parseDouble(strmm3);
                    cm3=mm3/1000;
                    dm3=cm3/1000;
                    m3=dm3/1000;
                    editText_cm3.setText(cm3+"");
                    editText_dm3.setText(dm3+"");
                    editText_m3.setText(m3+"");
                }
            }
        });

        editText_cm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(cm3touch){
                    strcm3=editable.toString();
                    if(strcm3.length()==0) strcm3="0";
                    cm3=Double.parseDouble(strcm3);
                    mm3=cm3*1000;
                    dm3=cm3/1000;
                    m3=dm3/1000;
                    editText_mm3.setText(mm3+"");
                    editText_dm3.setText(dm3+"");
                    editText_m3.setText(m3+"");
                }
            }
        });


        editText_dm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(dm3touch){
                    strdm3=editable.toString();
                    if(strdm3.length()==0) strdm3="0";
                    dm3=Double.parseDouble(strdm3);
                    cm3=dm3*1000;
                    mm3=cm3*1000;
                    m3=dm3/1000;
                    editText_mm3.setText(mm3+"");
                    editText_cm3.setText(cm3+"");
                    editText_m3.setText(m3+"");
                }
            }
        });

        editText_m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(m3touch){
                    strm3=editable.toString();
                    if(strm3.length()==0) strm3="0";
                    m3=Double.parseDouble(strm3);
                    dm3=m3*1000;
                    cm3=dm3*1000;
                    mm3=cm3*1000;
                    editText_mm3.setText(mm3+"");
                    editText_cm3.setText(cm3+"");
                    editText_dm3.setText(dm3+"");
                }
            }
        });
        //
        etMm=findViewById(R.id.mm);
        etDm=findViewById(R.id.dm);
        etCm=findViewById(R.id.cm);
        etM=findViewById(R.id.m);
        etKm=findViewById(R.id.km);
        etMm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                isMmTouch=true;
                isCmTouch=false;
                isDmTouch=false;
                isMTouch=false;
                isKmTouch=false;
                return false;
            }
        });

        etCm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                isMmTouch=false;
                isCmTouch=true;
                isDmTouch=false;
                isMTouch=false;
                isKmTouch=false;
                return false;
            }
        });

        etDm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                isMmTouch=false;
                isCmTouch=false;
                isDmTouch=true;
                isMTouch=false;
                isKmTouch=false;
                return false;
            }
        });

        etM.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                isMmTouch=false;
                isCmTouch=false;
                isDmTouch=false;
                isMTouch=true;
                isKmTouch=false;
                return false;
            }
        });

        etKm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                isMmTouch=false;
                isCmTouch=false;
                isDmTouch=false;
                isMTouch=false;
                isKmTouch=true;
                return false;
            }
        });

        etMm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(isMmTouch){
                    strMm=editable.toString();
                    if(strMm.length()==0) strMm="0";
                    mm=Double.parseDouble(strMm);
                    cm=mm/10;
                    dm=cm/10;
                    m=dm/10;
                    km=m/1000;
                    etCm.setText(cm+"");
                    etDm.setText(dm+"");
                    etM.setText(m+"");
                    etKm.setText(km+"");
                }
            }
        });

        etCm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(isCmTouch){
                    strCm=editable.toString();
                    if(strCm.length()==0) strCm="0";
                    cm=Double.parseDouble(strCm);
                    mm=cm*10;
                    dm=cm/10;
                    m=dm/10;
                    km=m/1000;
                    etMm.setText(mm+"");
                    etDm.setText(dm+"");
                    etM.setText(m+"");
                    etKm.setText(km+"");
                }
            }
        });

        etDm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(isDmTouch){
                    strDm=editable.toString();
                    if(strDm.length()==0) strDm="0";
                    dm=Double.parseDouble(strDm);
                    cm=dm*10;
                    mm=cm*10;
                    m=dm/10;
                    km=m/1000;
                    etMm.setText(mm+"");
                    etCm.setText(cm+"");
                    etM.setText(m+"");
                    etKm.setText(km+"");
                }
            }
        });

        etM.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(isMTouch){
                    strM=editable.toString();
                    if(strM.length()==0) strM="0";
                    m=Double.parseDouble(strM);
                    dm=m*10;
                    cm=dm*10;
                    mm=cm*10;
                    km=m/1000;
                    etMm.setText(mm+"");
                    etCm.setText(cm+"");
                    etDm.setText(dm+"");
                    etKm.setText(km+"");
                }
            }
        });

        etKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(isKmTouch){
                    strKm=editable.toString();
                    if(strKm.length()==0) strKm="0";
                    km=Double.parseDouble(strKm);
                    m=km*1000;
                    dm=m*10;
                    cm=dm*10;
                    mm=cm*10;
                    etMm.setText(mm+"");
                    etCm.setText(cm+"");
                    etDm.setText(dm+"");
                    etM.setText(m+"");
                }
            }
        });



    }

}