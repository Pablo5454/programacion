package POO;

public class Avion {
	private String nombre;
	private int tamanyo;
	private int distanciaMax;
	public int combustible;
	public Avion(String nombre, int tamanyo, int distanciaMax, int combustible) {
		this.nombre = nombre;
		this.tamanyo = tamanyo;
		this.distanciaMax = distanciaMax;
		this.combustible = combustible;
	}
	public Avion() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTamanyo() {
		return tamanyo;
	}
	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}
	public int getDistanciaMax() {
		return distanciaMax;
	}
	public void setDistanciaMax(int distanciaMax) {
		this.distanciaMax = distanciaMax;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	@Override
	public String toString() {
		return "Avion [nombre=" + nombre + ", tamanyo=" + tamanyo + ", distanciaMax=" + distanciaMax + ", combustible="
				+ combustible + "]";
	}
	public static void main(String[] args) {
		Avion avion= new Avion("Avion1", 1000,200,50);
		System.out.println(avion.getTamanyo());
		avion.setTamanyo(0);
		avion.combustible=0;
		System.out.println(avion.getTamanyo());
	}
	
	

}