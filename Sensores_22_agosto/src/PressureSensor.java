import java.time.LocalDate;

public class PressureSensor extends Sensor {

    public PressureSensor(double threshold, int yearBought) {
        super(threshold, yearBought);
    }

    public PressureSensor(double threshold, int yearBought, String groupId) {
        super(threshold, yearBought, groupId);
    }

    public boolean check() {
        return this.value > this.threshold;
    }

    public void send_alarm() {
        System.out.println("Sensor de presión activado");
    }
}
