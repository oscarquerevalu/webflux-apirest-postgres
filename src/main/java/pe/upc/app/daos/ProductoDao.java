package pe.upc.app.daos;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import pe.upc.app.models.Producto;

@Repository
public interface ProductoDao extends R2dbcRepository<Producto, Integer>{

}
