package wien.dragon.geobroker.lib;

import at.wrk.fmd.geobroker.contract.generic.Position;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface GeobrokerApi {
    @POST("positions/{unitId}")
    Call<Position> updatePosition(@Path("unitId") String geobrokerUnitId, @Query("token") String authenticationToken, @Body Position updatedPosition);
}
