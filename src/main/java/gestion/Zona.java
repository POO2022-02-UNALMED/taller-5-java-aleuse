package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<>();;
	private ArrayList<Animal> animales = new ArrayList<>();;
	
	//Constructores
	public Zona() {
		this.setNombre(null);
	}
	
	public Zona(String nombre, ArrayList<Zoologico> zoo) {
		this.setNombre(nombre);
		this.setZoo(zoo);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Zoologico> getZoo() {
		return zoo;
	}

	public void setZoo(ArrayList<Zoologico> zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	//Métodos
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		int cantidadAnimales = animales.size();
		return cantidadAnimales;
	}
}
