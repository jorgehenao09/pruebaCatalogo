package com.jhdev.pruebacatalogo.services;

/**
 * Interfaz para definir las acciones a realizar despues de obtener respuesta de un llamado a Retrofit
 *
 * Created by Jorge on 28/10/2017.
 */

public interface CallbackRetrofitListener<T> {

    /**
     * Accion a realizar cuando se obtuvo una respuesta del servidor
     *
     * @param resultado
     */
    void onResponse(T resultado);

    /**
     * Accion a realizar cuando ha ocurrido un error
     *
     * @param error
     */
    void onFailure(Throwable error);
}
