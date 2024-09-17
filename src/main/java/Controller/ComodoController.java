package Controller;

import Service.ComodoService;

import entity.Comodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComodoController {

    @Autowired
    private ComodoService comodoService;

    @PostMapping("/comodo")
    public Comodo saveComodo(@RequestBody Comodo comodo) {
        return comodoService.saveComodo(comodo);
    }

    @GetMapping("/comodo")
    public List<Comodo> getAllComodo() {
        return comodoService.findAllComodo();
    }

    @GetMapping("/comodo/{id}")
    public Comodo getComodoById(@PathVariable("id") Long id) {
        return comodoService.getComodoById(id);
    }

    @PutMapping("/comodo/{id}")
    public Comodo updateComodo(@PathVariable("id") Long id, @RequestBody Comodo comodo) {
        return comodoService.updateComodoById(id, comodo);
    }

    @DeleteMapping("/comodo/{id}")
    public String deleteComodo(@PathVariable("id") Long id) {
        return comodoService.deleteComodoById(id);
    }

}
