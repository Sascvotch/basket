package pro.sky.basket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private final List<Integer> basketList;

    public BasketServiceImpl(List<Integer> basketList) {
        this.basketList = basketList;
    }


    public List<Integer> basketAdd(List<Integer> idProduct) {
        List<Integer> idProductInBasket = new ArrayList<>(idProduct);
        basketList.addAll(idProductInBasket);
        System.out.println("Товар " + idProductInBasket + " добавлен в корзину.");
        return idProductInBasket;
    }

    public List<Integer> basketGet() {
        return basketList;
    }

}