package com.jhdev.pruebacatalogo.activities.main;

import com.jhdev.pruebacatalogo.activities.main.interfaces.MainModel;
import com.jhdev.pruebacatalogo.activities.main.interfaces.MainView;
import com.jhdev.pruebacatalogo.dto.RedditResponse;
import com.jhdev.pruebacatalogo.services.CallbackRetrofitListener;

/**
 * Created by Jorge Henao on 29/10/2017.
 */

public class MainPresenter {

    private MainView mView;
    private MainModel mModel;

    public MainPresenter(MainView view, MainModel model) {
        this.mView = view;
        this.mModel = model;
    }

    /**
     * Ordena al interactor llamar la servicio que descarga el listado de items para mostrar en pantalla
     */
    public void getItemsList() {
        //Se muestra el mensaje de espera mientras el proceso se realiza
        mView.showWaitMessage();

        //Se hace el llamado al servicio que obtiene el listado de items
        mModel.getItemsList(new CallbackRetrofitListener<RedditResponse>() {
            @Override
            public void onResponse(RedditResponse resultado) {

                //Realiza las acciones necesarias para llenar el recycler con el listado de items
                mView.fillData(mModel.getListData(resultado.getDataReddit().getChildren()));

                //Oculta el mensaje de espera
                mView.hideWaitMessage();
            }

            @Override
            public void onFailure(Throwable error) {

                //Oculta el mensaje de espera
                mView.hideWaitMessage();

                //Metodo utilizado para mostrar errores asociados con la autenticacion del usuario con el sistema
                mView.showMessageError(error.getMessage());
            }
        });


    }
}
