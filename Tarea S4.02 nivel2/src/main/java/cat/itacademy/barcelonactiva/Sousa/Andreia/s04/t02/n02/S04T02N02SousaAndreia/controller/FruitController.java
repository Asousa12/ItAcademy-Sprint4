package cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.controller;

import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.model.Fruit;
import cat.itacademy.barcelonactiva.Sousa.Andreia.s04.t02.n02.S04T02N02SousaAndreia.services.FruitServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/fruit")
    public class FruitController {
        @Autowired
        FruitServicesImp fruitServicesImp;

        @PostMapping("/add")
        public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
            Fruit createdFruit = fruitServicesImp.save(fruit);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdFruit);
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<Fruit> updateFruit(@PathVariable int id, @RequestBody Fruit fruit) {
            Fruit updatedFruit = fruitServicesImp.update(id, fruit);

            if (updatedFruit != null) {
                return ResponseEntity.ok(updatedFruit);
            } else {
                return ResponseEntity.badRequest().build();
            }
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteFruit(@PathVariable int id) {
            String message = fruitServicesImp.delete(id);
            return ResponseEntity.ok(message);
        }

        @GetMapping("/getAll")
        public ResponseEntity<List<Fruit>> getAllFruit() {
            List<Fruit> fruits = fruitServicesImp.findAll();

            if (fruits.isEmpty()) {
                return ResponseEntity.notFound().build();
            } else {
                return ResponseEntity.ok(fruits);
            }
        }

        @GetMapping("/getOne/{id}")
        public ResponseEntity<Fruit> getFruit(@PathVariable int id) {
            Optional<Fruit> fruitOptional = fruitServicesImp.findById(id);

            if (fruitOptional.isPresent()) {
                return ResponseEntity.ok(fruitOptional.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }
