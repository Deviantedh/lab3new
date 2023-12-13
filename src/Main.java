import Actors.Human;
import Actors.Policeman;
import Conditions.Conditionhp;
import Conditions.Conditionpower;

public class Main {
    public static void main(String[] args) {
        //creating out objects
        Human znaika = new Human("Знайка", 1);
        Human rigl = new Human("Ригль", 2);
        Barometer barometer = new Barometer("Барометр", 1);
        Anemometer anemometer = new Anemometer("Анемометр", 2);
        RainGauge rainGauge = new RainGauge("Дождемер", 3);
        AntiGravityDevice antiGravityDevice = new AntiGravityDevice("Прибор невесомости", 0);
        Policeman policemans = new Policeman("Полицейские", 0);
        Seismograth seismograth = new Seismograth("Сейсмограф", 4);
        //test
        //System.out.println(znaika.hashCode());
        //System.out.println(rigl.hashCode());
        //System.out.println(policemans.hashCode());

        //telling our plot
        policemans.shoot(" по ракете.");
        znaika.heard(", что пули барабанят по обшивке ракеты.");
        znaika.lookat(" в иллюминатор.");
        policemans.shoot(" беспорядочно");
        rigl.think(" убедился, что пули не причиняют вреда ракете.");
        rigl.scream(", взмахнув дубинкой, <<Не прекращайте пальбы из ружей!>>.");
        policemans.run(" вперёд.");
        policemans.broke("разбили барометр.");
        barometer.hp = Conditionhp.broken;
        barometer.tellstatus();
        policemans.broke("разломали сейсмограф.");
        seismograth.hp = Conditionhp.broken;
        seismograth.tellstatus();
        policemans.broke("изрешетили пулями дождемер.");
        rainGauge.hp = Conditionhp.broken;
        rainGauge.tellstatus();
        policemans.climb(" на вышку.");
        policemans.broke("разбили анемометр.");
        anemometer.hp = Conditionhp.broken;
        anemometer.tellstatus();
        rigl.interact("включил прибор невесомости.");
        antiGravityDevice.condition = Conditionpower.on;
        antiGravityDevice.tellstate();
        policemans.feel("почувствовали, что почва ушла из-под их ног.");
        policemans.think(" ничего не понимали.");
        policemans.fly("беспомощно кувыркались в воздухе, безалаберно размахивая руками, брыкаясь ногами и вихляясь всем телом. ");
        policemans.fly("сталкивались друг с другом.");
        policemans.fly("разлетались в стороны.");
        policemans.fly("взвивались кверху.");
        policemans.fly("падали вниз.");
        policemans.fly("отскакивали от земли, словно резиновые мячи, кверху.");

    }
}
