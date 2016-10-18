package weather.fangzhzh.com.weather.data.api;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Inject;

import weather.fangzhzh.com.weather.data.model.User;

/**
 * @author zhangzf
 * @since 18/10/16 2:26 PM
 */
public class WeatherManager {
    private final User user;
    private final OkHttpClient okHttpClient;

    @Inject
    public WeatherManager(User user, OkHttpClient okHttpClient) {
        this.user = user;
        this.okHttpClient = okHttpClient;
    }


}
