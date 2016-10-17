package weather.fangzhzh.com.weather.ui.activity;

import android.os.Bundle;

import javax.inject.Inject;

import weather.fangzhzh.com.weather.R;
import weather.fangzhzh.com.weather.WeatherApplication;
import weather.fangzhzh.com.weather.ui.activity.module.MainActivityModule;

public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setupActivityComponent() {
        WeatherApplication.get(this)
                .getAppComponent()
                .plus(new MainActivityModule(this))
                .inject(this);
    }

}
