package Songs;

import java.util.ArrayList;
import java.util.Scanner;

// Clase Cancion es una canción con un título y su artista

class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return titulo.equals(cancion.titulo) && artista.equals(cancion.artista);
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}