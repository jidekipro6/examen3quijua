package com.example.examen;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface categoriaRepository extends PagingAndSortingRepository<Categoria, Integer>,CrudRepository<Categoria, Integer> {
    
    List<Categoria> findByNombre(@Param("nombre") String nombre);

}

