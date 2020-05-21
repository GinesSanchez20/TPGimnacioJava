package entidades;

public class Profesor extends Persona{
	static private double sueldo;
	private String cuil;
	private int antiguedad;
	
	
	public static double getSueldo() {
		return sueldo;
	}
	public static void setSueldo(double sueldo) {
		Profesor.sueldo = sueldo;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
