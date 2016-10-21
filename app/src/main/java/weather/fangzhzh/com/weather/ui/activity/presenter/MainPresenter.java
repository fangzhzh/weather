package weather.fangzhzh.com.weather.ui.activity.presenter;

import android.util.Log;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import weather.fangzhzh.com.weather.data.api.WeatherManager;
import weather.fangzhzh.com.weather.data.model.FourDaysSimpleXml;
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
        Observable<FourDaysSimpleXml.Channel> fourDaysObservable = weatherManager.getFourDaysWeathers();
        fourDaysObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<FourDaysSimpleXml.Channel>() {
                    @Override
                    public void call(FourDaysSimpleXml.Channel fourDays) {
                        Log.v(this.getClass().getSimpleName(), fourDays.toString());
                    }
                });

    }
}
