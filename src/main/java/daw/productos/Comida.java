/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.productos;
import daw.Iva;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class Comida {
    //Creamos atributos encapsulados
    private int id;
    private String descripcion;
    private SubCategoriaComida subComida;
    private double precio;
    private Iva iva;
    private int stock = 0;
    private int cantidadPedida=0;
    
    //Creamos constructor parametrizado
    public Comida(int id, String descripcion, SubCategoriaComida subComida, double precio, Iva iva, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.subComida = subComida;
        this.precio = precio;
        this.iva = iva;
        this.stock = stock;
    }
    
    //Constructor vacío

    public Comida() {
    }
        
    //Añadimos getter y setters
     public int getCantidaPpedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadpedida) {
        this.cantidadPedida = cantidadpedida;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SubCategoriaComida getSubComida() {
        return subComida;
    }

    public void setSubComida(SubCategoriaComida subComida) {
        this.subComida = subComida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Insertamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(descripcion);
        sb.append("  ").append(precio + " €");
        return sb.toString();
    }
    
    //Insertamos el hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.descripcion);
        hash = 73 * hash + Objects.hashCode(this.subComida);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.iva);
        hash = 73 * hash + this.stock;
        return hash;
    }

    //Insertamos el equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comida other = (Comida) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (this.subComida != other.subComida) {
            return false;
        }
        return this.iva == other.iva;
    }

  
      
}
