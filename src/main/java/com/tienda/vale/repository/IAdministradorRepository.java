
package com.tienda.vale.repository;

import com.tienda.vale.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorRepository extends JpaRepository <Administrador, Long> {
    
}
