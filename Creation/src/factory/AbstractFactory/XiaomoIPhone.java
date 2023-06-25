package factory.AbstractFactory;

public class XiaomoIPhone implements IPhoneProduct {
    @Override
    public void creatIPhone() {
        System.out.println("小米手机");
    }
}
