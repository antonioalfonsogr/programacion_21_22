package Test;

import java.util.Arrays;

public class Personas {

  // Atributos
  protected Persona[] personasArray;
  private int indice;

  // Constructor
  public Personas(int num) {
    this.personasArray = new Persona[num];
    this.indice = 0;
  }

  public Personas() {
    this.personasArray = new Persona[5];
    this.indice = 0;
  }

  // Getter
  public Persona[] getPersonasArray() {
    return personasArray;
  }

  public int getIndice() {
    return indice;
  }

  // toString

  @Override
  public String toString() {
    return Arrays.toString(personasArray);
  }

  // addPersona

  public void addPersona(Persona pers) {
    if (indice >= personasArray.length) {
      personasArray = Arrays.copyOf(personasArray, personasArray.length + 1);
    }
    personasArray[indice] = pers;
    indice++;
  }

  // eliminarPersona por indice
  public void eliminarPersona(int ind) {
    Persona[] aux = new Persona[indice - 1];
    for (int i = 0; i < ind; i++) {
      aux[i] = personasArray[i];
    }
    for (int i = ind; i < aux.length; i++) {
      aux[i] = personasArray[i + 1];
    }
    indice--;

    personasArray = Arrays.copyOf(aux, aux.length);
  }

  // obtener indice
  public int obtenerIndicexEdad(int numEdad) {
    int ind = -1;

    for (int i = 0; i < personasArray.length; i++) {
      if (personasArray[i].getEdad() == numEdad) {
        ind = i;
      }
    }
    return ind;
  }

  // eliminaPersonanEdad
  public void elimnaPersonaEdad(int edadEliminar) {
    while (obtenerIndicexEdad(edadEliminar) != -1) {
      eliminarPersona(obtenerIndicexEdad(edadEliminar));
    }
  }
}
