import java.time.LocalDate;
import java.time.Year;

public abstract class Sensor {
    public boolean on;
    public double value;
    public double threshold;
    public int yearBought;
    public String group_id;

    public Sensor(double threshold, int yearBought) {
        this.on = false;
        this.value = 0;
        this.threshold = threshold;
        this.yearBought = yearBought;
        this.group_id = null;
    }

    public Sensor(double threshold, int yearBought, String group_id) {
        this.on = false;
        this.value = 0;
        this.threshold = threshold;
        this.yearBought = yearBought;
        this.group_id = group_id;
    }

    public abstract boolean check();

    public abstract void send_alarm();

    @Override
    public String toString() {
        return "{ on: " + this.on + ", value: " + this.value + ", threshold: " + this.threshold +
                ", yearBought: " + this.yearBought + ", groupId: " + this.group_id + " }";
    }
}

/*
2- Un edificio tiene un sistema de alarmas que incluye detectores de humo, sensores de
temperatura y sensores de presión. Todos estos elementos tienen un estado:
conectado/desconectado y son capaces de proporcionar una medida (un valor real) en el momento
que son consultados y tienen un valor umbral que se fija inicialmente al crear el elemento. Además,
de cualquier dispositivo importa saber el año en que se adquirió ya que de esa forma se sabrá
cuando corresponde cambiarlo.
*/