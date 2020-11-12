package Escuela;

public class Alumno
{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean pagado;
	private Aula aula;
	
	public Alumno() {
		nombre = "";
		apellido = "";
		edad = 0;
		pagado = false;
		aula = new Aula();
	}
	public Alumno(String al, String ap, int e, boolean p, Aula au) {
		nombre = al;
		apellido = ap;
		edad = e;
		pagado = p;
		aula = au;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public boolean getPagado()
	{
		return pagado;
	}
	public void setPagado(boolean pagado)
	{
		this.pagado = pagado;
	}
	public Aula getAula()
	{
		return aula;
	}
	public void setAula(Aula aula)
	{
		this.aula = aula;
	}
	
}


