package weather.fangzhzh.com.weather.data.api;



import com.squareup.okhttp.OkHttpClient;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import rx.Observable;
import weather.fangzhzh.com.weather.data.model.FourDaysSimpleXml;
import weather.fangzhzh.com.weather.data.model.User;
import weather.fangzhzh.com.weather.utils.CommonConst;


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


    @DebugLog
    public Observable<FourDaysSimpleXml.Channel> getFourDaysWeathers() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CommonConst.WEATHER_BASE_API)
                .client(new okhttp3.OkHttpClient())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        WeatherService weatherService = retrofit.create(WeatherService.class);
        return weatherService.getFourDaysWeathers();

    }

}
