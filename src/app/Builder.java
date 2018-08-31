package app;

import factories.AbstractFactory;
import factories.CommercialFactory;
import factories.LivingFactory;

import java.util.Objects;
import java.util.Scanner;

public class Builder {


    public static Application configureApplication(){
        Application app;
        AbstractFactory abstractFactory;
        System.out.println("There are two types of buildings You can build: Commercial and Living. Choose whatever one");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Objects.equals(str, "Commercial")){
            abstractFactory = new CommercialFactory();
            app = new Application(abstractFactory);
        } else {
            abstractFactory = new LivingFactory();
            app = new Application(abstractFactory);
        }
        return app;
    }


    public static void main(String[] args){
        Application app = configureApplication();
        app.build();
    }
}
