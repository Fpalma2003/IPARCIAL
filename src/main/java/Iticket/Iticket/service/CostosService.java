/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iticket.Iticket.service;
import Iticket.Iticket.entity.Costos;
import Iticket.Iticket.repository.CostosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author fabri
 */
@Service
public class CostosService implements ICostosService{

    
    @Autowired
    private CostosRepository costosRepository;

    @Override
    public List<Costos> listCosts() {
        
        return (List<Costos>) costosRepository.findAll();
    }
}
