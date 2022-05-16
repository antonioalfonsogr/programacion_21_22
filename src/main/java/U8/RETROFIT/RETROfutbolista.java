package U8.RETROFIT;

public class RETROfutbolista {

    private Integer id;
    private String nombre;
    private String equipo;
    private RETROestadisticas es;

    public RETROfutbolista(Integer id, String nombre, String equipo, RETROestadisticas as) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.es = as;
    }
}
