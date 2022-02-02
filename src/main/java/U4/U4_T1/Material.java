package U4.U4_T1;

public class Material {

  // Atributos

  private String descripcionMaterial;
  private String proveedor;
  private Integer unidades;
  private Double precioUnidad;
  private static Double iva = 0.21;

  // Setter and Getter

  public String getDescripcionMaterial() {
    return descripcionMaterial;
  }

  public void setDescripcionMaterial(String descripcionMaterial) {
    this.descripcionMaterial = descripcionMaterial;
  }

  public String getProveedor() {
    return proveedor;
  }

  public void setProveedor(String proveedor) {
    this.proveedor = proveedor;
  }

  public Integer getUnidades() {
    return unidades;
  }

  public void setUnidades(Integer unidades) {
    if (unidades >= 1 && unidades <= 1000) {
      this.unidades = unidades;
    } else {
      System.out.println("Las unidades tienes que estar entre 1 y 1000");
    }
  }

  public Double getPrecioUnidad() {
    return precioUnidad;
  }

  public void setPrecioUnidad(Double precioUnidad) {

    if (precioUnidad >= 0 && precioUnidad <= 100000) {
      this.precioUnidad = precioUnidad;
    } else {
      System.out.println("El precio tiene que estar entre 0 y 100000");
    }
  }

  // Métodos para obtener y cambiar el iva

  public static Double getIva() {
    return iva;
  }

  public static void setIva(Double iva) {
    Material.iva = iva;
  }

  // Constructor con todos los datos

  public Material(
      String descripcionMaterial, String proveedor, Integer unidades, Double precioUnidad) {
    this.descripcionMaterial = descripcionMaterial;
    this.proveedor = proveedor;
    this.unidades = unidades;
    this.precioUnidad = precioUnidad;
  }

  // Constructor sin proveedor
  public Material(String descripcionMaterial, Integer unidades, Double precioUnidad) {
    this.descripcionMaterial = descripcionMaterial;
    this.unidades = unidades;
    this.precioUnidad = precioUnidad;
    this.proveedor = "Desconocido";
  }

  // Método mostrar información
  public void mostrar_informacion() {
    System.out.println("Material: " + this.descripcionMaterial);
    System.out.println("Proveedor: " + this.proveedor);
    System.out.println("Unidades: " + this.unidades);
    System.out.println("Precio por Unidad: " + this.precioUnidad);
    System.out.println("Precio total (sin IVA): " + this.unidades * this.precioUnidad);
    System.out.println(
        "Precio total (IVA includo): "
            + ((this.unidades * this.precioUnidad) + ((this.unidades * this.precioUnidad) * iva)));
  }
}
