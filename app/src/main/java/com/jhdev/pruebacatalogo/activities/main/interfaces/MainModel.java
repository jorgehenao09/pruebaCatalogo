package com.jhdev.pruebacatalogo.activities.main.interfaces;

import com.jhdev.pruebacatalogo.dto.RedditResponse;
import com.jhdev.pruebacatalogo.services.CallbackRetrofitListener;

/**
 * Created by Jorge Henao on 26/10/2017.
 */

public interface MainModel {

    /**
     * Realiza el llamado para obtener la lista de items
     *
     * @param listener
     */
    void getItemsList(CallbackRetrofitListener<RedditResponse> listener);
}
