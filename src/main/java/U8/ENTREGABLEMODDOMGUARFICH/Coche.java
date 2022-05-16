package U8.ENTREGABLEMODDOMGUARFICH;

public class Coche {

    private String marca;
    private String modelo;
    private Integer year;
    private Integer km;

    public Coche(String marca, String modelo, Integer year, Integer km) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", km=" + km +
                '}' + "\n";
    }
}
