package com.example.xhsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Land extends AppCompatActivity implements View.OnClickListener {

    private EditText sr_mm1;
    private EditText sr_zh1;
    private CheckBox jzmm;
    private Button zc1;
    private Button dl1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.land);
        Button zc1 =(Button)findViewById(R.id.reg);
        zc1.setOnClickListener(this);
        Button dl1=(Button)findViewById(R.id.denglu);
        dl1.setOnClickListener(this);
        jzmm=(CheckBox)findViewById(R.id.jzmm);
        sr_mm1=(EditText)findViewById(R.id.sr_mm);
        sr_zh1=(EditText)findViewById(R.id.sr_zh);

    }
        @Override
        public void onClick(View v) {
            String srzh =sr_zh1.getText().toString().trim();
            String srmm =sr_mm1.getText().toString().trim();

            switch (v.getId())
            {
                case R.id.denglu:
                    if(TextUtils.isEmpty(srzh) || TextUtils.isEmpty(srmm)){
                        Toast.makeText(Land.this,"密码或账号不能为空",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Land.this,"登录成功",Toast.LENGTH_SHORT).show();
                        Intent dl = new Intent(Land.this, Xhs.class);
                        startActivity(dl);
                }
                    break;
                        case R.id.reg:
                            Intent dlc = new Intent(Land.this, register.class);
                            startActivity(dlc);


                             }


            }

        }


