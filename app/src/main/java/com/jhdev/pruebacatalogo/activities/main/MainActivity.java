package com.jhdev.pruebacatalogo.activities.main;

import android.Manifest;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.activities.details.DetailsActivity;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainModel;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainView;
import com.jhdev.pruebacatalogo.adapters.RecyclerItemsAdapter;
import com.jhdev.pruebacatalogo.core.BaseActivity;
import com.jhdev.pruebacatalogo.dto.Children;
import com.jhdev.pruebacatalogo.dto.Data;
import com.jhdev.pruebacatalogo.util.TransitionHelper;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.items_recycler) RecyclerView mRecyclerItems;

    private MainPresenter mPresenter;

    /**
     * {@inheritDoc}
     */
    @Override
    public void buildPresenter() {
        super.buildPresenter();

        //Se genera una nueva instancia del model para construir el presenter
        MainModel model = new MainModelImpl(getBaseContext());

        mPresenter = new MainPresenter(this, model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeView() {
        super.initializeView();

        //Componente que muestra el listado de modulos a 1 columna
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());

        //atributo que permite redimensionar el tamaño de las tarjetas al momento de que el usuario cambie la posicion del dispositivo
        mRecyclerItems.setHasFixedSize(true);
        mRecyclerItems.setLayoutManager(linearLayoutManager);

        mPresenter.getItemsList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<String> getPermissionList() {
        return Arrays.asList(
                Manifest.permission.INTERNET,
                Manifest.permission.ACCESS_NETWORK_STATE
        );
    }

    /**
     * Metodo utilizado para modificar el adapter y mostrar los datos del recycler
     *
     * @param dataList
     */
    @Override
    public void fillData(List<Data> dataList) {
        mRecyclerItems.setAdapter(new RecyclerItemsAdapter(dataList, getApplicationContext(), this));
    }

    /**
     * Metodo utilizado para mostrar errores asociados con la descarga del listado de items
     *
     * @param errorMessage
     */
    @Override
    public void showMessageError(String errorMessage) {
        showDialogMessage(getString(R.string.title_list), errorMessage);
    }

    /**
     * Metodo encargado de lanzar la actividad que muestra los detalles del item seleccionado
     *
     * @param data
     */
    @Override
    public void launchIntentDetails(Data data, View view) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(DetailsActivity.PARAMETER_DATA, data);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptions options = ActivityOptions
                    .makeSceneTransitionAnimation(this, view, "image_transition");
            // start the new activity
            startActivity(intent, options.toBundle());
        }else {
            startActivity(intent);
        }


    }

}
