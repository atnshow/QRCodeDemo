package com.ec.android.demo.qrcodedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


/**
 * @author EC
 */
public class ScanResultActivity extends AppCompatActivity {
    private static final boolean DEBUG = false;
    //扫描结果
    private String mScanResult;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanresult);
        //
        mScanResult = getIntent().getStringExtra("scanResult").trim();
        //
        initToolbar();
        //
        initView();
    }

    private void initToolbar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
        mToolbar.setTitle("扫描结果");
    }

    public void initView() {
        TextView mScanResultTv = (TextView) findViewById(R.id.scan_result_tv);

        TextView mCancelTv = (TextView) findViewById(R.id.cancel_tv);

        TextView mSubmitTv = (TextView) findViewById(R.id.submit_tv);
        //
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.cancel_tv:
                        //取消按钮
                        finish();
                        break;

                    case R.id.submit_tv:
                        //确切按钮
                        finish();
                        break;

                }
            }
        };
        //
        mCancelTv.setOnClickListener(clickListener);
        mSubmitTv.setOnClickListener(clickListener);
        //
        mScanResultTv.setText(mScanResult);

    }

}
