package factory.FactoryMethod;

import factory.SimpleFactory.ConcreteProductA;
import factory.SimpleFactory.Product;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product creatFactory() {
        return new ConcreteProductA();

    }
}
