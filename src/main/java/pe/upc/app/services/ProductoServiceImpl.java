package pe.upc.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upc.app.daos.ProductoDao;
import pe.upc.app.models.Producto;
import reactor.core.publisher.Flux;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoDao productoDao;
	

	@Override
	public Flux<Producto> findAll() {		
		
		/*List<Producto> productosDB = productoDao.findAll();
		
		return Flux.fromStream(productosDB.stream());*/
		
		return productoDao.findAll();
				
	}
	

}
