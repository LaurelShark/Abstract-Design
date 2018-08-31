package factories;

import StandartHouses.LivingStandartHouse;
import StandartHouses.StandartHouse;
import countryHouses.CountryHouse;
import countryHouses.LivingContryHouse;
import skyscrapers.LivingSkyscraper;
import skyscrapers.Skyscraper;

public class LivingFactory implements AbstractFactory {

    @Override
    public Skyscraper createSkyscraper(){
        return new LivingSkyscraper();
    }

    @Override
    public CountryHouse createCountryHouse(){
        return new LivingContryHouse();
    }

    @Override
    public StandartHouse createStandartHouse(){
        return new LivingStandartHouse();
    }
}
