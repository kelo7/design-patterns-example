package decorator.basic;

public class Demo {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // 装饰的方法是用 d1 对象来包装 c, 再用 d2 对象来包装 d1
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
