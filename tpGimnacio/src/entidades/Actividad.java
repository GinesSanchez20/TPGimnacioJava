package entidades;

import java.util.ArrayList;

public class Actividad {
	private int codActividad;
	private String descripcion;
	private double costoMensual;
	private ArrayList<Ejercicio> ejercicios= new ArrayList<Ejercicio>();
	
	
	public int getCodActividad() {
		return codActividad;
	}
	public void setCodActividad(int codActividad) {
		this.codActividad = codActividad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCostoMensual() {
		return costoMensual;
	}
	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}
	public ArrayList<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

}
