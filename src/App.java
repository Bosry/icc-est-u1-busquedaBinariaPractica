import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import view.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole showConsole = new ShowConsole();
        PersonaController personaController = new PersonaController();

        // 1. Crear el arreglo UNA sola vez
        Persona[] personas = {
            new Persona(25, "Juan"),
            new Persona(30, "Ana"),
            new Persona(20, "Pedro"),
            new Persona(28, "Maria"),
            new Persona(22, "Luis"),
            new Persona(27, "Carmen"),
            new Persona(24, "Sofia"),
        };

        // 2. Ordenar por nombre
        //personaController.sortByName(personas);
        personaController.sortByAge(personas);
        personaController.printArreglo(personas);
        personaController.printEdad(personas, 0, (personas.length - 1)/2, personas.length - 1);

        // 3. Búsqueda binaria por nombre
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        //Persona encontrada =busquedaBinaria.binarySearchByName(personas, "Carmen");
        Persona encontrada = busquedaBinaria.binarySearchByAge(personas, 27);

        // 4. Mostrar resultado
        //showConsole.showPersonResult(encontrada, "Carmen");
        showConsole.showPersonResult(encontrada, 27);
    }
}
