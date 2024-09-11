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
@Table (name = "categorias")
public class categorias {
    @Id 
    @GeneratedValues(strategy = GerantionType.INDENTIFY) 
    private long id;
    @Column (unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogos> jogos = new HashSet<>();

    
    public long getId() {
    return id;
    }
    public void setId(long id){
    this.id = id;
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    public Set<Jogo> getJogos(){
    return jogos;
    }
    public void setJogos(Set<Jogo> jogos){
    this.jogos = jogos;
    }
}
