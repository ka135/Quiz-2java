import java.util.Date;
import java.time.LocalDate;

/**
 * clase Principal
 */
public class Principal {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.printf("Fecha del sistema: %td/%tm/%tY %n",d,d,d);

        LocalDate fechaNacimientoKarolina = LocalDate.of(2006, 2, 11);
        Estudiante Karolina = new Estudiante("Karolina", fechaNacimientoKarolina);
        Karolina.setNotaMateria1(4.0);
        Karolina.setNotaMateria2(5.0);
        Karolina.setNotaMateria3(4.5);

        System.out.println("Nombre: "+ Karolina.getNombre());
        System.out.println("Fecha de nacimiento: "+ Karolina.getFechaNacimiento());
        System.out.println("Nota 1: "+ Karolina.getNotaMateria1());
        System.out.println("Nota 2: "+ Karolina.getNotaMateria2());
        System.out.println("Nota 3: "+ Karolina.getNotaMateria3());
        System.out.println("Promedio: "+ Karolina.getPromedio());
        System.out.println("Tiene " + Karolina.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoSofia = LocalDate.of(2005, 9, 7);
        Estudiante Sofia = new Estudiante("Sofia", fechaNacimientoSofia);
        Sofia.setNotaMateria1(3.0);
        Sofia.setNotaMateria2(5.0);
        Sofia.setNotaMateria3(4.5);

        System.out.println("Nombre: "+ Sofia.getNombre());
        System.out.println("Fecha de nacimiento: "+ Sofia.getFechaNacimiento());
        System.out.println("Nota 1: "+ Sofia.getNotaMateria1());
        System.out.println("Nota 2: "+ Sofia.getNotaMateria2());
        System.out.println("Nota 3: "+ Sofia.getNotaMateria3());
        System.out.println("Promedio: "+ Sofia.getPromedio());
        System.out.println("Tiene " + Sofia.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoMateo = LocalDate.of(2002, 4, 23);
        Estudiante Mateo = new Estudiante("Mateo", fechaNacimientoMateo);
        Mateo.setNotaMateria1(3.5);
        Mateo.setNotaMateria2(3.0);
        Mateo.setNotaMateria3(2.5);

        System.out.println("Nombre: "+ Mateo.getNombre());
        System.out.println("Fecha de nacimiento: "+ Mateo.getFechaNacimiento());
        System.out.println("Nota 1: "+ Mateo.getNotaMateria1());
        System.out.println("Nota 2: "+ Mateo.getNotaMateria2());
        System.out.println("Nota 3: "+ Mateo.getNotaMateria3());
        System.out.println("Promedio: "+ Mateo.getPromedio());
        System.out.println("Tiene " + Mateo.getEdad() + " años.");

    }
}
