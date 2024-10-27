/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

import at.wrk.fmd.geobroker.contract.generic.Position;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import jakarta.inject.Inject;
import java.util.concurrent.CompletableFuture;

class RetrofitGeobrokerPositionSender implements GeobrokerPositionSender {

    private final GeobrokerApi geobrokerApi;

    @Inject
    public RetrofitGeobrokerPositionSender(final Retrofit retrofit) {
        geobrokerApi = retrofit.create(GeobrokerApi.class);
    }

    @Override
    public CompletableFuture<Position> sendPositionUpdate(
            final String unitId,
            final String authenticationToken,
            final Position updatedPosition) {
        CompletableFuture<Position> future = new CompletableFuture<>();
        Call<Position> positionCall = geobrokerApi.updatePosition(unitId, authenticationToken, updatedPosition);
        positionCall.enqueue(new LogFailureCallback(future));

        return future;
    }
}
