package com.test.xyz.daggersample.ui.weather.mvp;

public interface WeatherView {
    String getUserNameText();

    String getCityText();

    void showUserNameError(int messageId);

    void showCityNameError(int messageId);

    void showBusyIndicator();

    void hideBusyIndicator();

    void showResult(String result);

    void showError(String error);
}
