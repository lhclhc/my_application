package com.example.hp.text2android.sharedpref;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.hp.text2android.R;

/**
 * 实现SharedPreferences存储的步骤
 * 1.获得SharedPreferences对象
 * 2.获得SharedPreferences.Editor对象
 * 3.通过putValue();传进键值对
 * 4.Editor的commit()来保存k-value
 * */

public class SharedPrefDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref_demo);

        SharedPreferences sharedPreferences=getSharedPreferences("share",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("android","安卓");
        editor.putInt("version",21);
        editor.commit();

        SharedPreferences sharedPreferences1=getSharedPreferences("share",MODE_PRIVATE);
        String name=sharedPreferences.getString("android","");
        int version=sharedPreferences.getInt("version",1);
        Toast.makeText(this, name+""+version, Toast.LENGTH_SHORT).show();

    }

}
