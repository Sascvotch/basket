package pro.sky.basket.service;

import java.util.List;

public interface BasketService {
    List<Integer>  basketAdd(List<Integer> idProduct) ;
    List <Integer> basketGet();
}
