package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persitence.Column;
import jakarta.persitence.Entity;
import jakarta.persitence.GeneratedValues;
import jakarta.persitence.GerantionType;
import jakarta.persitence.Id;
import jakarta.persitence.joinColumn;
import jakarta.persitence.JoinTable;
import jakarta.persitence.ManyToMany;
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

    @ManyToOne
    @joinColumn(name = "id_genero")
    private String categoria;

    @ManyToMany
    @Jointable(
        name = "jogos_possuem_plataformas",
        joinColumns = @joinColumn(name = "id_jogos"),
        inverseJoinColumnns = @joinColumn(name = "id_plataformas"))
    private Set<Plataforma>plataformas = new HashSet<>();

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    
 
