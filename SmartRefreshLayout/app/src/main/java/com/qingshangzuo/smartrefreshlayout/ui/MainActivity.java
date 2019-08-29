package com.qingshangzuo.smartrefreshlayout.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qingshangzuo.smartrefreshlayout.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click01(View view) {
        startActivity(new Intent(this,ElmRefreshActivity.class));
    }

    public void click02(View view) {
        startActivity(new Intent(this,WeatherRefreshActivity.class));
    }

    public void click03(View view) {
        startActivity(new Intent(this,WeiboRefreshActivity.class));
    }

    public void click04(View view) {
        startActivity(new Intent(this,TianmiaoRefreshActivity.class));
    }

    public void click05(View view) {
        startActivity(new Intent(this,JingdongRefreshActivity.class));
    }

    public void click06(View view) {
        startActivity(new Intent(this,BaiduRefreshActivity.class));
    }

    public void click07(View view) {
        startActivity(new Intent(this,MeituanRefreshActivity.class));
    }

}
