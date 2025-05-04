package pe.upc.app.services;

import pe.upc.app.models.Producto;
import reactor.core.publisher.Flux;


public interface ProductoService {
	
	public Flux<Producto> findAll();

}
