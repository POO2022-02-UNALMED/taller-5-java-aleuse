package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<>();
	
	//Constructores
	public Zoologico() {
		this.setNombre(null);
		this.setUbicacion(null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}
	
	//Métodos
	public void agregarZonas(Zona zonas) {
		zona.add(zonas);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (int i = 0; i < zona.size(); i++) {
			cantidadTotalAnimales = cantidadTotalAnimales + zona.get(i).getAnimales().size();
		}
		return cantidadTotalAnimales;
	}
}
