import Actors.Device;
import Types.Device_type;

public class Barometer extends Device {

    public Barometer(String name, int id, Device_type type) {
        super(name, id, type);
    }
    @Override
    protected void dowork() {
        System.out.println(this.name + " регистрирует уровень давления");
    }

}