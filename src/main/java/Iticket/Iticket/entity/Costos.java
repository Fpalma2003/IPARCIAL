/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iticket.Iticket.entity;

/**
 *
 * @author fabri
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
            
@Entity
@Table(name = "Costos")

public class Costos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Costos;

    public long getId() {
        return id;
    }
    public String getCostos() {
        return Costos;
    }
    public void setCostos(String pais) {
        this.Costos = pais;
    }
    public void setId(long id) {
        this.id = id;
    }
}