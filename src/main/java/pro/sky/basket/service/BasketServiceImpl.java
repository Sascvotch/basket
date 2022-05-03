package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final List<Integer> basket = new ArrayList<>();

    public List<Integer> basketAdd(List<Integer> idProduct) {
        List<Integer> idProductInBasket = new ArrayList<>(idProduct);
        basket.addAll(idProductInBasket);
        System.out.println("Товар " + idProductInBasket + " добавлен в корзину.");
        return idProductInBasket;
    }

    public List<Integer> basketGet() {
        return basket;
    }

}
