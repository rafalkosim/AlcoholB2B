package pl.b2b.alcohol;

import java.util.ArrayList;
import java.util.List;

public class ConfigAlcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {
        Alcohol result = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() > result.getPrice()) {
                result = alcohol;
            }

        }

        return result.getName();
    }

    public String cheapAlcohol(List<Alcohol> alcohols) {
        Alcohol result = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() < result.getPrice()) {
                result = alcohol;
            }

        }

        return result.getName();
    }

    public double averagePrice(List<Alcohol> alcohols) {

        double average;
        double sum = 0;

        for (Alcohol alcohol : alcohols) {

            sum += alcohol.getPrice();
        }

        average = sum / alcohols.size();

        return average;
    }

    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {

        List<String> names = new ArrayList<>();
        double average = averagePrice(alcohols);

        for (Alcohol alcohol : alcohols) {

            if (average < alcohol.getPrice()) {
                names.add(alcohol.getName());
            }

        }

        return names;
    }

    public String nameAndPrice(Alcohol alcohol) {

        return alcohol.getName() + " " + alcohol.getPrice();
    }

    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {

        List<String> names = new ArrayList<>();
        double average = averagePrice(alcohols);

        for (Alcohol alcohol : alcohols) {

            if (alcohol.getPrice() < average) {
                names.add(nameAndPrice(alcohol));            }
        }

        return names;
    }

}
