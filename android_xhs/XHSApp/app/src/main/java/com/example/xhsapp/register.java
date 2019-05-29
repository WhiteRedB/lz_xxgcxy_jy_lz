package com.example.xhsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends  AppCompatActivity implements View.OnClickListener {
private EditText zc_srmm;
private EditText zc_srzh;
private Button zccg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        Button zccg1=(Button)findViewById(R.id.zc_cg);
       zc_srmm=(EditText)findViewById(R.id.zc_sr_mm);
       zc_srzh=(EditText)findViewById(R.id.zc_sr_zh);
        zccg1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String srzh =zc_srzh.getText().toString().trim();
        String srmm =zc_srmm.getText().toString().trim();
        switch (v.getId())
        {
            case R.id.zc_cg:
                if(TextUtils.isEmpty(srzh) || TextUtils.isEmpty(srmm)){
                    Toast.makeText(register.this,"密码或账号不能为空",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(register.this,"注册成功",Toast.LENGTH_SHORT).show();
                }
                break;
        }



        }

      }








