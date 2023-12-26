import Actors.Human;
import Actors.Policeman;
import Types.Device_type;

public class Main {
    public static void main(String[] args) {
        //creating out objects
        Human znaika = new Human("Знайка", 1);
        Human rigl = new Human("Ригль", 2);
        Barometer barometer = new Barometer("Барометр", 1, Device_type.Device);
        Anemometer anemometer = new Anemometer("Анемометр", 2, Device_type.Device);
        RainGauge rainGauge = new RainGauge("Дождемер", 3, Device_type.Device);
        AntiGravityDevice antiGravityDevice = new AntiGravityDevice("Прибор невесомости", 0, Device_type.Device);
        Policeman policemans = new Policeman("Полицейские", 0);
        Seismograth seismograth = new Seismograth("Сейсмограф", 4, Device_type.Device);
        Building vishka = new Building("Вышка", 5, Device_type.Building);

        //telling our plot
        policemans.shoot(" по ракете.");
        znaika.heard(", что пули барабанят по обшивке ракеты.");
        znaika.looked(" в иллюминатор.");
        policemans.shoot(" беспорядочно");
        rigl.think(" убедился, что пули не причиняют вреда ракете.");
        rigl.scream(", взмахнув дубинкой, <<Не прекращайте пальбы из ружей!>>.");
        policemans.run(" вперёд.");
        policemans.broke("разбили ", barometer, 1);
        barometer.tellstatus();
        policemans.broke("разломали ",seismograth, 4);
        seismograth.tellstatus();
        policemans.broke("изрешетили пулями ",rainGauge, 3);
        rainGauge.tellstatus();
        policemans.climb(vishka, 5);
        policemans.broke("разбили ",anemometer, 2);
        anemometer.tellstatus();
        rigl.switch_dev("включил", antiGravityDevice, 0, true);
        antiGravityDevice.tellstate();
        antiGravityDevice.activateAntiGravity();
        policemans.feel("почувствовали, что почва ушла из-под их ног.");
        policemans.think(" ничего не понимали.");
        policemans.fly("беспомощно кувыркались в воздухе, безалаберно размахивая руками, брыкаясь ногами и вихляясь всем телом. ");
        policemans.fly("сталкивались друг с другом.");
        policemans.fly("разлетались в стороны.");
        policemans.fly("взвивались кверху.");
        policemans.fly("падали вниз.");
        policemans.fly("отскакивали от земли, словно резиновые мячи, кверху.");
        policemans.climb(anemometer, 2);

    }
}
