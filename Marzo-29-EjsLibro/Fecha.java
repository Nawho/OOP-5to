import java.util.HashMap;

public class Fecha {
    int day;
    int month;
    int year;

    private final HashMap<Integer, Integer> daysInMonths = new HashMap<Integer, Integer>() {{
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

    public int daysInMonth(int month){
        return daysInMonths.get(month);
    }

    private int[] addMonth(int month, int year){
        if (month <= 11) month++;
        else {
            year++;
            month -= 12;
        }

        return new int[]{month, year};
    }



    private int[] normalize(int day, int month, int year){
        while (month > 12) {
            year++;
            month -= 12;
        }

        int[] monthAndYear = addMonth(month, year);
        month = monthAndYear[0];
        year = monthAndYear[1];

        while (day > daysInMonth(month)){
            day -= daysInMonth(month);

            int[] monthAndYear2 = addMonth(month, year);
            month = monthAndYear2[0];
            year = monthAndYear2[1];
        }



        return new int[]{day, month, year};
    }

    private boolean isValid(int[] dmy){
        if (dmy[2] < 1) return false;
        if (dmy[1] < 1 || dmy[1] > 12) return false;
        return dmy[0] >= 1 && dmy[0] <= daysInMonth(dmy[1]);
    }


    public Fecha(){
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void reWrite(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(int day, int month, int year){
        int results[] = normalize(this.day + day, this.month + month, this.year + year);
        if (!isValid(results)) {
            System.out.println("date is not valid");
            return;
        }

        this.day = results[0];
        this.month = results[1];
        this.year =  results[2];
    }

    public void mostrar(){
        System.out.println("Day: " + this.day);
        System.out.println("Month: " + this.month);
        System.out.println("Year: " + this.year);
    }
}
