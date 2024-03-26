package cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n03.S04T02N03SousaAndreia.services;

import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n03.S04T02N03SousaAndreia.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitServices {

    Fruit save(Fruit fruit);

    Fruit update(int id, Fruit fruit);

    String delete(int id);

    List<Fruit> findAll();

    Optional<Fruit> findById(int id);
}