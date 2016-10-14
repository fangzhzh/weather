package weather.fangzhzh.com.weather;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author zhangzf
 * @since 14/10/16 6:39 PM
 */
@Module
public class AppModule {
    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return  application;
    }
}
