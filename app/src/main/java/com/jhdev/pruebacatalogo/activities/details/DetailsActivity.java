package com.jhdev.pruebacatalogo.activities.details;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.core.BaseActivity;
import com.jhdev.pruebacatalogo.dto.Data;

import butterknife.BindView;

public class DetailsActivity extends BaseActivity {

    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.app_bar) AppBarLayout mAppBarLayout;
    @BindView(R.id.toolbar_image) ImageView mImage;

    @BindView(R.id.details_title) TextView mTitle;
    @BindView(R.id.details_audience) TextView mAudience;
    @BindView(R.id.details_suscribers) TextView mSuscribers;
    @BindView(R.id.details_description) TextView mDescription;

    public static final String PARAMETER_DATA = "PARAMETER_DATA";
    private Long mDuration= 700L;
    private Data mData;

    @Override
    public void initializeView() {
        super.initializeView();
        setSupportActionBar(mToolbar);

        mData = getIntent().getParcelableExtra(PARAMETER_DATA);

        //Se descarga la imagen del item
        Glide.with(this)
                .load(mData.getIcon_img())
                .into(mImage);

        mTitle.setText(mData.getTitle());
        mAudience.setText(mData.getAudience_target());
        mSuscribers.setText(String.valueOf(mData.getSubscribers()));
        mDescription.setText(mData.getSubmit_text());

        setupWindowAnimations();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_details;
    }

    private void setupWindowAnimations() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Explode enterTransition = new Explode();
            enterTransition.setDuration(mDuration);
            getWindow().setExitTransition(enterTransition);
        }
    }
}
