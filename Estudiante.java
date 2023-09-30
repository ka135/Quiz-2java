import java.time.LocalDate;
import java.time.Period;
/**
 * clase Estudiante
 */
public class Estudiante {
    /**
     * Atributos
     */
    private String nombre;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private LocalDate fechaNacimiento;
    private double getPromedio;


    public Estudiante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.notaMateria1 = 0.0;
        this.notaMateria2 = 0.0;
        this.notaMateria3 = 0.0;
        this.getPromedio = getPromedio;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param nombre nombre del estudiante
     * @param fechaNacimiento fecha de nacimiento del estudiante
     * @param notaMateria1 nota numero uno del estudiante
     * @param notaMateria2 nota numero dos del estudiante
     * @param notaMateria3 nota numero tres del estudiante
     * @param getPromedio promedio de notas del estudiante
     *
     */


    /**
     * Getter
     */
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /**
     * Setter
     */
    public String getNombre() {
        return nombre;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    /**
     * Método edad actual
     */
    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método promedio de notas
     */
    public double getPromedio (){
        return (notaMateria1+notaMateria2+notaMateria3)/3;
    }

    public double getGetPromedio() {
        return getPromedio;
    }
}
