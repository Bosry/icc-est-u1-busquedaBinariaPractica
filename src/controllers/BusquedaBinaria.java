package controllers;

import models.Persona;
import controllers.PersonaController;

public class BusquedaBinaria {

    PersonaController personaController = new PersonaController();

    public Integer busquedaBinaria(int[] arr, int valorBuscado) {
        int isquierda = 0;
        int derecha = arr.length - 1;
        while (isquierda <= derecha) {
            int medio = (isquierda + derecha) / 2;
            if (arr[medio] == valorBuscado) {
                return medio;
            } else if (arr[medio] < valorBuscado) {
                isquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }

        }
        return -1;
    }

    public Persona binarySearchByName(Persona[] personas, String name) {

        int left = 0;
        int right = personas.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = personas[mid].getNombre().compareToIgnoreCase(name);

            if (compare == 0) {
                return personas[mid];
            }

            if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public Persona binarySearchByAge(Persona[] personas, int edad) {

        int left = 0;
        int right = personas.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            personaController.printEdad(personas, left, mid, right);
            System.out.println(direccion(left, right));

            int compare = personas[mid].getEdad();

            if (compare == edad) {
                return personas[mid];
            }

            if (compare < edad) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return null;
    }

    public String direccion(int buscado, int valorCentro) {
        if (buscado == valorCentro) {
            return "encontrado";
        } else if (buscado < valorCentro) {
            return "izquieda";
        } else {
            return "derecha";
        }
    }

}
