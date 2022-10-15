package decorator.finery;

// Decorator
class Finery extends Person{
    protected Person component;
    // 打扮
    public void Decorate (Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if (component != null){
            component.show();
        }
    }

}
