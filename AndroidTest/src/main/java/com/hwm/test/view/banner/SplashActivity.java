package com.hwm.test.view.banner;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.android.base.BaseActivity;
import com.hwm.test.R;
import com.hwm.test.view.banner.block.SplashBlock;

/**
 * Created by Administrator on 2015/11/22 0022.
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected int getMainContentViewId() {
        return R.layout.act_splash_main;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        getCommonBlockManager().add(new SplashBlock());
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {

    }

    @Override
    public void onActivityRestoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
