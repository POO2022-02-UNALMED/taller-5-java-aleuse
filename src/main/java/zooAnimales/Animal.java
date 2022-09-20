package zooAnimales;
import java.util.ArrayList; 
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
	}
	
	//Getters y Setters
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}

	//Métodos
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.getListado().size() + "\n" + 
				"Aves: " + Ave.getListado().size() + "\n" + 
				"Reptiles: "+ Reptil.getListado().size() + "\n" + 
				"Peces: " + Pez.getListado().size() + "\n" + 
				"Anfibios: " + Anfibio.getListado().size();
	}
	
	@Override
	public String toString() {
		if (zona.size() != 0) {
			return "Mi nombre es " +  this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es " + zona.get(0).getNombre() + ", en el " + zona.get(0).getZoo().get(0).getNombre();
		}else {
			return "Mi nombre es " +  this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero();
		}
		
		
		
	}
}
