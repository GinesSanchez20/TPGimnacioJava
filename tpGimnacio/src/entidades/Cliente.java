package entidades;

import java.util.ArrayList;

public class Cliente extends Persona {
	private Plan plan;
	private ArrayList<Actividad> actsCliente= new ArrayList<Actividad>();
	private ArrayList<Certificado> certsCliente =new ArrayList<Certificado>();
	
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public ArrayList<Actividad> getActsCliente() {
		return actsCliente;
	}
	public void setActsCliente(ArrayList<Actividad> actsCliente) {
		this.actsCliente = actsCliente;
	}
	public ArrayList<Certificado> getCertsCliente() {
		return certsCliente;
	}
	public void setCertsCliente(ArrayList<Certificado> certsCliente) {
		this.certsCliente = certsCliente;
	}
}
