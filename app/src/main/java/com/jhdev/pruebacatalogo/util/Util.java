package com.jhdev.pruebacatalogo.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by Jorge Henao on 30/10/2017.
 */

public class Util {

    public static final String urlMain = "https://www.reddit.com";

    /**
     * Metodo utilizado para construir un objeto OkHttpClient
     *
     * @return
     */
    public static OkHttpClient buildClient() {
        return new OkHttpClient.Builder()
                .readTimeout(180, TimeUnit.SECONDS)
                .connectTimeout(180, TimeUnit.SECONDS)
                .build();
    }
}
