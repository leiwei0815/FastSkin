package com.enjoy.skin;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.enjoy.skin.lib.SkinManager;

/**
 * @author
 */

public class SkinActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
    }

    public void change(View view) {
        //换肤，收包裹，皮肤包是独立的apk包，可以来自网络下载
        String path="/data/data/com.enjoy.skin/skin/skin-debug.apk";
        SkinManager.getInstance().loadSkin(path);
}

    public void restore(View view) {
        SkinManager.getInstance().loadSkin(null);
    }
}
