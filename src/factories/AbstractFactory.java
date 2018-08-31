package factories;

import StandartHouses.StandartHouse;
import countryHouses.CountryHouse;
import skyscrapers.Skyscraper;

public interface AbstractFactory {
    public abstract Skyscraper createSkyscraper();
    public abstract CountryHouse createCountryHouse();
    public abstract StandartHouse createStandartHouse();
}
