package com.ec.android.demo.qrcodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        initToolbar();

    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
        mToolbar.setTitle("欢迎~");
        //
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_scan:
                        //扫描
                        Intent intent = new Intent("com.zbar.lib.qrcodescan.main");

                        startActivity(intent);
                        break;
                }

                return true;
            }
        });
        //
        mToolbar.inflateMenu(R.menu.menu_main);
    }
}
