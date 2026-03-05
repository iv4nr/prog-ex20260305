public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Metodo constructor de CentroFP
     * @param maximos_alumnos cantidad maxima de alumnos
     */
    public CentroFP(int maximos_alumnos) {
        MAX_ALUMNOS = maximos_alumnos;
        alumnos = new Alumno[MAX_ALUMNOS];

    }

    /**
     * Metodo que busca un alumno por id
     * @param id id del alumno
     * @return el alumno o null
     */
    public Alumno buscarAlumno(int id){
        boolean alumnoEncontrado = true;
        Alumno alumno = null;

        for(int i = 0; i < MAX_ALUMNOS && alumnoEncontrado; i++){
            if(alumnos[i] != null && alumnos[i].getId() == id){
                alumnos[i] = alumno;
                alumnoEncontrado = false;
            }
        }
        return alumno;
    }

    /**
     * Metodo que busca la primera poscion libre entre los alumnos
     * @return la primera posicion libre
     */
    public int buscarPrimerHuecoLibre(){
        boolean seguirBuscando = true;
        int primerHuecoLibre = -1;

        for(int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++){
            if(alumnos[i] == null){
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return primerHuecoLibre;
    }





}

