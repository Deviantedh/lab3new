package Actors;
import Moves.*;

public class Policeman extends Human implements Policeman_moves{

    public Policeman(String name, int id) {
        super(name, id);
    }
    @Override
    public void shoot(String a){ System.out.println(this.name + " стреляли" + a);}

    @Override
    public void broke(String a) {
        System.out.println(this.name + " " + a);
    }

    @Override
    public void run(String a) {
        System.out.println(this.name + " побежали" + a);
    }

    @Override
    public void fly(String a) {
        System.out.println(this.name + " " + a);
    }

    @Override
    public void climb(String a) {
        System.out.println(this.name + " полезли" + a);
    }

}
