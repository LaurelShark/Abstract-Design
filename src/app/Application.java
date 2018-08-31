package app;

import StandartHouses.StandartHouse;
import countryHouses.CountryHouse;
import factories.AbstractFactory;
import skyscrapers.Skyscraper;

public class Application {

    private Skyscraper skyscraper;
    private CountryHouse countryHouse;
    private StandartHouse standartHouse;

    public Application(AbstractFactory abstractFactory){
        skyscraper = abstractFactory.createSkyscraper();
        countryHouse = abstractFactory.createCountryHouse();
        standartHouse = abstractFactory.createStandartHouse();
    }

    public void build(){
        skyscraper.build();
        countryHouse.build();
        standartHouse.build();
    }
}
