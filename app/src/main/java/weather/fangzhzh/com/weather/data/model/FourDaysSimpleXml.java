package weather.fangzhzh.com.weather.data.model;


import org.simpleframework.xml.*;

import java.util.List;

/**
 * @author zhangzf
 * @since 18/10/16 4:59 PM
 */
@Root
public class FourDaysSimpleXml
{
    public Channel channel;

    @Override
    public String toString()
    {
        return "ClassPojo [channel = "+channel+"]";
    }

    @Root(name="channel", strict = false)
    public static class Channel
    {
        @Element
        public String title;

        @Element
        public String source;

        @Element
        public Item item;

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+", source = "+source+", item = "+item+"]";
        }
    }

    @Root
    public static class Item
    {
        @Element
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

    @Root
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

    @Root(strict = false)
    public static class WeatherForecast
    {
        @ElementList( entry = "day", inline = true)
        public List<String> days;

        @ElementList(entry = "icon", inline = true)
        public List<String> icons;

        @ElementList(entry = "wind", inline = true)
        public List<Wind> winds;

        @ElementList(entry = "relativeHumidity", inline = true)
        public List<RelativeHumidity> relativeHumiditys;

        @ElementList(entry = "forecast", inline = true)
        public List<String> forecasts;


        @ElementList(entry = "temperature", inline = true)
        public List<Temperature> temperatures;

        @Override
        public String toString() {
            return "WeatherForecast{" +
                    "icon=" + icons +
                    ", wind=" + winds +
                    ", relativeHumidity=" + relativeHumiditys +
                    ", forecast=" + forecasts +
                    ", day=" + days +
                    ", temperature=" + temperatures +
                    '}';
        }


    }

    @Root
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

    @Root
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


    @Root
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

}
