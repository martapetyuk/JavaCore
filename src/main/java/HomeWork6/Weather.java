package HomeWork6;

import java.io.IOException;
import java.time.Period;
import java.util.List;

public interface Weather {
        void getWeather(String selectedCity, Period period) throws IOException;

        public List<Weather> getSavedToDBWeather();
    }
