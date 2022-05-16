package U8.STAXentregable;

public class objeto {

    private String calidad;
    private Integer altura;
    private Integer edad;
    private Integer peso;

    public objeto(String calidad, Integer altura, Integer edad, Integer peso) {
        this.calidad = calidad;
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "objeto{" +
                "calidad='" + calidad + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                ", peso=" + peso +
                '}' + "\n";
    }
}
