package weather.fangzhzh.com.weather.data.api;



import android.util.Log;

import com.google.common.collect.ImmutableList;
import com.squareup.okhttp.OkHttpClient;
import com.tickaroo.tikxml.*;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import hugo.weaving.DebugLog;
import okio.BufferedSource;
import okio.Okio;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import weather.fangzhzh.com.weather.data.model.FourDays;
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


    @DebugLog
    public Observable<FourDays.Temperature> getFourDaysWeathers() {
        String data = "<channel><title>Singapore - Nowcast and Forecast </title><source>Meteorological Service Singapore</source><item><title>4 Day Forecast</title><forecastIssue date=\"18-Oct-2016\" time=\"04:59 PM\"/><weatherForecast><day>Wednesday</day><forecast>Morning thundery showers.</forecast><icon>TL</icon><temperature high=\"33\" low=\"24\" unit=\"Degrees Celsius\"/><relativeHumidity high=\"95\" low=\"60\" unit=\"Percentage\"/><wind direction=\"SSW\" speed=\"10 - 25\"/><day>Thursday</day><forecast>Morning thundery showers.</forecast><icon>TL</icon><temperature high=\"33\" low=\"24\" unit=\"Degrees Celsius\"/><relativeHumidity high=\"95\" low=\"60\" unit=\"Percentage\"/><wind direction=\"S\" speed=\"10 - 20\"/><day>Friday</day><forecast>Late morning and early afternoon thundery showers.</forecast><icon>TL</icon><temperature high=\"34\" low=\"25\" unit=\"Degrees Celsius\"/><relativeHumidity high=\"95\" low=\"65\" unit=\"Percentage\"/><wind direction=\"S\" speed=\"10 - 20\"/><day>Saturday</day><forecast>Morning thundery showers.</forecast><icon>TL</icon><temperature high=\"33\" low=\"24\" unit=\"Degrees Celsius\"/><relativeHumidity high=\"95\" low=\"65\" unit=\"Percentage\"/><wind direction=\"SW\" speed=\"10 - 20\"/></weatherForecast></item></channel>";
            TikXml parser = new TikXml.Builder()
                    .exceptionOnUnreadXml(false)
                    .build();
            InputStream stream = new ByteArrayInputStream(data.getBytes());
            BufferedSource source = Okio.buffer(Okio.source(stream));
        FourDays.Channel fourDays = null;
        try {
            fourDays = parser.read(source, FourDays.Channel.class);
            Log.v(this.getClass().getSimpleName(), fourDays.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }



//        fourDays.item.weatherForecast.temperature

        return Observable.from(fourDays.item.weatherForecast.temperature)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /***
     *
    private void callWebAPI(String datasetName, String keyref) throws Exception {
    // Step 1: Construct URL
    String url = "http://api.nea.gov.sg/api/WebAPI/?dataset=" + datasetName +
            "&keyref=" + keyref;
    // Step 2: Call API Url
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection)obj.openConnection();
    con.setRequestMethod("GET");
    int responseCode = con.getResponseCode(); System.out.println("\nSending 'GET' request to URL : "+ url); System.out.println("Response Code : "+ responseCode);
    // Step 3: Check the response status
    if(responseCode == 200) {
// Step 3a: If response status == 200
// print the received xml System.out.println(readStream(con.getInputStream()));
    } else {
// Step 3b: If response status != 200
// print the error received from server System.out.println("Error in accessing API - " +
        readStream(con.getErrorStream()));
    } }
    // Read the responded result
    private String readStream(InputStream inputStream) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();
        return response.toString();
    }
     */

}
