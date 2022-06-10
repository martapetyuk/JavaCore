package HomeWork6;

import java.io.IOException;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    private Weather weather = new WeatherModel() {
        @Override
        public void getWeather(String selectedCity, Period period) throws IOException {

        }

        @Override
        public List<Weather> getSavedToDBWeather() {
            return null;
        }
    };
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
      //  variants.put(1, Period.NOW);
      //  variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String userInput, String selectedCity) throws IOException {
        Integer userIntegerInput = Integer.parseInt(userInput);


        }
    }

