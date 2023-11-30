package Actors;

import Moves.*;

public class Human implements Hear, Attack, Break, Feel, Look, Move, Talk, Think, Interact {
    protected int id;
    protected int co;
    private String name;

    public Human(String name) {
        this.id = co;
        co += 1;
        this.name = name;

    }
    public String getName() {
        return name;
    }
    @Override
    public void heard(String a) {
        System.out.println(this.name + " услышал" + a);
    }
    @Override
    public void shoot(String a){ System.out.println(this.name + " стреляли" + a);}

    @Override
    public void broke(String a) {
        System.out.println(this.name + " " + a);
    }

    @Override
    public void feel(String a) {
        System.out.println(this.name + " " + a);
    }

    @Override
    public void lookat(String a) {
        System.out.println(this.name + " посмотрел" + a);
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

    @Override
    public void say(String a) {
        System.out.println(this.name + " сказал" + a);
    }

    @Override
    public void scream(String a) {
        System.out.println(this.name + " закричал" + a);
    }

    @Override
    public void think(String a) {
        System.out.println(this.name + a);
    }

    @Override
    public void interact(String a) {
        System.out.println(this.name + " " + a);
    }
    @Override
    public int hashCode() {
        return id;
    };

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Human a = (Human) obj;
            return this.id == a.id;
        }
    }
}