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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Definimos de que tipo es nuestra clase, en este caso una entidad.
@Entity
//Definir la tabla que hay en la bd en este caso se llama personas.
@Table(name = "personas")

//implementamos una interfaz "Serializable"
public class Conciertos implements Serializable{
    
    //Creamos los atributos que asemejen la tabla (persona).
    
    //Definimos la llame primaria con @id
    @Id
    
    //Con esta valor decimos que nuestra id va a obtener un valor autoincremental.
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    
    private String Artista;
    private String Costos;
    private String Fecha;
    private String Capacidad;
    private String Lugar;
    
    //Definomos la relacion  de una a muchas
    @ManyToOne
    
    //Foreign key
    @JoinColumn (name="Costos_id")
    
    /*Aqui guardamos un objeto de tipo pais porque estamos haciendo una referancia
    Con un foreign key, el foreign key apunta a otra tabla entonces para obtener el
    Valor de esa columna esa tabla, ocupamos la referencia*/
    
    //Entonces apuntamos a otra entidad en esta caso "Pais"
    private Costos costos;

    
    //Creamos getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        this.Artista = artista;
    }

    public String getCostos() {
        return Costos;
    }

    public void setCostos(String costos) {
        this.Costos = costos;
    }

    public String Fecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.Capacidad = capacidad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        this.Lugar = lugar;
    }

   
    
}
