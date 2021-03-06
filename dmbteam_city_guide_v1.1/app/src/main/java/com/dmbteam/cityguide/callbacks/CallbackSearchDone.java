package com.dmbteam.cityguide.callbacks;

import com.dmbteam.cityguide.googleplaces.models.Place;

import java.util.Set;

/**
 * Created by dobrikostadinov on 6/15/15.
 */
public interface CallbackSearchDone {

    void getSearchResult(Set<Place> places);

    void showSearchLoading();

    void hideSearchLoading();

}
