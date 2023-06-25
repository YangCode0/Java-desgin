package factory.AbstractFactory;

/**
 * 抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
        IProductFactory huaweiFactory = new HuaweiFactory();
        IPhoneProduct iPhoneProduct = huaweiFactory.creatIPhone();
        iPhoneProduct.creatIPhone();
        IRouterProduct iRouterProduct = huaweiFactory.creatRouter();
        iRouterProduct.creatRouter();


        IProductFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct iPhoneProduct1 = xiaomiFactory.creatIPhone();
        iPhoneProduct1.creatIPhone();
        IRouterProduct iRouterProduct1 = xiaomiFactory.creatRouter();
        iRouterProduct1.creatRouter();
    }
}
