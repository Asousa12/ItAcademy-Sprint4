package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01AndreiaSousa.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String Saluda2(@PathVariable(value="name", required = false) Optional<String> name) {
        if (name.isEmpty()) {
            return "Hola, desconocido. Estás ejecutando un projecto Maven";
        } else {
            return "Hola, " +name+ ". Estás ejecutando un projecto Maven";
        }
    }

}

