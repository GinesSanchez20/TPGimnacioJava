package entidades;

import java.util.ArrayList;

public class Plan {
	private int idPlan;
	private String nombrePaln;
	private String descripcion;
	private double costoPlan;
	private ArrayList<Actividad>actsPlan=new ArrayList<Actividad>();
	
	
	public int getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}
	public String getNombrePaln() {
		return nombrePaln;
	}
	public void setNombrePaln(String nombrePaln) {
		this.nombrePaln = nombrePaln;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCostoPlan() {
		return costoPlan;
	}
	public void setCostoPlan(double costoPlan) {
		this.costoPlan = costoPlan;
	}
	public ArrayList<Actividad> getActsPlan() {
		return actsPlan;
	}
	public void setActsPlan(ArrayList<Actividad> actsPlan) {
		this.actsPlan = actsPlan;
	}
}
