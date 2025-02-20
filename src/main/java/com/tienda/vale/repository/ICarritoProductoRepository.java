/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.vale.repository;

import com.tienda.vale.model.Carrito;
import com.tienda.vale.model.CarritoProducto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarritoProductoRepository extends JpaRepository <CarritoProducto, Long>{
    List<CarritoProducto> findByCarrito(Carrito carrito);
    
    void deleteByCarrito (Carrito carrito);
    
}
