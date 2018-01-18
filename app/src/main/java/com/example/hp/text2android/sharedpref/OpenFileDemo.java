package com.example.hp.text2android.sharedpref;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.text2android.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OpenFileDemo extends Activity implements View.OnClickListener{
        private Button btnSaveInfoData,btnLoadInfoData;
        private TextView tvShowInfoData;
        private EditText etInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_file_demo);

        btnSaveInfoData=(Button)findViewById(R.id.btnSaveInfoData);
        btnLoadInfoData=(Button)findViewById(R.id.btnLoadInfoData);
        tvShowInfoData=(TextView)findViewById(R.id.tvShowInfoData);
        etInfo=(EditText)findViewById(R.id.etInfo);

        btnSaveInfoData.setOnClickListener(this);
        btnLoadInfoData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSaveInfoData:
                //保存数据到文件
                String str = etInfo.getText().toString();
                BufferedWriter bw = null;
                try {
                    FileOutputStream fos = openFileOutput("data", MODE_PRIVATE);
                    bw = new BufferedWriter(new OutputStreamWriter(fos));
                    bw.write(str);
                    Toast.makeText(OpenFileDemo.this, "保存成功", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (bw != null) {
                        try {
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case R.id.btnLoadInfoData:
                BufferedReader br = null;
                StringBuffer stringBuffer=new StringBuffer();
                try {
                    FileInputStream fis = openFileInput("data");
                    br = new BufferedReader(new InputStreamReader(fis));
                    String line = "";
                    while ((line=br.readLine())!=null){
                stringBuffer.append(line);
                    }
                    tvShowInfoData.setText(stringBuffer.toString());

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
                    e.printStackTrace();
                }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                }
                break;

    }
    }

    }

