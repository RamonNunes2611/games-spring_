package application.model;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;

import jakarta.persitence.Column;
import jakarta.persitence.Entity;
import jakarta.persitence.GeneratedValues;
import jakarta.persitence.GerantionType;
import jakarta.persitence.Id;
import jakarta.persitence.OneToMany;
import jakarta.persitence.Table;

@Entinty
@Table (name = "plataformas")
public class plataforma{
    @Id 
    @GeneratedValues(strategy = GerantionType.INDENTIFY) 
    private long id;
    @Column (unique = true , nullable = false)
    private String nome;
    
public void setId(long id) {

}public long getId() {
    return id;
}



public void setNome(String nome) {
    this.nome = nome;

}public String getNome() {
    return nome;
}