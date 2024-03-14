package evf.javadoc.original;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Comentario del apartado B
	//Esto es un comentario
	//He cambiado este comentario, estoy en la rama master del otro
    }
    
}


