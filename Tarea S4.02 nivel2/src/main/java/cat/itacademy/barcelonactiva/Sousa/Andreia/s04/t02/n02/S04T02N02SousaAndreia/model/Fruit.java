package cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "peso")
    private double peso;

    public Fruit(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

}
