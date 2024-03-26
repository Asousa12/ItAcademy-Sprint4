package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01SousaAndreia.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01SousaAndreia.model.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitServices {

    Fruit save(Fruit fruit);

    Fruit update(int id, Fruit fruit);

    String delete(int id);

    List<Fruit> findAll();

    Optional<Fruit> findById(int id);
}
