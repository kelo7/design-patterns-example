package decorator.basic;

class ConcreteDecoratorA extends Decorator{
    // 本类的独有功能，以区别于ConcreteDecoratorB
    private String addedState;

    public void operation(){
        // 首先运行原Component的operation()，再执行本类的功能，如addedState，相当于对原Component进行了装饰
        super.operation();
        addedState = "A 进行 add state 操作 ";
        System.out.println("具体装饰对象 A 的操作 —— " + addedState);

    }
}
