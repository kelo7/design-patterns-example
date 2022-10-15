package decorator.finery;

// 因为只有一个 ConcreteComponent 类,所以不设置抽象的 Component 类了
// ConcreteCompenent
// 由于不设置抽象的 Component 了，会被装饰类直接继承
class Person {
    public Person(){}

    public String name;
    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
