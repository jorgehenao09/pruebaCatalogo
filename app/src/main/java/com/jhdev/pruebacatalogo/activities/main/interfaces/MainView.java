package com.jhdev.pruebacatalogo.activities.main.interfaces;

import com.jhdev.pruebacatalogo.core.BaseView;
import com.jhdev.pruebacatalogo.dto.Children;
import com.jhdev.pruebacatalogo.dto.Data;

import java.util.List;

/**
 * Created by Jorge Henao on 26/10/2017.
 */

public interface MainView extends BaseView{

    /**
     * Metodo utilizado para modificar el adapter y mostrar los datos del recycler
     * 
     * @param dataList
     */
    void fillData(List<Data> dataList);

    /**
     * Metodo utilizado para mostrar errores asociados con la descarga del listado de items
     *
     * @param mensajeError
     */
    void showMessageError(String mensajeError);

    /**
     * Metodo encargado de lanzar la actividad que muestra los detalles del item seleccionado
     *
     * @param data
     */
    void launchIntentDetails(Data data);
}
