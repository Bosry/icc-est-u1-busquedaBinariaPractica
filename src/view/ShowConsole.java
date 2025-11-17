package view;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorbuscado){
        if (resultado == -1) {
            System.out.println("El valor " + valorbuscado + " no se encuentra en el arreglo.");
        } else {
            System.out.println("El valor " + valorbuscado + " se encuentra en la posición " + resultado + " del arreglo.");
        }

    }

    public void showPersonResult(Persona persona, String nombreBusacado){
        if (persona == null) {
            System.out.println("La persona con nombre " + nombreBusacado + " no se encuentra en el arreglo.");
        } else {
            System.out.println("Se encontró a la persona: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

    }
    
}
