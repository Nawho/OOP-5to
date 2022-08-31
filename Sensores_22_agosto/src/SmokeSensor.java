import java.time.LocalDate;

public class SmokeSensor extends Sensor{
    public SmokeSensor(double threshold, int yearBought) {
        super(threshold, yearBought);
    }
    public SmokeSensor(double threshold, int yearBought, String groupId) {
        super(threshold, yearBought, groupId);
    }


    public boolean check() {
        return this.value > this.threshold;
    }

    public void send_alarm() {
        System.out.println("Se te quema la casa flaco!!!");
    }
}
