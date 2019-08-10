package wien.dragon.geobroker.lib;

import at.wrk.fmd.geobroker.contract.generic.Position;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.concurrent.CompletableFuture;

class LogFailureCallback implements Callback<Position> {
    private final CompletableFuture<Position> future;

    LogFailureCallback(final CompletableFuture<Position> future) {
        this.future = future;
    }

    @Override
    public void onResponse(final Call<Position> call, final Response<Position> response) {
        if (response.isSuccessful()) {
            future.complete(response.body());
        } else {
            future.completeExceptionally(new OperationFailedException("Server returned: " + response.code()));
        }
    }

    @Override
    public void onFailure(final Call<Position> call, final Throwable throwable) {
        future.completeExceptionally(throwable);
    }
}
