package ui;

import java.util.List;
import java.util.Scanner;

import dol.Libro;

public class LibroForm {

	private Scanner scan;
	private Libro libro;
	private List<Libro> libros;
	
	public LibroForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public LibroForm(Libro libro) {
		super();
		this.libro = libro;
	}
	
	public LibroForm(List<Libro> libros) {
		super();
		this.libros = libros;
	}
	
	public Libro catchLibro() {
		Libro L = new Libro();
		System.out.println("Título: ");
		scan.nextLine();
		L.setTitulo(scan.nextLine());
		
		System.out.println("Editorial: ");
		scan.nextLine();
		L.setEditorial(scan.nextLine());
		
		System.out.println("Edicion: ");
		scan.nextLine();
		L.setEdicion(scan.nextLine());
		
		System.out.println("Año de publicacion: ");
		scan.nextLine();
		L.setAñoPublic(scan.nextLine());
		
		return L;
	}
	
	public void showLibro() {
		System.out.printf("Título: %s\n", libro.getTitulo());
		System.out.printf("Editorial: %s\n", libro.getEditorial());
		System.out.printf("Edicion: %s\n", libro.getEdicion());
		System.out.printf("Año de pulicacion: %s\n", libro.getAñoPublic());
		
	}
	
	public void showLibros() {
		for(int i=0; i<libros.size(); i++) {
			System.out.printf("%d | %s | %s\n", i+1, libros.get(i).getTitulo(), libros.get(i).getEditorial(), libros.get(i).getEdicion(), libros.get(i).getAñoPublic());
		}
	}
}
