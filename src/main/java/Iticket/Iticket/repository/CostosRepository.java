/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Iticket.Iticket.repository;

import Iticket.Iticket.entity.Costos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fabri
 */
@Repository
public interface CostosRepository extends CrudRepository<Costos,Long>{
    
}
