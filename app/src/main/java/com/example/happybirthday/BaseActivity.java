package com.example.happybirthday;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

public abstract class BaseActivity extends AppCompatActivity {


    protected abstract int getOverridePendingTransitionMode();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract int getLayout();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if(getOverridePendingTransitionMode()!=0){
            switch (getOverridePendingTransitionMode()) {
                case TransitionMode.RIGHT:
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    break;
                case TransitionMode.LEFT:
                    overridePendingTransition(R.anim.right_in, R.anim.right_out);
                    break;
                case TransitionMode.TOP:
                    overridePendingTransition(R.anim.top_in, R.anim.top_out);
                    break;
                case TransitionMode.BOTTOM:
                    overridePendingTransition(R.anim.bottom_in, R.anim.bottom_out);
                    break;
                case TransitionMode.SCALE:
                    overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
                    break;
                case TransitionMode.FADE:
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    break;

            }
        }


        StatusBarUtils.setColor(this, Color.rgb(250,250,250));
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initData();
        initView();
    }

    @Override
    public void finish() {
        super.finish();
        if(getOverridePendingTransitionMode()!=0){
            switch (getOverridePendingTransitionMode()) {
                case TransitionMode.RIGHT:
                    overridePendingTransition(R.anim.right_in,R.anim.right_out);
                    break;
                case TransitionMode.LEFT:
                    overridePendingTransition(R.anim.left_in,R.anim.left_out);
                    break;
                case TransitionMode.TOP:
                    overridePendingTransition(R.anim.bottom_in,R.anim.bottom_out);
                    break;
                case TransitionMode.BOTTOM:
                    overridePendingTransition(R.anim.top_in,R.anim.top_out);
                    break;
                case TransitionMode.SCALE:
                    overridePendingTransition(R.anim.scale_in_disappear,R.anim.scale_out_disappear);
                    break;
                case TransitionMode.FADE:
                    overridePendingTransition(R.anim.fade_in_disappear,R.anim.fade_out_disappear);
                    break;
            }
        }


    }
}
