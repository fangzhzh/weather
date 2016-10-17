package weather.fangzhzh.com.weather;

import android.app.Application;
import android.content.Context;

import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

import weather.fangzhzh.com.weather.data.UserComponent;

/**
 * @author zhangzf
 * @since 14/10/16 4:50 PM
 */
public class WeatherApplication extends Application {
    public AppComponent appComponent;
    public UserComponent userComponent;

    public static WeatherApplication get(Context context) {
        return (WeatherApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            AndroidDevMetrics.initWith(this);
        }

        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
