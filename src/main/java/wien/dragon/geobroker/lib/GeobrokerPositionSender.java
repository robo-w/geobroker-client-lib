/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

import at.wrk.fmd.geobroker.contract.generic.Position;

import java.util.concurrent.CompletableFuture;

public interface GeobrokerPositionSender {
    CompletableFuture<Position> sendPositionUpdate(final String unitId, final String authenticationToken, final Position updatedPosition);
}
