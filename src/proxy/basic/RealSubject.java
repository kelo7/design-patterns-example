package proxy.basic;

// RealSubject 类，定义Proxy 所代表的真实实体。
class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
