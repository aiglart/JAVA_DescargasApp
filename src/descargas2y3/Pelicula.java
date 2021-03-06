package descargas2y3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class Pelicula extends ContenidoDigital{

	Collection<Director> directores;
	String titulo;
	Collection<Saga> saga;			//Puede pertenecer a varias sagas
	Collection<Actor> actores; 
	
	public Pelicula(Collection<Director> director, String titulo, Collection<Saga> saga, LocalDate fecha, Actor...actores) {
		super();
		this.directores = director;
		this.titulo = titulo;
		this.saga = saga;
		this.actores = Arrays.asList(actores);
		id = titulo;
		fechaPublicacion = fecha;
		

	}
	
	public Pelicula(Collection<Director> directores, String titulo) {
		super();
		this.directores = directores;
		this.titulo = titulo;
	}

	public Collection<Director> getDirectores() {
		return directores;
	}

	public void setDirectores(Collection<Director> directores) {
		this.directores = directores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Collection<Saga> getSaga() {
		return saga;
	}

	public void setSaga(Collection<Saga> saga) {
		this.saga = saga;
	}
	
	
}
