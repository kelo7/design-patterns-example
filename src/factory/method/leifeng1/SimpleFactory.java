package factory.method.leifeng1;
// 简单工厂类
// 简单雷锋工厂
class SimpleFactory {
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng result = switch (type) {
            case "学雷锋的大学生" -> new Undergraduate();
            case "社区志愿者" -> new Volunteer();
            default -> null;
        };
        return result;
    }
}
