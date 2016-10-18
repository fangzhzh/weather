package weather.fangzhzh.com.weather;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

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

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        OkHttpClient okhttpClient = new OkHttpClient();
        okhttpClient.setConnectTimeout(30, TimeUnit.SECONDS);
        return okhttpClient;

    }
}
