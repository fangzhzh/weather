package weather.fangzhzh.com.weather;

import javax.inject.Singleton;

import dagger.Component;
import weather.fangzhzh.com.weather.data.UserComponent;
import weather.fangzhzh.com.weather.data.UserModule;
import weather.fangzhzh.com.weather.ui.activity.component.MainActivityComponent;
import weather.fangzhzh.com.weather.ui.activity.module.MainActivityModule;

/**
 * @author zhangzf
 * @since 14/10/16 5:12 PM
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
        }
)
public interface AppComponent {
    UserComponent plus(UserModule userModule);
    MainActivityComponent plus(MainActivityModule module);
}
