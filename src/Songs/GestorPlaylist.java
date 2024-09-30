package Songs;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
                try {
                        // Ejemplo de agregar canciones a la playlist
                        playlist.agregarCancion(new Cancion("Staring At The Sun (Official Audio) ft. SZA", "PostMalone"));
                        playlist.agregarCancion(new Cancion("Die For Me (Audio) ft. Future, Halsey", "PostMalone"));
                        playlist.agregarCancion(new Cancion("A Thousand Bad Times (Official Audio)", "PostMalone"));
                        playlist.agregarCancion(new Cancion("Staring At The Sun (Official Audio) ft. SZA", "PostMalone")); // Canción duplicada
                } catch (Exception e) {
                     System.out.println("Ocurrió un error inesperado en el sistema: " + e.getMessage());
        }
        // Mostrar la playlist
        playlist.mostrarPlaylist();
    }
}