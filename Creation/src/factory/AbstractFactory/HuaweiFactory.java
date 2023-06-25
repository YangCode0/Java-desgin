package factory.AbstractFactory;

public class HuaweiFactory implements IProductFactory {
    @Override
    public IPhoneProduct creatIPhone() {
        return new HuaweiIPhone();
    }

    @Override
    public IRouterProduct creatRouter() {
        return new HuaweiRouter();
    }
}
