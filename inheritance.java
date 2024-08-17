
public class inheritance {
    public static void main(String[] args) {
        human obj1=new human();
        obj1.feature10();
        obj1.feature7();
        obj1.feature1();

    }
}

class animal{
    void feature1(){
        System.out.println("can breathe");
    }
}
class fish extends animal{
    void feature2(){
        System.out.println("can swim inside water ");
    }
}
class tune extends fish{
    void feature3(){
        System.out.println("a bread of fish");
    }
}
class shark extends fish{
    void feature4(){
        System.out.println("a dangerous bread of fish");
    }
}
class bird extends animal{
    void feature5(){
        System.out.println("bird can fly");
    }
}
class peacock extends bird{
    void faeture6(){
        System.out.println("a special bread of bird");
    }
}
class mammal extends animal{
    void feature7(){
        System.out.println("mammal can walk");
    }
}
class dog extends mammal{
    void feature8(){
        System.out.println("dog can bark");
    }
}
class cat extends mammal{
    void feature9(){
        System.out.println("cat can meuw");
    }
}
class human extends mammal{
    void feature10(){
        System.out.println("worlds dangerous animal is human");
    }
}