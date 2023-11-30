package Actors;
import Conditions.Conditionhp;
import Conditions.Conditionpower;

public abstract class Device {
    public String name;
    public Conditionpower condition = Conditionpower.off;
    public Conditionhp hp = Conditionhp.intact;
    protected int id;
    protected int co;

    public Device(String name) {
        this.id = co;
        co += 1;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void tellstate(){
        System.out.println(this.name + " " + condition.getAbbreviation());
    }
    public void tellstatus(){
        System.out.println(this.name + " " + hp.getAbbreviation());
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
            Device a = (Device) obj;
            return this.id == a.id;
        }
    }
}