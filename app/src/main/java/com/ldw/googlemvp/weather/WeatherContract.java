package com.ldw.googlemvp.weather;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by www.longdw.com on 2018/3/16 下午2:32.
 */

public interface WeatherContract {
    interface IView {
        void onSuccess(Weather weather);
        void onError(Exception e);
    }

    interface IPresenter {
        void getData(String code);
    }

    interface IModel {
        interface NetworkCallback {
            void onNetworkSuccess(JSONObject json);
            void onNetworkError(Exception e);
        }

        void getData(Map<String, String> params, NetworkCallback callback);
    }
}
