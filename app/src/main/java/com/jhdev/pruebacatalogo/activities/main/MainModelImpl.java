package com.jhdev.pruebacatalogo.activities.main;

import android.content.Context;
import android.util.Log;

import com.jhdev.pruebacatalogo.activities.main.interfaces.MainModel;
import com.jhdev.pruebacatalogo.dto.Children;
import com.jhdev.pruebacatalogo.dto.Data;
import com.jhdev.pruebacatalogo.dto.RedditResponse;
import com.jhdev.pruebacatalogo.services.CallbackRetrofitListener;
import com.jhdev.pruebacatalogo.services.RedditService;
import com.jhdev.pruebacatalogo.util.Util;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jorge Henao on 29/10/2017.
 */

public class MainModelImpl implements MainModel {

    private Retrofit mRetrofit;
    private RedditService mRedditService;
    private Context mContext;

    public MainModelImpl(Context context) {
        this.mContext = context;
    }

    /**
     * Realiza el llamado para obtener la lista de items
     *
     * @param listener
     */
    @Override
    public void getItemsList(final CallbackRetrofitListener<RedditResponse> listener) {
        //se construye la instancia de retrofit
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Util.urlMain)
                .addConverterFactory(GsonConverterFactory.create())
                .client(Util.buildClient())
                .build();

        mRedditService = mRetrofit.create(RedditService.class);

        Call<RedditResponse> call = mRedditService.getObjects();

        //Llamado asíncrono
        call.enqueue(new Callback<RedditResponse>() {
            @Override
            public void onResponse(Call<RedditResponse> call, Response<RedditResponse> response) {

                Log.i("Servicio descarga", "Se realizó la descarga exitosamente");

                //respuesta al presenter
                listener.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<RedditResponse> call, Throwable t) {
                //Respuesta para el presenter
                listener.onFailure(new RuntimeException(t.getMessage()));

            }
        });
    }

    /**
     * Retorna un listado de objetos Data
     *
     * @param childrens
     * @return
     */
    @Override
    public List<Data> getListData(List<Children> childrens) {
        List<Data> dataList = new ArrayList<>();

        //Se recorre el listado
        for (Children children: childrens){
            dataList.add(children.getData());
        }

        return dataList;
    }
}
