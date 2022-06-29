/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iticket.Iticket.service;

import Iticket.Iticket.entity.Conciertos;
import Iticket.Iticket.repository.ConciertosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

/**
 *
 * @author fabri
 */
public class ConciertosService implements IConciertosService {
    
    
    @Autowired
   
    private ConciertosRepository conciertosRepository;
    
   
    @Override
    public List<Conciertos> getAllConciertos() {
       
        return (List<Conciertos>) conciertosRepository.findAll();
    }
    @Override
    public Conciertos getConciertosById(long id) {
       
        return conciertosRepository.findById(id).orElse(null);
    }
    
    
    @Override
    public void saveConciertos(Conciertos conciertos) {
        
        conciertosRepository.save(conciertos);
    }
    @Override
    public void delete(long id) {
        
        conciertosRepository.deleteById(id);
    }

}

