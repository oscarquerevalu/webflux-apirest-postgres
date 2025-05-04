package pe.upc.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upc.app.models.Producto;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer>{

}
