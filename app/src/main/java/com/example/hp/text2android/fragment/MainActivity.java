package com.example.hp.text2android.fragment;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hp.text2android.R;

public class MainActivity extends Activity {

    private Button btnChangeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnChangeFragment=(Button)findViewById(R.id.btnChangeRightFragment);
        btnChangeFragment=(Button)findViewById(R.id.btnChangeRightFragment);
        btnChangeFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 切换fragment的方法
                // 1.创建待添加碎片的实例
                OtherRightFragment fragment = new OtherRightFragment();
                // 2.通过getFragmentManager()获取FragmentManager
                FragmentManager fragmentManager = getFragmentManager();
                // 3.通过beginTransaction()开启一个事务
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // 4.向容器内加入碎片，一般使用replace()，传入容器的id和碎片的实例
                fragmentTransaction.replace(R.id.fl_right, fragment);
                // 将一个事务添加到返回栈中，非必须，不加按下返回直接退出
                fragmentTransaction.addToBackStack(null);
                // 5.使用commit()提交事务
                fragmentTransaction.commit();

            }
        });
    }


    @Override
    protected void onStart() {
        Log.i("MainActivity","onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i("MainActivity","onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i("MainActivity","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("MainActivity","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("MainActivity","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("MainActivity","onDestroy");
        super.onDestroy();
    }
    }
