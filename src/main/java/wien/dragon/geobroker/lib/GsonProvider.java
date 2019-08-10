package wien.dragon.geobroker.lib;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Provider;

class GsonProvider implements Provider<Gson> {
    @Override
    public Gson get() {
        return Converters.registerAll(new GsonBuilder()).create();
    }
}
