package com.example.happybirthday;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    TextView mTvTop, mTvButtom, mTvLeft, mTvRight, mTvScale, mTvFade;

    @Override
    protected int getOverridePendingTransitionMode() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
    }

    public void initView() {
        mTvTop = findViewById(R.id.top);
        mTvTop.setOnClickListener(this);
        mTvButtom = findViewById(R.id.buttom);
        mTvButtom.setOnClickListener(this);
        mTvLeft = findViewById(R.id.left);
        mTvLeft.setOnClickListener(this);
        mTvRight = findViewById(R.id.right);
        mTvRight.setOnClickListener(this);
        mTvScale = findViewById(R.id.scale);
        mTvScale.setOnClickListener(this);
        mTvFade = findViewById(R.id.fade);
        mTvFade.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top:
                SecondActivity.start(this, TransitionMode.TOP);
                break;
            case R.id.buttom:
                SecondActivity.start(this, TransitionMode.BOTTOM);
                break;
            case R.id.left:
                SecondActivity.start(this, TransitionMode.LEFT);
                break;
            case R.id.right:
                SecondActivity.start(this, TransitionMode.RIGHT);
                break;
            case R.id.scale:
                SecondActivity.start(this, TransitionMode.SCALE);
                break;
            case R.id.fade:
                SecondActivity.start(this, TransitionMode.FADE);
                break;
        }
    }
}