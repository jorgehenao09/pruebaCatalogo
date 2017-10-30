package com.jhdev.pruebacatalogo.activities.main.interfaces;

import com.jhdev.pruebacatalogo.core.BaseView;
import com.jhdev.pruebacatalogo.dto.Children;

import java.util.List;

/**
 * Created by Jorge Henao on 26/10/2017.
 */

public interface MainView extends BaseView{

    /**
     * Metodo utilizado para modificar el adapter y mostrar los datos del recycler
     * 
     * @param children
     */
    void fillData(List<Children> children);

    /**
     * Metodo utilizado para mostrar errores asociados con la descarga del listado de items
     *
     * @param mensajeError
     */
    void showMessageError(String mensajeError);
}
