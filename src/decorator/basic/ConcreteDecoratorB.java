package decorator.basic;

public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation(){
        // 首先运行原 Component 的 Operation()
        // 在执行本类的功能，如 AddedBehavior()，相当于对原 Component 进行了装饰
        super.operation();
        System.out.println("具体装饰对象 B 的操作 ——");
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("B 进行了 Add Behavior 操作");
    }
}
