package weather.fangzhzh.com.weather.ui.activity.component;

import dagger.Subcomponent;
import weather.fangzhzh.com.weather.ui.activity.ActivityScope;
import weather.fangzhzh.com.weather.ui.activity.MainActivity;
import weather.fangzhzh.com.weather.ui.activity.module.MainActivityModule;

/**
 * @author zhangzf
 * @since 17/10/16 6:43 PM
 */
@ActivityScope
@Subcomponent(
        modules = MainActivityModule.class
)

public interface MainActivityComponent {
    MainActivity inject(MainActivity mainActivity);
}
