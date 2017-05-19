/**
 * Created by s1220127 on 5/19/2017.
 */
public class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

    String callName(){
        return '['+this.getClass().getSimpleName()+']'+"Hey!"+getName()+"!\n";
    }

    String getName(){
        return name;
    }
}
class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    String callName(){
        return super.callName()+"bowbow!";
    }

}

class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    String callName(){
        return super.callName()+"meow";
    }
}