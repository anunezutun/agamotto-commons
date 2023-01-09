package com.crece.mas.commons.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class GoogleMapsUtils {
    /**
     * Sends a reverse geocode request obtaining the district identifier.
     *
     * @param latitude  latitude value
     * @param longitude longitude value
     * @return response
     */
    public String reverseGeocode(final double latitude, final double longitude, String apiKey) throws InterruptedException, ApiException, IOException {
        String response = "";
        final GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();
        final LatLng latlng = new LatLng(latitude, longitude);
        final GeocodingResult[] results;
        try {
            results = GeocodingApi.reverseGeocode(context, latlng).await();
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            response = gson.toJson(results[0].addressComponents);
        } catch (final Exception e) {
            log.error("error:".concat(e.getMessage()));
            throw e;
        }
        return response;
    }

    /**
     * Sends a geocode request obtaining latitude and longitude values.
     *
     * @param address a string representing the address
     * @return response
     */
    public String geocode(final String address, String apiKey, String region) throws InterruptedException, ApiException, IOException {
        String response = "";
        final GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();
        final GeocodingResult[] results;
        try {
            GeocodingApiRequest request = new GeocodingApiRequest(context);
            request.address(address);
            request.region(region);
            results = request.await();
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            response = gson.toJson(results[0].geometry.location);
        } catch (final Exception e) {
            log.error("error:".concat(e.getMessage()));
            throw e;
        }
        return response;
    }

    /**
     * Sends a geocode request obtaining addressComponents values.
     *
     * @param address a string representing the address
     * @return response
     */
    public String geocodeAddressComponents(final String address, String apiKey, String region) throws InterruptedException, ApiException, IOException {
        String response = "";
        final GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();
        final GeocodingResult[] results;
        try {
            GeocodingApiRequest request = new GeocodingApiRequest(context);
            request.address(address);
            request.region(region);
            results = request.await();
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            response = gson.toJson(results[0].addressComponents);
        } catch (final Exception e) {
            log.error("error:".concat(e.getMessage()));
            throw e;
        }
        return response;
    }

    /**
     * Sends a geocode request obtaining geocodingResult array values.
     *
     * @param address a string representing the address
     * @return results
     */
    public GeocodingResult[] geocodeAddressComponentsArr(final String address, String apiKey, String region) throws InterruptedException, ApiException, IOException {
        final GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();
        GeocodingResult[] results = null;
        try {
            GeocodingApiRequest request = new GeocodingApiRequest(context);
            request.address(address);
            request.region(region);
            results = request.await();
            return results;
        } catch (final Exception e) {
            log.error("error:".concat(e.getMessage()));
            throw e;
        }
    }
}
