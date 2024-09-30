package Songs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

// Clase Playlist que gestiona una lista de canciones
class Playlist {
    private ArrayList<Cancion> canciones;

    public Playlist() {
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion nuevaCancion) {
        try {
            if (canciones.contains(nuevaCancion)) {
                System.out.println("La cancion ya existe en la playlist.");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Desea mover la cancion al final de la lista? (Si/No): ");
                        
                String respuesta = scanner.nextLine();

                // Manejo de respuesta con try-catch
                if (respuesta.equalsIgnoreCase("Si")) {
                    canciones.remove(nuevaCancion);
                    canciones.add(nuevaCancion);
                    System.out.println("La cancion ha sido movida al final de la playlist.");
                } else if (respuesta.equalsIgnoreCase("No")) {
                    System.out.println("No se realizaron cambios en la playlist.");
                } else {
                    throw new InputMismatchException("Respuesta invalida. Debes escribir 'Si' o 'No'.");
                }
            } else {
                canciones.add(nuevaCancion);
                System.out.println("Cancion agregada: " + nuevaCancion);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " + e.getMessage());
        }
    }

    public void mostrarPlaylist() {
        System.out.println("Playlist actual:");
        for (int i = 0; i < canciones.size(); i++) {
            System.out.println((i + 1) + ". " + canciones.get(i));
        }
    }
}