package com.jhdev.pruebacatalogo.activities.details;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.core.BaseActivity;
import com.jhdev.pruebacatalogo.dto.Data;

import butterknife.BindView;

public class DetailsActivity extends BaseActivity {

    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.app_bar) AppBarLayout mAppBarLayout;

    public static final String PARAMETER_DATA = "PARAMETER_DATA";
    private Data mData;

    @Override
    public void initializeView() {
        super.initializeView();
        setSupportActionBar(mToolbar);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_details;
    }
}
