/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import retrofit2.Retrofit;

import jakarta.inject.Singleton;

public class GeobrokerLibModule extends AbstractModule {
    private final String baseUrl;

    public GeobrokerLibModule(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    protected void configure() {
        bind(Gson.class).toProvider(GsonProvider.class).in(Singleton.class);
        bind(GeobrokerPositionSender.class).to(RetrofitGeobrokerPositionSender.class).in(Singleton.class);
        bind(String.class).annotatedWith(BaseUrl.class).toInstance(baseUrl);
        bind(Retrofit.class).toProvider(RetrofitProvider.class).in(Singleton.class);
    }
}
