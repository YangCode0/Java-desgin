package factory.AbstractFactory;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IPhoneProduct creatIPhone() {
        return new XiaomoIPhone();
    }

    @Override
    public IRouterProduct creatRouter() {
        return new XIaomiRouter();
    }
}
