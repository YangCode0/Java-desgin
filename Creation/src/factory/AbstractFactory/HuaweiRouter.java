package factory.AbstractFactory;

public class HuaweiRouter implements IRouterProduct {
    @Override
    public void creatRouter() {
        System.out.println("huawei路由器");
    }
}
