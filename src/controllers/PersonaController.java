package controllers;

import models.Persona;

public class PersonaController {
  public Persona findByName( Persona[] personas, String name) {
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
}
