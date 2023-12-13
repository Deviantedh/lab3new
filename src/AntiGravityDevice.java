import Actors.Device;

public class AntiGravityDevice extends Device {
    public AntiGravityDevice(String name, int id) {
        super(name, id);
    }
    // Метод, специфичный для прибора невесомости
    public void activateAntiGravity() {
        System.out.println(getName() + " активирует режим невесомости.");
    }
}
