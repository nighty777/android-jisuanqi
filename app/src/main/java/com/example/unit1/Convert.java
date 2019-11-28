package com.example.unit1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.unit1.*;
import com.example.unit1.Convert;


public class Convert extends AppCompatActivity {

    private EditText editText;//待转换数
    private EditText editText3;//待转换进制
    private  TextView textView19;//二进制结果
    private  TextView textView20;//八进制结果
    private  TextView textView21;//十进制结果
    private TextView textView22;//十六进制结果
    private  TextView textView23;//信息提示
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convert);
        editText=findViewById(R.id.editText);
        editText3 =findViewById(R.id.editText3);
        textView19 =findViewById(R.id.textView19);
        textView20 =findViewById(R.id.textView20);
        textView21 =findViewById(R.id.textView21);
        textView22 =findViewById(R.id.textView22);
        textView23=findViewById(R.id.textView23);
        //转换进制监听器 S
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //转换数监听器 E
                int flag;
                //判断是几进制
                String input_jinzhi=charSequence.toString();
                if(input_jinzhi.equals("10")&&(editText.getText().toString().length() > 0))
                {
                    textView23.setText("待转换进制为10");
                    //do....
                    editText.getText().toString();
                    String result_two_ten = Integer.toString(Integer.valueOf(editText.getText().toString(),10),2) ;
                    //输出二进制结果
                    textView19.setText(result_two_ten);
                    //输出八进制结果
                    textView20.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),10),8));
                    //输出十进制结果
                    textView21.setText(editText.getText().toString() );
                    //输出十六进制结果
                    textView22.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),10),16));
                }
                else if(input_jinzhi.equals("2")&&(editText.getText().toString().length() >0)&&isBinary(editText.getText().toString()))
                {
                    textView23.setText("待转换进制为2");
                    editText.getText().toString();
                    textView19.setText(editText.getText().toString());
                    //输出八进制结果
                    textView20.setText(Integer.toOctalString(Integer.valueOf(Integer.toString(Integer.valueOf(editText.getText().toString(),2),10))));
                    //输出十进制结果,先将二进制转换为十进制。
                    //结果为Integer.toString(Integer.valueOf(editText.getText().toString(),2),10)
                    textView21.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),2),10) );
                    //输出十六进制结果
                    textView22.setText(Integer.toHexString(Integer.valueOf(Integer.toString(Integer.valueOf(editText.getText().toString(),2),10))));
                }

                else if(input_jinzhi.equals("8")&&(editText.getText().toString().length() > 0))
                {
                    textView23.setText("待转换进制为8");
                    flag=8;
                    //do....
                    //输出二进制结果
                    textView19.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),8),2));
                    //输出八进制结果
                    textView20.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),8),8));
                    //输出十进制结果
                    textView21.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),8),10) );
                    //输出十六进制结果
                    textView22.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),8),16));
                }

                else if(input_jinzhi.equals("16")&&(editText.getText().toString().length() > 0))
                {

                    textView23.setText("待转换进制为16");
                    flag=16;
                    //do....
                    //输出二进制结果
                    textView19.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),16),2));
                    //输出八进制结果
                    textView20.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),16),8));
                    //输出十进制结果
                    textView21.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),16),10) );
                    //输出十六进制结果
                    textView22.setText(Integer.toString(Integer.valueOf(editText.getText().toString(),16),16));
                }
                else if(editText.getText().toString().equals(""))
                {

                    textView23.setText("请先输入转换数！");
                }
                else
                {
                    textView23.setText("您输入的数字不符合规定");
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }



    //转换进制监听器 E
    public static boolean isBinary(String num){
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='0'&&num.charAt(i)=='1')
                return true;
        }
        return false;
    }

}

/* -------------------------进制转换算法-------------------------*/




