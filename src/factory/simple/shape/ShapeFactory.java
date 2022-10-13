package factory.simple.shape;

// 3. 创建一个工厂，生成基于给定信息的实体类的对象
public class ShapeFactory {
    // 使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }
        // equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
