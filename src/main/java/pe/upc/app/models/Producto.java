package pe.upc.app.models;

import org.springframework.data.annotation.Id;

public class Producto {
	
	@Id
	private Long id;
	
	private String name;
	

	public Producto() {

	}

	public Producto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + "]";
	}
	
	
}
