package factory.FactoryMethod;

import factory.SimpleFactory.ConcreteProductB;
import factory.SimpleFactory.Product;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product creatFactory() {
        return new ConcreteProductB();
    }
}
