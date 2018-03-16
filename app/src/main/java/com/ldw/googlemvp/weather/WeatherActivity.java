package com.ldw.googlemvp.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ldw.googlemvp.R;

public class WeatherActivity extends AppCompatActivity implements WeatherContract.IView {

    private EditText mCodeEt;
    private Button mBtn;

    private WeatherContract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);

        mPresenter = new WeatherPresenter(this);

        initView();
    }

    private void initView() {
        mCodeEt = findViewById(R.id.codeEt);
        mBtn = findViewById(R.id.btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = mCodeEt.getText().toString();
                getData(code);
            }
        });
    }

    private void getData(String code) {
        mPresenter.getData(code);
    }

    @Override
    public void onSuccess(Weather weather) {
        //初始化界面
    }

    @Override
    public void onError(Exception e) {

    }
}
