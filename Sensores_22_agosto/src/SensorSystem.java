import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SensorSystem {
    public boolean on;
    public HashMap<String, SensorGroup> sensor_groups;
    public ArrayList<Sensor> sensors;

    public SensorSystem() {
        this.on = false;
        this.sensor_groups = new HashMap<>();
        this.sensors = new ArrayList<>();
    }

    public void run() throws InterruptedException {
        //while (on) {
            for (Sensor sensor : sensors) {

                if (sensor.group_id != null) {
                    sensor_groups.get(sensor.group_id).add_reading(sensor.value);
                    continue;
                }

                if (sensor.check()) {
                    sensor.send_alarm();
                }
            }

            for (SensorGroup sg : sensor_groups.values()) {
                if (sg.calculate() > sg.getThreshold()) {
                    sg.send_alarm();
                }
            }
       // }
    }

    public void addSensorGroup(SensorGroup sensorGroup) {
        this.sensor_groups.put(sensorGroup.getId(), sensorGroup);
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        SensorSystem sensorSystem = new SensorSystem();
        SensorGroup group1 = new SensorGroup(10);
        SmokeSensor smokeSensor = new SmokeSensor(10, 2022, group1.getId());
        SmokeSensor smokeSensor2 = new SmokeSensor(10, 2021, group1.getId());
        smokeSensor.value = 15;
        smokeSensor2.value = 20;

        sensorSystem.addSensor(smokeSensor);
        sensorSystem.addSensor(smokeSensor2);

        sensorSystem.addSensorGroup(group1);
        //sensorSystem.run();

        menu.main(sensorSystem);
    }
}

/*
El sistema recorre en un bucle continuo todos sus elementos conectados. Cuando la medida de uno
de ellos supera su valor umbral el sistema dispara la alarma. En el caso del detector de humo la
alarma consiste en hacer un print que indique que llama a los bomberos, el sensor de temperatura
deberá imprimir: “¡Cuidado! La temperatura sube” y el sensor de presión: “Sensor de presión
activado”.

Para evitar falsas alarmas, varios elementos se pueden unir formando grupos de sensores y para
este sensor complejo que se forma la alama sólo se dispara si el valor medio de los elementos del
grupo supera el umbral definido para ese elemento compuesto.
Implementar todo lo relacionado con el disparo de la alarma, de los sensores por separado así como
también para el sensor complejo.
 */