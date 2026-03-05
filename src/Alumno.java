public class Alumno {

    private int id;
    private String nombre;
    private String titulo;
    private int edad;

    /**
     * Metodo constructor de Alumno
     * @param id
     * @param nombre
     * @param titulo
     * @param edad
     */
    public Alumno(int id, String nombre, String titulo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.edad = edad;
    }

    /**
     * Devuelve el identificador del alumno
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del alumno
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el titulo del alumno
     * @return nombre
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve la edad del alumno
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Alumno { ");
        sb.append(String.format("Id: %d", id));
        sb.append(String.format("Nombre: %s", nombre));
        sb.append(String.format("Titulo: %s", titulo));
        sb.append(String.format("Edad: %d", edad));
        sb.append(" }");
        sb.append("\n");
        return sb.toString();
    }

}
