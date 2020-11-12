package Escuela;

public class Aula
{
	private String nombreAula;
	private int cantidadAlumnos;
	
	public Aula() {
		nombreAula = "";
		cantidadAlumnos = 0;
	}
	public Aula(String n, int q) {
		nombreAula = n;
		cantidadAlumnos = q;
	}
	
	public String getNombre() {
		return nombreAula;
	}
	public void setNombre(String n) {
		this.nombreAula = n;
	}
	
	public int getCA() {
		return cantidadAlumnos;
	}
	public void setCA(int q) {
		this.cantidadAlumnos = q;
	}
}
