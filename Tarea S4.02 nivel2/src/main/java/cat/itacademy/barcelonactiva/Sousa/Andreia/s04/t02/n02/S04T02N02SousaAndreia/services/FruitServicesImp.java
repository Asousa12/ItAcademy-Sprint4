package cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.services;

import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.exception.ResourceNotFoundException;
import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.model.Fruit;
import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.repository.RepositoryFruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServicesImp implements FruitServices {
    @Autowired
    RepositoryFruit repositoryFruit;

    @Override
    public Fruit save(Fruit fruit) {
        return repositoryFruit.save(fruit);
    }

    @Override
    public Fruit update(int id, Fruit fruit) {
        Optional<Fruit> existingFruit = repositoryFruit.findById((long) id);

        if (existingFruit.isPresent()) {
            Fruit fruitToUpdate = existingFruit.get();
            fruitToUpdate.setName(fruit.getName());
            fruitToUpdate.setPeso(fruit.getPeso());
            return repositoryFruit.save(fruitToUpdate);
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + id);
        }
    }

    @Override
    public String delete(int id) {
        repositoryFruit.deleteById((long) id);
        return "The piece of fruit was deleted correctly";
    }

    @Override
    public List<Fruit> findAll() {
        return this.repositoryFruit.findAll();
    }

    @Override
    public Optional<Fruit> findById(int id) {
        return repositoryFruit.findById((long) id);
    }
}