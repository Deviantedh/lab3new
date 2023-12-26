import Actors.Device;
import Types.Device_type;

public class Seismograth extends Device {

    public Seismograth(String name, int id, Device_type type) {
        super(name, id, type);
    }
    @Override
    protected void dowork() {
        System.out.println(this.name + " регистрирует сейсмическую активность");

    }


}