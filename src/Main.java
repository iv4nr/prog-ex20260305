public class Main {
    public static void main(String[] args) {


        CentroFP Uax = new CentroFP(20);

        Alumno alumno1 = new Alumno(1, "Iván", "DAM", 19);
        Alumno alumno2 = new Alumno(2, "Jose", "AFI", 23);
        Alumno alumno3 = new Alumno(3, "Juan", "ASIR", 18);


        System.out.println("Alumno registrado: " + Uax.registrarAlumno(alumno1));
        System.out.println("Alumno registrado: " + Uax.registrarAlumno(alumno2));
        System.out.println("Alumno registrado: " + Uax.registrarAlumno(alumno3));
        System.out.println("Alumno registrado: " + Uax.registrarAlumno(alumno1));

        System.out.println("Alumno buscado: " + Uax.buscarAlumno(1));
        System.out.println("Alumno buscado: " + Uax.buscarAlumno(4));

        System.out.println("Alumnos totales: " + Uax.contarAlumnos());

        System.out.println(Uax.mostrarAlumnos());
    }

}
