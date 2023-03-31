package com.demospring.demo.repositories;

import com.demospring.demo.entities.Usuario;
        import java.util.List;

        import org.springframework.data.jpa.repository.*;
        import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario>findByNombre(String name);
}

