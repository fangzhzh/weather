package weather.fangzhzh.com.weather.ui.activity.presenter;

import javax.inject.Inject;

import weather.fangzhzh.com.weather.data.api.WeatherManager;
import weather.fangzhzh.com.weather.ui.activity.MainActivity;

/**
 * @author zhangzf
 * @since 17/10/16 6:33 PM
 */
public class MainPresenter {

    private final MainActivity activity;
    private final WeatherManager weatherManager;

    @Inject
    public MainPresenter(MainActivity activity,
                         WeatherManager weatherManager) {

        this.activity = activity;
        this.weatherManager = weatherManager;
    }

    public void loadWeathers() {

    }
}
