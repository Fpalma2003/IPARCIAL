/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iticket.Iticket.controller;

import Iticket.Iticket.entity.Conciertos;
import Iticket.Iticket.entity.Costos;
import Iticket.Iticket.service.ConciertosService;
import Iticket.Iticket.service.CostosService;
import Iticket.Iticket.service.IConciertosService;
import Iticket.Iticket.service.ICostosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author fabri
 */
@Controller        
public class ConciertosController {
    

    
    
   
    @Autowired
    
    private IConciertosService conciertosService;
    
    @Autowired
    private ICostosService costosService;
    
    
    
    @GetMapping("/conciertos")
    
   
    public String index(Model model){
        
        
        List<Conciertos> listaConciertos = conciertosService.getAllConciertos();
        
       
        model.addAttribute("titulo", "Tabla de Conciertos");
        
        
        model.addAttribute("Conciertos", listaConciertos);
        
        
        return "Conciertos";
    }
    
    @GetMapping("/ConciertosN")
    
    public String crearConciertos(Model model){
        
        List<Costos> listaCostos = costosService.listCosts();        
        
        model.addAttribute("Conciertos", new Conciertos());       
        
        model.addAttribute("Costos", listaCostos);
        return "crear";
    }
    
    @GetMapping("/save")
    public String guardarConciertos(@ModelAttribute Conciertos conciertos){
        
        conciertosService.save(conciertos);
        
        
        return "redirect:/Conciertos";
    }
    
    @GetMapping("/editConciertos/{id}")
    public String editarConciertos(@PathVariable("id") Long idConciertos, Model model){
        Conciertos conciertos = conciertosService.getConciertosById(idConciertos);
        List<Costos> listacostos = CostosService.listCosts();
        model.addAttribute("Conciertos", conciertos);
        model.addAttribute("Costos", listaCostos);
        return "crear";
    }
}


    

