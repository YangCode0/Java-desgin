package factory.SimpleFactory;

public class SimpleFactory {
    public static Product creat(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        return null;

    }

}
