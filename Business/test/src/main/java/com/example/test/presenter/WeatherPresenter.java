package com.example.test.presenter;

import com.example.basemvplib.presenter.BasePresenter;
import com.example.test.config.ApiInterface;
import com.example.test.bean.WeatherBean;
import com.example.test.params.WeatherParams;
import com.example.test.view.iview.IWeatherView;

/**
 * @ClassName: WeatherPresenter
 * @author create by Tang
 * @date date 16/10/12 下午2:35
 * @Description: 天气查询
 */
public class WeatherPresenter extends BasePresenter<WeatherParams,WeatherBean> {

    private IWeatherView weatherView;

    public WeatherPresenter(IWeatherView weatherView) {
        super(weatherView,WeatherBean.class);
        this.weatherView = weatherView;
        getModel().setApiInterface(ApiInterface.WEATER);
    }

    @Override
    public void serverResponse(WeatherBean data) {
        weatherView.showWeatherView(data);
    }
}
