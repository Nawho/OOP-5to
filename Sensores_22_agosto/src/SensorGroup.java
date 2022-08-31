import java.util.ArrayList;
import java.util.UUID;

public class SensorGroup
{
    private String id;
    private double threshold;
    private ArrayList<Double> values;

    public SensorGroup( double threshold ) {
        this.id = UUID.randomUUID().toString();
        this.threshold = threshold;
        this.values = new ArrayList<>();
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public String getId() {
        return id;
    }


    public void add_reading( double value ) {
        this.values.add( value );
    }

    public Double calculate() {
        Double sum = 0.0;

        for ( Double value : values ) {
            sum += value;
        }

        sum /= values.size();

        values.clear();

        return sum;
    }

    public void send_alarm() {
        System.out.printf("El grupo %s ha saltado\n", this.id);
    }
}
