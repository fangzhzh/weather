package weather.fangzhzh.com.weather.ui.activity;

import android.os.Bundle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EViewGroup;

import javax.inject.Inject;

import weather.fangzhzh.com.weather.R;
import weather.fangzhzh.com.weather.WeatherApplication;
import weather.fangzhzh.com.weather.ui.activity.module.MainActivityModule;
import weather.fangzhzh.com.weather.ui.activity.presenter.MainPresenter;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void onViewInit() {
        presenter.loadWeathers();
    }

    @Override
    protected void setupActivityComponent() {
        WeatherApplication.get(this)
                .getAppComponent()
                .plus(new MainActivityModule(this))
                .inject(this);
    }

}
