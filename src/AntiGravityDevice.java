import Actors.Device;
import Types.Device_type;

public class AntiGravityDevice extends Device {


    public AntiGravityDevice(String name, int id, Device_type type) {
        super(name, id, type);
    }
    // Метод, специфичный для прибора невесомости
    public void activateAntiGravity() {
        System.out.println(getName() + " активирует режим невесомости.");
    }
    @Override
    protected void dowork() {
        System.out.println(this.name + " существует.");
    }
}
