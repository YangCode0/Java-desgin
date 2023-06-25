package factory.AbstractFactory;

public class HuaweiIPhone implements IPhoneProduct {
    @Override
    public void creatIPhone() {
        System.out.println("huawei手机");
    }
}
