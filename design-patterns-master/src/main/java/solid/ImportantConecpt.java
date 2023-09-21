package solid;

/*public class ImportantConecpt {
}*/
import java.util.*;

public class ImportantConecpt {
    public static void main(String[] args) {

        FlyingBehavior f=new FastFlyingBehavior();
        Eagle e=new Eagle(f);
        e.udJaTote();

        FlyingBehavior s=new SlowFlyingBehavior();
        e.setFlyingBehavior(s);
        e.udJaTote();

        FlyingBehavior g=new GlidingBehavior();
        e.setFlyingBehavior(g);
        e.udJaTote();

    }
}

class Eagle{

    private FlyingBehavior flyMan;

    public Eagle(FlyingBehavior iWouldFly){
        flyMan=iWouldFly;
    }
    public void udJaTote(){
        this.flyMan.fly();
    }
    public void setFlyingBehavior(FlyingBehavior newFlyingBehavior){
        this.flyMan=newFlyingBehavior;
    }
}





interface FlyingBehavior{
    public void fly();
}

class GlidingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.print("I can glide while flying");
    }
}

class SlowFlyingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.println("I can fly fast");
    }
}


class FastFlyingBehavior implements FlyingBehavior{
    public void fly(){
        System.out.println("I can fly slow");
    }
}

//Output:
//
//        I can fly slow
//        I can fly fast
//        I can glide while flying

//No similar but different terms.
//Dependency Injection is like in constructor you get the Dependency and assign it to the reference.
//Say your eagle class requires a flying behavior type object to be initialised, in that you can pass any kind of flying behavior
//let it be gliding or fast or slow or whatsoever.