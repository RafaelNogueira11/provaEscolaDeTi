package Controller;

import Service.ComodoService;

import Service.ComodoServiceImplementacao;
import entity.Comodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComodoController {

    @Autowired
    private ComodoServiceImplementacao comodoServiceImplementacao;

    @PostMapping("/comodo")
    public Comodo saveComodo(@RequestBody Comodo comodo) {
        return comodoServiceImplementacao.saveComodo(comodo);
    }

    @GetMapping("/comodo")
    public List<Comodo> getAllComodo() {
        return comodoServiceImplementacao.findAllComodo();
    }

    @GetMapping("/comodo/{id}")
    public Comodo getComodoById(@PathVariable("id") Long id) {
        return comodoServiceImplementacao.getComodoById(id);
    }

    @PutMapping("/comodo/{id}")
    public Comodo updateComodo(@PathVariable("id") Long id, @RequestBody Comodo comodo) {
        return comodoServiceImplementacao.updateComodoById(id, comodo);
    }

    @DeleteMapping("/comodo/{id}")
    public String deleteComodo(@PathVariable("id") Long id) {
        return comodoServiceImplementacao.deleteComodoById(id);
    }

}
