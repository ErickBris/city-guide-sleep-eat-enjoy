package com.dmbteam.cityguide.callbacks;

import com.dmbteam.cityguide.googleplaces.Constants;
import com.dmbteam.cityguide.googleplaces.models.Place;

import java.util.Set;

/**
 * Created by dobrikostadinov on 6/9/15.
 */
public interface CallbackNearbyPlaces {

    void onPlaceClicked(Place place);

    void onPlacesLoaded(Set<Place> places, Constants.PLACE_TYPES type);
}
