/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Inject;
import javax.inject.Provider;

class RetrofitProvider implements Provider<Retrofit> {
    private final String baseUrl;
    private final Gson gson;

    @Inject
    public RetrofitProvider(@BaseUrl final String baseUrl, final Gson gson) {
        this.baseUrl = baseUrl;
        this.gson = gson;
    }

    @Override
    public Retrofit get() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
