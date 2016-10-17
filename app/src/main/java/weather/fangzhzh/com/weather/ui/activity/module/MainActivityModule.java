package weather.fangzhzh.com.weather.ui.activity.module;

import dagger.Module;
import dagger.Provides;
import weather.fangzhzh.com.weather.data.UserModule;
import weather.fangzhzh.com.weather.ui.activity.ActivityScope;
import weather.fangzhzh.com.weather.ui.activity.MainActivity;
import weather.fangzhzh.com.weather.ui.activity.MainPresenter;

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
    MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }


}
