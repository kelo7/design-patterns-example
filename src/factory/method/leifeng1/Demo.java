package factory.method.leifeng1;

// 使用简单工厂的学雷锋案例，为了方便与使用工厂方法的案例对比，放在此处
// 涉及类 LeiFeng Undergraduate Volunteer SimpleFactory
// 当需要将「学雷锋的大学生」修改为「社区志愿者」时，每个创建处都要修改
public class Demo {
    public static void main(String[] args) {
        LeiFeng studentA = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentA.BuyRice();
        LeiFeng studentB = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentA.Sweep();
        LeiFeng studentC = SimpleFactory.CreateLeiFeng("学雷锋的大学生");
        studentA.Wash();
    }
}
