# GeoBroker Client Library

Java Client Library to send updates to [GeoBroker](https://github.com/wrk-fmd/geobroker).

## Usage

This library is intended to be used in Java projects.
Create an instance of `GeobrokerLibModule` with a `baseUrl` of your GeoBroker server.
When the module is loaded into a Guice instance, the `GeobrokerPositionSender` can be injected
and used for easy position update reporting.

## Build

Checkout the version you want to install to your local maven repository,
for example by `git checkout v1.0.0` for the version `1.0.0`.
Run `mvn clean install` to build the library and install it to the local maven repository.
