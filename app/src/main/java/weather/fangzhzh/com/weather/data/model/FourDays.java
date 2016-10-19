package weather.fangzhzh.com.weather.data.model;

import com.tickaroo.tikxml.annotation.*;

import java.util.List;

import hugo.weaving.DebugLog;

/**
 * @author zhangzf
 * @since 18/10/16 4:59 PM
 */
@DebugLog
@Xml(name="fourdays")
public class FourDays
{
    public Channel channel;

    @Override
    public String toString()
    {
        return "ClassPojo [channel = "+channel+"]";
    }

    @Xml(name="channel")
    public static class Channel
    {
        @PropertyElement
        public String title;

        @PropertyElement
        public String source;

        @Element
        public Item item;

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+", source = "+source+", item = "+item+"]";
        }
    }

    @Xml(name="item")
    public static class Item
    {
        @PropertyElement
        public String title;

        @Element
        public WeatherForecast weatherForecast;

        @Element
        public ForecastIssue forecastIssue;

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+", weatherForecast = "+weatherForecast+", forecastIssue = "+forecastIssue+"]";
        }
    }

    @Xml(name="forecastIssue")
    public static class ForecastIssue
    {
        @Attribute
        public String time;

        @Attribute
        public String date;


        @Override
        public String toString()
        {
            return "ClassPojo [time = "+time+", date = "+date+"]";
        }
    }

    @Xml(name="weatherForecast")
    public static class WeatherForecast
    {
        @Element
        public List<Icon> icon;

        @Element
        public List<Wind> wind;

        @Element
        public List<RelativeHumidity> relativeHumidity;

        @Element
        public List<Forecast> forecast;
//
        @Element
        public List<Day> days;

        @Element
        public List<Temperature> temperature;

        @Override
        public String toString() {
            return "WeatherForecast{" +
                    "icon=" + icon +
                    ", wind=" + wind +
                    ", relativeHumidity=" + relativeHumidity +
                    ", forecast=" + forecast +
                    ", day=" + days +
                    ", temperature=" + temperature +
                    '}';
        }


    }

    @Xml(name="temperature")
    public static class Temperature
    {
        @Attribute
        public String unit;

        @Attribute
        public String high;

        @Attribute
        public String low;



        @Override
        public String toString()
        {
            return "ClassPojo [unit = "+unit+", high = "+high+", low = "+low+"]";
        }
    }

    @Xml(name="relativeHumidity")
    public static class RelativeHumidity
    {
        @Attribute
        public String unit;

        @Attribute
        public String high;

        @Attribute
        public String low;

        @Override
        public String toString()
        {
            return "ClassPojo [unit = "+unit+", high = "+high+", low = "+low+"]";
        }
    }


    @Xml(name="wind")
    public static class Wind
    {
        @Attribute
        public String speed;

        @Attribute
        public String direction;

        @Override
        public String toString()
        {
            return "ClassPojo [speed = "+speed+", direction = "+direction+"]";
        }
    }

    @Xml(name="day")
    public static class Day{
        @TextContent
        public String day;

        @Override
        public String toString() {
            return "Day{" +
                    "day='" + day + '\'' +
                    '}';
        }
    }

    @Xml(name="icon")
    public static class Icon {
        @TextContent
        public String icon;

        @Override
        public String toString() {
            return "Icon{" +
                    "icon='" + icon + '\'' +
                    '}';
        }
    }

    @Xml(name="forecast")
    public static class Forecast{
        @TextContent
        public String forecast;

        @Override
        public String toString() {
            return "Forecast{" +
                    "forecast='" + forecast + '\'' +
                    '}';
        }
    }



}
