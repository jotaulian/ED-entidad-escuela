package Escuela;

public class testAlumnos
{

	public static void main(String[] args)
	{
		Aula amarilla = new Aula("amarilla", 15);
		Aula bombon = new Aula("bombon", 23);
		Alumno a1 = new Alumno("pedro", "Sanchez", 44, false, amarilla);
		Alumno a2 = new Alumno("Mariana", "Olloy", 33, true, bombon);
		Alumno a3 = new Alumno("Magali", "Zabatini", 15, true, amarilla);
		
		System.out.println(a1.getApellido() + " estudia en el aula " + a1.getAula().getNombre());
		System.out.println(a2.getApellido() + " estudia en el aula " + a2.getAula().getNombre());
		System.out.println(a3.getApellido() + " estudia en el aula " + a3.getAula().getNombre());
	}

}
