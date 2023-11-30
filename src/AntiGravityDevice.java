import Actors.Device;

public class AntiGravityDevice extends Device {
    public AntiGravityDevice(String name) {
        super(name);
    }
    // Метод, специфичный для прибора невесомости
    public void activateAntiGravity() {
        System.out.println(getName() + " активирует режим невесомости.");
    }
}
