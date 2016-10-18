package weather.fangzhzh.com.weather.ui.activity.module;

import com.squareup.okhttp.OkHttpClient;

import dagger.Module;
import dagger.Provides;
import weather.fangzhzh.com.weather.data.api.WeatherManager;
import weather.fangzhzh.com.weather.ui.activity.ActivityScope;
import weather.fangzhzh.com.weather.ui.activity.MainActivity;
import weather.fangzhzh.com.weather.ui.activity.presenter.MainPresenter;

/**
 * @author zhangzf
 * @since 17/10/16 6:39 PM
 */
@Module
public class MainActivityModule{
    private MainActivity mainActivity;
    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @ActivityScope
    MainActivity provideMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    MainPresenter provideMainPresenter(MainActivity activity, WeatherManager weatherManager) {
        return new MainPresenter(activity, weatherManager);
    }


}
