package factories;

import StandartHouses.CommercialStandartHouse;
import StandartHouses.StandartHouse;
import countryHouses.CommercialCountryHouse;
import countryHouses.CountryHouse;
import skyscrapers.CommercialSkyscraper;
import skyscrapers.Skyscraper;

public class CommercialFactory implements AbstractFactory {

    @Override
    public Skyscraper createSkyscraper(){
        return new CommercialSkyscraper();
    }

    @Override
    public CountryHouse createCountryHouse() {
        return new CommercialCountryHouse();
    }

    @Override
    public StandartHouse createStandartHouse() {
        return new CommercialStandartHouse();
    }
}
