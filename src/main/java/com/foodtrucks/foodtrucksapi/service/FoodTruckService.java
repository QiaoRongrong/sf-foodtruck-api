package com.foodtrucks.foodtrucksapi.service;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import com.foodtrucks.foodtrucksapi.vo.FoodTruckVo;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;


public interface FoodTruckService {

    Flux<FoodTruck> getFoodTruckByAddress(String address);
    Flux<FoodTruckVo> getByAddress(String address);
    Flux<FoodTruckVo> searchBy(String address, String foodItem, Pageable pageable);
    Flux<FoodTruckVo> searchByAddressContainsOrFoodItemContains(String address, String foodItem, Pageable pageable);

}
