package com.dmbteam.cityguide.callbacks;

import com.dmbteam.cityguide.weather.cmn.ForecastDay;

import java.util.List;

/**
 * Created by dobrikostadinov on 6/17/15.
 */
public interface CallbackForecastLoaded {

    void doneLoadingForecast(List<ForecastDay> result);
    void showLoadingWeather();
}
