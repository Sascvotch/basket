package pro.sky.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.basket.service.BasketService;


import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;
    public BasketController (BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public List<Integer>  basketAdd(@RequestParam("id") List<Integer> idProduct) {
        return basketService.basketAdd(idProduct);
    }
    @GetMapping(path = "/get")
    public List<Integer> basketGet() {
        return basketService.basketGet();
    }
}