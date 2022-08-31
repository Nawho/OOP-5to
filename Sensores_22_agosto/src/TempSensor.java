import java.time.LocalDate;

public class TempSensor extends Sensor {
    public TempSensor(double threshold, int yearBought) {
        super(threshold, yearBought);
    }

    public TempSensor(double threshold, int yearBought, String groupId) {
        super(threshold, yearBought, groupId);
    }

    public boolean check() {
        return this.value > this.threshold;
    }

    public void send_alarm() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
