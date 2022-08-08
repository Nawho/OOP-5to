import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Fecha {
    private int day, month, year;
    public static Map<Integer, Integer> DAYS_PER_MONTH = new HashMap() {{
        put(1, 31);
        put(2, 28);
        put(3, 31);
        put(4, 30);
        put(5, 31);
        put(6, 30);
        put(7, 31);
        put(8, 31);
        put(9, 30);
        put(10, 31);
        put(11, 30);
        put(12, 31);
    }};


    public Fecha(int day, int month, int year) {
        if (bisiesto(year)) {
            DAYS_PER_MONTH.replace(2, 29);
        }

        if(year > 2022) {
            throw new DateTimeException("El año ingresado todavia no llegó.");
        }

        if (!DAYS_PER_MONTH.containsKey(month)) {
            throw new DateTimeException("El mes ingresado no existe.");
        }

        if(day > DAYS_PER_MONTH.get(month)) {
            throw new DateTimeException("El mes que se ingresó no tiene tantos días.");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean bisiesto(int year){
            return (year % 4 == 0);
    }

    public void siguienteFecha() {
        if(this.month == 2) {
            if(!bisiesto(this.year)) DAYS_PER_MONTH.replace(2, 28);
        }
        if(this.day+1 > DAYS_PER_MONTH.get(this.month)) {
            if(this.month+1 > 12) {
                this.year++;
                this.month = 1;
                this.day = 1;
            }
            else this.month++; this.day = 1;
        }
        else day++;

        System.out.printf("%d, %d, %d", this.day, this.month, this.year);
    }

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(25, 2, 2020);
        Fecha fecha2 = new Fecha(25, 2, 2022);
        for (int i = 0; i < 10; i++) {
            fecha1.siguienteFecha();
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            fecha2.siguienteFecha();
            System.out.println();
        }
    }
}


