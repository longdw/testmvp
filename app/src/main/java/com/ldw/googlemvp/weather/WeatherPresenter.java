package com.ldw.googlemvp.weather;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by www.longdw.com on 2018/3/16 下午2:49.
 */

public class WeatherPresenter implements WeatherContract.IPresenter, WeatherContract.IModel.NetworkCallback {

    WeatherContract.IView mView;
    WeatherContract.IModel mModel;

    public WeatherPresenter(WeatherContract.IView view) {
        mView = view;
        mModel = new WeatherModel();
    }

    @Override
    public void getData(String code) {
        Map<String, String> params = new HashMap<>();
        params.put("code", code);
        mModel.getData(params, this);
    }

    @Override
    public void onNetworkSuccess(JSONObject json) {
        //解析数据
        mView.onSuccess(new Weather());
    }

    @Override
    public void onNetworkError(Exception e) {
        mView.onError(e);
    }
}
