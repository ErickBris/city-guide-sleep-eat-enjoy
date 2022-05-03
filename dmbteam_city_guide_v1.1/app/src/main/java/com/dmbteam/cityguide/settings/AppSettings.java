package com.dmbteam.cityguide.settings;

/**
 * Created by dobrikostadinov on 6/3/15.
 */
public class AppSettings {

    /**
     * Enable or disable ADMOB
     */
    public static final boolean ENABLE_ADMOB = true;

    /**
     * Define latitude of your location
     */
    public static double LATITUDE = 52.5075419;

    /**
     * Define longitude of your location
     */
    public static double LONGITUDE = 13.4251364;

    /**
     * Initial zoom of the map
     */
    public static final int MAP_INITIAL_ZOOM = 14;

    /**
     * Radius in meters for location searches
     */
    public static final int GOOGLE_PLACES_LOCATION_RADIUS = 1000;

    /**
     * Radius in meters for string searches
     */
    public static final int GOOGLE_PLACES_SEARCH_RADIUS = 10000;

    /**
     * City for the app
     */
    public static final String TOWN = "Berlin";

    /**
     * Country of the app
     */
    public static final String COUNTRY = "Germany";

    public static final String OPEN_WEATHER_MAP_KEY = "bf24a6ac9387a41772c88be020ff4ef8";

    public static final String XMLResourcePath = "about.xml";

}
