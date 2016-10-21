package weather.fangzhzh.com.weather.data.api;

import retrofit2.http.GET;
import rx.Observable;
import weather.fangzhzh.com.weather.data.model.FourDaysSimpleXml;
import weather.fangzhzh.com.weather.utils.CommonConst;

/**
 * @author zhangzf
 * @since 20/10/16 7:31 PM
 */
public interface WeatherService {
    @GET("?dataset=4days_outlook&keyref="+ CommonConst.WEATHER_API_KEY)
    Observable<FourDaysSimpleXml.Channel> getFourDaysWeathers();

}
