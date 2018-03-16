package com.ldw.googlemvp.weather;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by www.longdw.com on 2018/3/16 下午2:48.
 */

public class WeatherModel implements WeatherContract.IModel {
    @Override
    public void getData(Map<String, String> params, NetworkCallback callback) {
        //这里可以使用okhttp或者volley来获取网络数据
        callback.onNetworkSuccess(new JSONObject());
    }
}
