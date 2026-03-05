public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;


    /**
     * Metodo constructor de CentroFP
     *
     * @param maximos_alumnos cantidad maxima de alumnos
     */
    public CentroFP(int maximos_alumnos) {
        MAX_ALUMNOS = maximos_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];

    }

    /**
     * Metodo que busca un alumno por id
     *
     * @param id id del alumno
     * @return el alumno o null
     */
    public Alumno buscarAlumno(int id) {
        boolean alumnoEncontrado = true;
        Alumno alumno = null;

        for (int i = 0; i < MAX_ALUMNOS && alumnoEncontrado; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                alumno = alumnos[i];
                alumnoEncontrado = false;
            }
        }
        return alumno;
    }

    /**
     * Metodo que busca la primera poscion libre entre los alumnos
     *
     * @return la primera posicion libre
     */
    public int buscarPrimerHuecoLibre() {
        boolean seguirBuscando = true;
        int primerHuecoLibre = -1;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i] == null) {
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return primerHuecoLibre;
    }

    /**
     * Metodo que registra un alumno
     *
     * @param alumno alumno recibido
     * @return true si lo ha podido registrar o false si no ha podido
     */
    public boolean registrarAlumno(Alumno alumno) {
        boolean alumnoEncontrado = false;
        int poscionAlumno;

        if (buscarAlumno(alumno.getId()) == null) {
            poscionAlumno = buscarPrimerHuecoLibre();
            if (poscionAlumno >= 0) {
                alumnos[poscionAlumno] = alumno;
                alumnoEncontrado = true;
            }
        }
        return alumnoEncontrado;

    }

    /**
     * Metodo que muestra los alumnos registrados
     * @return los alumnos registrados
     */
    public String mostrarAlumnos(){
        StringBuilder sb = new StringBuilder("Alumnos registrados: \n");
        for(int i=0; i < MAX_ALUMNOS; i++){
            if(alumnos[i] != null){
                sb.append(alumnos[i].toString());
            }
        }
        return sb.toString();
    }

    /**
     * Metodo que cuenta los alumnos inscritos
     * @return el numero de alumnos inscritos
     */
    public int contarAlumnos(){
        int contador = 0;

        for(int i=0; i < MAX_ALUMNOS; i++){
            if(alumnos[i] != null){
                contador++;
            }
        }
        return contador;
    }



}




