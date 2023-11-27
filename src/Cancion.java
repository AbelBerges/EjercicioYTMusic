public class Cancion {
    private String titulo;
    private String album;
    private String artista;
    private int meGusta;

    public Cancion(String titulo, String album, String artista, int meGusta) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.meGusta = meGusta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }
}
