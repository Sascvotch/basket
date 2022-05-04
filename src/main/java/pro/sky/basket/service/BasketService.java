package pro.sky.basket.service;

import pro.sky.basket.data.Basket;

import java.util.List;

public interface BasketService {
    List<Integer> basketAdd(List<Integer> idProduct) ;
    List<Integer> basketGet();
}