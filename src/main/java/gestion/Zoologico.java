package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona;
	
	//Constructores
	public Zoologico() {
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
		this.setZonas(zonas);
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
	public void agregarZonas(Zona zona) {
		this.zona.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (int i = 0; i < zona.size(); i++) {
			cantidadTotalAnimales = cantidadTotalAnimales + zona.get(i).getAnimales().size();
		}
		return cantidadTotalAnimales;
	}
}
