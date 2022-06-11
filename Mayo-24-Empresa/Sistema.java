import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class Sistema {
    Empresa empresa;

    public Sistema(Empresa empresa) {
        this.empresa = empresa;
    }

    public static float asistenciaPorMes(Empleado empleado, int Mes)
    {
        float entradasPorMes = 0;
        for(LocalDate entrada : empleado.getIngresosDiarios().keySet())
        {
            if(entrada.getMonthValue() == Mes) entradasPorMes++;
        }

        return (entradasPorMes / empleado.getDiasLaborales()) * 100;
    }


    public int cantidadDeEmpleadosActuales()
    {
        return empresa.getCantEmpleados();
    }


    public void empleadoAsistenciaCompleta(int mes)
    {
        for(Empleado empleado : empresa.getEmpleadosActuales())
        {
            if(asistenciaPorMes(empleado, mes) == 100)
            {
                System.out.println(empleado.obtenerDatos());
            }
        }
    }


    public void empleadosConAsistenciaMenorAl50(int mes){
        for(Empleado empleado : empresa.getEmpleadosActuales())
        {
            if(asistenciaPorMes(empleado, mes) < 50)
            {
                System.out.println(empleado.obtenerDatos());
            }
        }
    }


    public void empleadosQueLlegaronTarde(){
        for(Empleado empleado : empresa.getEmpleadosActuales())
        {
            for (LocalTime horaDeIngreso : empleado.getIngresosDiarios().values())
            {
                if (horaDeIngreso.compareTo(empleado.getHoraDeEntrada().plusMinutes(5)) > 0)
                {
                    System.out.println(empleado.obtenerDatos());
                    break;
                }
            }
        }
    }


    public int empleadosQueTrabajanEsteDia(DayOfWeek dia){
        int cantidadDeEmpleadosEnElDia = 0;
        for (Empleado empleado : empresa.getEmpleadosActuales())
        {
            if (empleado.getdiasEnDondeTrabajaSemanalmente().contains(dia))
            {
                cantidadDeEmpleadosEnElDia++;
            }
        }
        return cantidadDeEmpleadosEnElDia;
    }

    public HashMap<DayOfWeek, Integer> empleadosQueTrabajanPorDia()
    {
        HashMap<DayOfWeek, Integer> cantEmpleadosPorDia = new HashMap<>();
        for(DayOfWeek day : DayOfWeek.values())
        {
            empleadosQueTrabajanEsteDia(day);
            cantEmpleadosPorDia.put(day, empleadosQueTrabajanEsteDia(day));
        }
        return cantEmpleadosPorDia;
    }

    public void tablaAsistencia()
    {
        HashMap<DayOfWeek, Integer> cantEmpleadosPorDia = empleadosQueTrabajanPorDia();
        System.out.println("   DIA    | N° EMPLEADOS");
        System.out.println("LUNES     | " + cantEmpleadosPorDia.get(DayOfWeek.MONDAY));
        System.out.println("MARTES    | " + cantEmpleadosPorDia.get(DayOfWeek.TUESDAY));
        System.out.println("MIÉRCOLES | " + cantEmpleadosPorDia.get(DayOfWeek.WEDNESDAY));
        System.out.println("JUEVES    | " + cantEmpleadosPorDia.get(DayOfWeek.THURSDAY));
        System.out.println("VIERNES   | " + cantEmpleadosPorDia.get(DayOfWeek.FRIDAY));
        System.out.println("SABADO    | " + cantEmpleadosPorDia.get(DayOfWeek.SATURDAY));
        System.out.println("DOMINGO   | " + cantEmpleadosPorDia.get(DayOfWeek.SUNDAY));
    }
}
