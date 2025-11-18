package controllers;

import models.Persona;

public class PersonaController {
  public Persona findByName(Persona[] personas, String name) {
    for (Persona persona : personas) {
      if (persona.getNombre().equals(name)) {
        return persona;
      }
    }
    return null;

  }

  public void sortByName(Persona[] personas) {
    int n = personas.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
          // Intercambiar personas[j] y personas[j+1]
          Persona temp = personas[j];
          personas[j] = personas[j + 1];
          personas[j + 1] = temp;
        }
      }
    }
  }

  public void sortByAge(Persona[] personas) {
    int n = personas.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (personas[j].getEdad() > personas[j + 1].getEdad()) {
          Persona temp = personas[j];
          personas[j] = personas[j + 1];
          personas[j + 1] = temp;
        }
      }
    }
  }

  public void printArreglo(Persona[] personas) {
    System.out.print("[");
    for (Persona persona : personas) {
      if (persona == personas[personas.length - 1]) {
        System.out.print(persona.getEdad());
      } else {
        System.out.print(persona.getEdad() + ", ");
      }
    }
    System.out.println("]");
  }

  public void printEdad(Persona[] personas, int left, int mid, int right) {
    System.out.println("Bajo: " + left + ", Alto: " + right + ", Centro: " + mid + ", valorCentro: " + personas[mid].getEdad());
    System.out.print("[");
    for (int i = mid; i < personas.length; i++) {
      if (i == personas.length - 1) {
        System.out.print(personas[i].getEdad());
      } else {
        System.out.print(personas[i].getEdad() + ", ");
      }
    }
    System.out.println("]");
  }
}
