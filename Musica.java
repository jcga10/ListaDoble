package doble;


public class Musica{

	private String id;
	private String album;
	private String artista;
	private String genero;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Música: "+" id: "+id+" album: "+album+ " artista: "+artista+" genero: "+genero;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Musica temporal=(Musica) o;
		return this.id.compareTo(temporal.getId());
	}
}
