package com.example.happybirthday;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SecondActivity extends BaseActivity{
    private int mtransitionMode;
    private ArrayList<String>mName=new ArrayList<>();
    private TextView mTextView;



    @Override
    protected int getOverridePendingTransitionMode() {
        return mtransitionMode;
    }

    @Override
    protected void initView() {
        mTextView=findViewById(R.id.text_title);
        mTextView.setText(mName.get(mtransitionMode-1)+"Activity");
    }

    @Override
    protected void initData() {
        mName.add("TOP");
        mName.add("BOTTOM");
        mName.add("LEFT");
        mName.add("RIGHT");
        mName.add("SCALE");
        mName.add("FADE");
    }

    @Override
    protected int getLayout() {
        return R.layout.layout_top;
    }

    public static void start(Context context,int mtransitionMode){
        Intent starter = new Intent(context, SecondActivity.class);
        starter.putExtra("transitionMode",mtransitionMode);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mtransitionMode=getIntent().getIntExtra("transitionMode",0);
        super.onCreate(savedInstanceState);


    }
}
