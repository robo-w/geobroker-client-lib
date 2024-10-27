/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package wien.dragon.geobroker.lib;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jakarta.inject.Provider;

class GsonProvider implements Provider<Gson> {
    @Override
    public Gson get() {
        return Converters.registerAll(new GsonBuilder()).create();
    }
}
