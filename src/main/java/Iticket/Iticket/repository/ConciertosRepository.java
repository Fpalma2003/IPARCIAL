/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Iticket.Iticket.repository;

import Iticket.Iticket.entity.Conciertos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

/**
 *
 * @author fabri
 */
public interface ConciertosRepository extends CrudRepository<Conciertos,Long>{
    
    
}
