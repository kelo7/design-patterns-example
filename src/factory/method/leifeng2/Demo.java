package factory.method.leifeng2;

import factory.method.leifeng1.LeiFeng;

// 工厂方法调用
public class Demo {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.CreateLeiFeng();

        student.BuyRice();
        student.Sweep();
        student.Wash();
    }
}
