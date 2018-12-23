package com.zy.innerClass;

interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class ServiceImplemention1 implements Service{
    private ServiceImplemention1(){};
    public void method1()
    {
        System.out.println("ServiceImplemention1.method1()");
    }
    public void method2()
    {
        System.out.println("ServiceImplemention1.method2()");
    }
    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new ServiceImplemention1();
        }
    };
}
class ServiceImplemention2 implements Service{
    private ServiceImplemention2(){};
    public void method1()
    {
        System.out.println("ServiceImplemention2.method1()");
    }
    public void method2()
    {
        System.out.println("ServiceImplemention2.method2()");
    }
    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new ServiceImplemention2();
        }
    };
}

public class Factories {
    public static void serviceCussumer(ServiceFactory factory)
    {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args)
    {
        serviceCussumer(ServiceImplemention1.factory);
        serviceCussumer(ServiceImplemention2.factory);
    }
}
