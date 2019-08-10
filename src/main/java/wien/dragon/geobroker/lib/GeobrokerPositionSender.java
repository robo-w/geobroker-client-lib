package wien.dragon.geobroker.lib;

import at.wrk.fmd.geobroker.contract.generic.Position;

import java.util.concurrent.CompletableFuture;

public interface GeobrokerPositionSender {
    CompletableFuture<Position> sendPositionUpdate(final String unitId, final String authenticationToken, final Position updatedPosition);
}
