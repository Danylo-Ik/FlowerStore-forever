package ua.edu.ucu.apps.lab_8.controller;
import java.util.List;
import ua.edu.ucu.apps.lab_8.model.*;
import ua.edu.ucu.apps.lab_8.service.FlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flowers")
    public Flower createFlower(@RequestBody Flower flower) {
        return new Flower();
    }

}
