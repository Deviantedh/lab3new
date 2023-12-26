import Actors.Device;
import Types.Device_type;

public class RainGauge extends Device {

    public RainGauge(String name, int id, Device_type type) {
        super(name, id, type);
    }
    @Override
    protected void dowork() {
        System.out.println(this.name + " регистрирует уровень осадков");
    }

}
