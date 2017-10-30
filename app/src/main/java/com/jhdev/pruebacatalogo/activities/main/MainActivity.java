package com.jhdev.pruebacatalogo.activities.main;

import android.Manifest;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jhdev.pruebacatalogo.R;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainModel;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainView;
import com.jhdev.pruebacatalogo.core.BaseActivity;
import com.jhdev.pruebacatalogo.dto.Children;

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
     * @param children
     */
    @Override
    public void fillData(List<Children> children) {

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
}
