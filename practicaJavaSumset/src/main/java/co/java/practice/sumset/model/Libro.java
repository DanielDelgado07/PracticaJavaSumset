package co.java.practice.sumset.model;
/*
 * clase que se va a encargar todo lo relacionado  a los libros y permite conectar con
 * la base de datos
 * */

public class Libro {

	private int diasPrestamo;
	private String pasword;
	private String categoriaEdad;
	private String Descripcion;

	/**
	 * @return the diasPrestamo
	 */
	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	/**
	 * @param diasPrestamo the diasPrestamo to set
	 */
	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

	/**
	 * @return the pasword
	 */
	public String getPasword() {
		return pasword;
	}

	/**
	 * @param pasword the pasword to set
	 */
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	/**
	 * @return the categoriaEdad
	 */
	public String getCategoriaEdad() {
		return categoriaEdad;
	}

	/**
	 * @param categoriaEdad the categoriaEdad to set
	 */
	public void setCategoriaEdad(String categoriaEdad) {
		this.categoriaEdad = categoriaEdad;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

}
