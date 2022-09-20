package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo;
	private ArrayList<Animal> animales;
	
	//Constructores
	public Zona() {
	}
	
	public Zona(String nombre, ArrayList<Zoologico> zoo, ArrayList<Animal> animales) {
		this.setNombre(nombre);
		this.setZoo(zoo);
		this.setAnimales(animales);
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
