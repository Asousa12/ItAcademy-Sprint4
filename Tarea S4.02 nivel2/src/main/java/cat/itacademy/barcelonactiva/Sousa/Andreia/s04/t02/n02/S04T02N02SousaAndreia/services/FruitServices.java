package cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.services;

import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitServices {

    Fruit save(Fruit fruit);

    Fruit update(int id, Fruit fruit);

    String delete(int id);

    List<Fruit> findAll();

    Optional<Fruit> findById(int id);
}
