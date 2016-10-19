package weather.fangzhzh.com.weather.ui.activity.presenter;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import weather.fangzhzh.com.weather.data.api.WeatherManager;
import weather.fangzhzh.com.weather.data.model.FourDays;
import weather.fangzhzh.com.weather.data.model.FourDays.Temperature;
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
        Observable<Temperature> temperatureObservable = weatherManager.getFourDaysWeathers();
        temperatureObservable.subscribe(new Observer<Temperature>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Temperature temperature) {
//                activity.setTemperatures();
            }
        });

    }
}
