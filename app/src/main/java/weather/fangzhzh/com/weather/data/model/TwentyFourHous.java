package weather.fangzhzh.com.weather.data.model;

/**
 * @author zhangzf
 * @since 18/10/16 4:43 PM
 */
public class TwentyFourHous
{
    private Channel channel;

    public Channel getChannel ()
    {
        return channel;
    }

    public void setChannel (Channel channel)
    {
        this.channel = channel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [channel = "+channel+"]";
    }

    public static class Night
    {
        private String timePeriod;

        private String wxeast;

        private String wxnorth;

        private String wxcentral;

        private String wxsouth;

        private String wxwest;

        public String getTimePeriod ()
        {
            return timePeriod;
        }

        public void setTimePeriod (String timePeriod)
        {
            this.timePeriod = timePeriod;
        }

        public String getWxeast ()
        {
            return wxeast;
        }

        public void setWxeast (String wxeast)
        {
            this.wxeast = wxeast;
        }

        public String getWxnorth ()
        {
            return wxnorth;
        }

        public void setWxnorth (String wxnorth)
        {
            this.wxnorth = wxnorth;
        }

        public String getWxcentral ()
        {
            return wxcentral;
        }

        public void setWxcentral (String wxcentral)
        {
            this.wxcentral = wxcentral;
        }

        public String getWxsouth ()
        {
            return wxsouth;
        }

        public void setWxsouth (String wxsouth)
        {
            this.wxsouth = wxsouth;
        }

        public String getWxwest ()
        {
            return wxwest;
        }

        public void setWxwest (String wxwest)
        {
            this.wxwest = wxwest;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [timePeriod = "+timePeriod+", wxeast = "+wxeast+", wxnorth = "+wxnorth+", wxcentral = "+wxcentral+", wxsouth = "+wxsouth+", wxwest = "+wxwest+"]";
        }
    }

    public static class RelativeHumidity
    {
        private String unit;

        private String high;

        private String low;

        public String getUnit ()
        {
            return unit;
        }

        public void setUnit (String unit)
        {
            this.unit = unit;
        }

        public String getHigh ()
        {
            return high;
        }

        public void setHigh (String high)
        {
            this.high = high;
        }

        public String getLow ()
        {
            return low;
        }

        public void setLow (String low)
        {
            this.low = low;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [unit = "+unit+", high = "+high+", low = "+low+"]";
        }
    }

    public static class Afternoon
    {
        private String timePeriod;

        private String wxeast;

        private String wxnorth;

        private String wxcentral;

        private String wxsouth;

        private String wxwest;

        public String getTimePeriod ()
        {
            return timePeriod;
        }

        public void setTimePeriod (String timePeriod)
        {
            this.timePeriod = timePeriod;
        }

        public String getWxeast ()
        {
            return wxeast;
        }

        public void setWxeast (String wxeast)
        {
            this.wxeast = wxeast;
        }

        public String getWxnorth ()
        {
            return wxnorth;
        }

        public void setWxnorth (String wxnorth)
        {
            this.wxnorth = wxnorth;
        }

        public String getWxcentral ()
        {
            return wxcentral;
        }

        public void setWxcentral (String wxcentral)
        {
            this.wxcentral = wxcentral;
        }

        public String getWxsouth ()
        {
            return wxsouth;
        }

        public void setWxsouth (String wxsouth)
        {
            this.wxsouth = wxsouth;
        }

        public String getWxwest ()
        {
            return wxwest;
        }

        public void setWxwest (String wxwest)
        {
            this.wxwest = wxwest;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [timePeriod = "+timePeriod+", wxeast = "+wxeast+", wxnorth = "+wxnorth+", wxcentral = "+wxcentral+", wxsouth = "+wxsouth+", wxwest = "+wxwest+"]";
        }
    }

    public static class Temperature
    {
        private String unit;

        private String high;

        private String low;

        public String getUnit ()
        {
            return unit;
        }

        public void setUnit (String unit)
        {
            this.unit = unit;
        }

        public String getHigh ()
        {
            return high;
        }

        public void setHigh (String high)
        {
            this.high = high;
        }

        public String getLow ()
        {
            return low;
        }

        public void setLow (String low)
        {
            this.low = low;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [unit = "+unit+", high = "+high+", low = "+low+"]";
        }
    }

    public static class Main
    {
        private Wind wind;

        private String title;

        private RelativeHumidity relativeHumidity;

        private String forecast;

        private String wxmain;

        private String pastweather;

        private ForecastIssue forecastIssue;

        private Temperature temperature;

        public Wind getWind ()
        {
            return wind;
        }

        public void setWind (Wind wind)
        {
            this.wind = wind;
        }

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public RelativeHumidity getRelativeHumidity ()
        {
            return relativeHumidity;
        }

        public void setRelativeHumidity (RelativeHumidity relativeHumidity)
        {
            this.relativeHumidity = relativeHumidity;
        }

        public String getForecast ()
        {
            return forecast;
        }

        public void setForecast (String forecast)
        {
            this.forecast = forecast;
        }

        public String getWxmain ()
        {
            return wxmain;
        }

        public void setWxmain (String wxmain)
        {
            this.wxmain = wxmain;
        }

        public String getPastweather ()
        {
            return pastweather;
        }

        public void setPastweather (String pastweather)
        {
            this.pastweather = pastweather;
        }

        public ForecastIssue getForecastIssue ()
        {
            return forecastIssue;
        }

        public void setForecastIssue (ForecastIssue forecastIssue)
        {
            this.forecastIssue = forecastIssue;
        }

        public Temperature getTemperature ()
        {
            return temperature;
        }

        public void setTemperature (Temperature temperature)
        {
            this.temperature = temperature;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [wind = "+wind+", title = "+title+", relativeHumidity = "+relativeHumidity+", forecast = "+forecast+", wxmain = "+wxmain+", pastweather = "+pastweather+", forecastIssue = "+forecastIssue+", temperature = "+temperature+"]";
        }
    }

    public static class Wind
    {
        private String speed;

        private String direction;

        public String getSpeed ()
        {
            return speed;
        }

        public void setSpeed (String speed)
        {
            this.speed = speed;
        }

        public String getDirection ()
        {
            return direction;
        }

        public void setDirection (String direction)
        {
            this.direction = direction;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [speed = "+speed+", direction = "+direction+"]";
        }
    }

    public static class Channel
    {
        private String title;

        private String source;

        private Afternoon afternoon;

        private Morn morn;

        private Nextnight nextnight;

        private Night night;

        private Main main;

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public String getSource ()
        {
            return source;
        }

        public void setSource (String source)
        {
            this.source = source;
        }

        public Afternoon getAfternoon ()
        {
            return afternoon;
        }

        public void setAfternoon (Afternoon afternoon)
        {
            this.afternoon = afternoon;
        }

        public Morn getMorn ()
        {
            return morn;
        }

        public void setMorn (Morn morn)
        {
            this.morn = morn;
        }

        public Nextnight getNextnight ()
        {
            return nextnight;
        }

        public void setNextnight (Nextnight nextnight)
        {
            this.nextnight = nextnight;
        }

        public Night getNight ()
        {
            return night;
        }

        public void setNight (Night night)
        {
            this.night = night;
        }

        public Main getMain ()
        {
            return main;
        }

        public void setMain (Main main)
        {
            this.main = main;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+", source = "+source+", afternoon = "+afternoon+", morn = "+morn+", nextnight = "+nextnight+", night = "+night+", main = "+main+"]";
        }
    }

    public static class ForecastIssue
    {
        private String time;

        private String date;

        public String getTime ()
        {
            return time;
        }

        public void setTime (String time)
        {
            this.time = time;
        }

        public String getDate ()
        {
            return date;
        }

        public void setDate (String date)
        {
            this.date = date;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [time = "+time+", date = "+date+"]";
        }
    }

    public static class Morn
    {
        private String content;

        private String timePeriod;

        private String wxeast;

        private String wxnorth;

        private String wxcentral;

        private String wxsouth;

        private String wxwest;

        public String getContent ()
        {
            return content;
        }

        public void setContent (String content)
        {
            this.content = content;
        }

        public String getTimePeriod ()
        {
            return timePeriod;
        }

        public void setTimePeriod (String timePeriod)
        {
            this.timePeriod = timePeriod;
        }

        public String getWxeast ()
        {
            return wxeast;
        }

        public void setWxeast (String wxeast)
        {
            this.wxeast = wxeast;
        }

        public String getWxnorth ()
        {
            return wxnorth;
        }

        public void setWxnorth (String wxnorth)
        {
            this.wxnorth = wxnorth;
        }

        public String getWxcentral ()
        {
            return wxcentral;
        }

        public void setWxcentral (String wxcentral)
        {
            this.wxcentral = wxcentral;
        }

        public String getWxsouth ()
        {
            return wxsouth;
        }

        public void setWxsouth (String wxsouth)
        {
            this.wxsouth = wxsouth;
        }

        public String getWxwest ()
        {
            return wxwest;
        }

        public void setWxwest (String wxwest)
        {
            this.wxwest = wxwest;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [content = "+content+", timePeriod = "+timePeriod+", wxeast = "+wxeast+", wxnorth = "+wxnorth+", wxcentral = "+wxcentral+", wxsouth = "+wxsouth+", wxwest = "+wxwest+"]";
        }
    }

    public static class Nextnight
    {
        private String timePeriod;

        private String wxeast;

        private String wxnorth;

        private String wxcentral;

        private String wxsouth;

        private String wxwest;

        public String getTimePeriod ()
        {
            return timePeriod;
        }

        public void setTimePeriod (String timePeriod)
        {
            this.timePeriod = timePeriod;
        }

        public String getWxeast ()
        {
            return wxeast;
        }

        public void setWxeast (String wxeast)
        {
            this.wxeast = wxeast;
        }

        public String getWxnorth ()
        {
            return wxnorth;
        }

        public void setWxnorth (String wxnorth)
        {
            this.wxnorth = wxnorth;
        }

        public String getWxcentral ()
        {
            return wxcentral;
        }

        public void setWxcentral (String wxcentral)
        {
            this.wxcentral = wxcentral;
        }

        public String getWxsouth ()
        {
            return wxsouth;
        }

        public void setWxsouth (String wxsouth)
        {
            this.wxsouth = wxsouth;
        }

        public String getWxwest ()
        {
            return wxwest;
        }

        public void setWxwest (String wxwest)
        {
            this.wxwest = wxwest;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [timePeriod = "+timePeriod+", wxeast = "+wxeast+", wxnorth = "+wxnorth+", wxcentral = "+wxcentral+", wxsouth = "+wxsouth+", wxwest = "+wxwest+"]";
        }
    }
}

