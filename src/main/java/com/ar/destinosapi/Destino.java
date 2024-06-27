package com.ar.destinosapi;

public class Destino {
    // primero definimos los atributos(variables) que van a formar parte de la plantilla pelicula
    private int id;
    private String nombre;
    private String provincia;
    private String descripcion;
    private String imagen;

    // Constructor// instanciar un objeto en memoria, o referenciar un objeto en memoria
    public Destino() {
        // no recibe ningun parametro y no hace nada
    }
    public Destino(int id, String nombre, String provincia, String descripcion, String imagen) {
        // la palabra reservada this hace referencia a los atributos de la clase, del objeto que se esta creando en ese momento 
        this.id = id;
        this.nombre = nombre;
        this.provincia = provincia;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    // Getters // siempre retornan el tipo de dato del atributo y no reciben ningun valor,
    // y desde donde se los llama se puede guardar ese valor en una variable
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    // Setters // no devuelven nada, porque lo que hacen es modificar el dato del atributo en memoria del objeto

    public void setTitulo(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    // toString method
    @Override
    public String toString() {
        return "Destino{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", provincia='" + provincia + '\'' +
                ", descripción='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
