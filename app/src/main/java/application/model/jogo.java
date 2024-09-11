package application.model;

import java.util.HashSet;
import java.util.Set;


import jakarta.persitence.Column;
import jakarta.persitence.Entity;
import jakarta.persitence.GeneratedValues;
import jakarta.persitence.GerantionType;
import jakarta.persitence.Id;
import jakarta.persitence.OneToMany;
import jakarta.persitence.Table;

@Entinty
@Table (name = "jogos")
public class Jogo{
    @Id 
    @GeneratedValues(strategy = GerantionType.INDENTIFY) 
    private long id;
    @Column (unique = true , nullable = false)
    private String titulo;
    
public void setId(long id) {

}public long getId() {
    return id;
}


public String getTitulo() {
    return titulo;
}