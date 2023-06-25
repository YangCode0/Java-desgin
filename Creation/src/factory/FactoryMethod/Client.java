package factory.FactoryMethod;

import factory.SimpleFactory.Product;

/**
 * （2）工厂模式

 */

public class Client {
    public static void main(String[] args) {
//        BMW320 bmw320 = new BMW320();
//        BMW330 bmw330 = new BMW330();

        //简单工厂模式
//        factory.simple.Product a = SimpleFactory.creat("A");
//        a.operation();
//
//        Product b = SimpleFactory.creat("B");
//        b.operation();

        Factory concreteFactoryA = new ConcreteFactoryA();
        Product a = concreteFactoryA.creatFactory();
        a.operation();


    }
}
