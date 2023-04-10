package com.foodtrucks.foodtrucksapi.controller;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import com.foodtrucks.foodtrucksapi.service.FoodTruckService;
import com.foodtrucks.foodtrucksapi.vo.FoodTruckVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("v1/food-trucks")
public class FoodTrucksController {
    private final FoodTruckService foodTruckService;

    public FoodTrucksController(FoodTruckService foodTruckService) {
        this.foodTruckService = foodTruckService;
    }

    @GetMapping("raw")
    public Flux<FoodTruck> getFoodTrucks(@RequestParam(required = false, name = "address") String address) {
        log.info("search food for our dear team - address: {}", address);
        return foodTruckService.getFoodTruckByAddress(address);
    }

    @GetMapping
    public Flux<FoodTruckVo> getFoodTrucksVo(@RequestParam(required = false, name = "address", defaultValue = "CALIFORNIA") String address,
                                             @RequestParam(required = false, name = "foodItem", defaultValue = "HOT") String foodItem,
                                             @RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "5") int size) {
        log.info("Search food - address: {}, foodItem: {}, pageNumber: {}, pageSize: {}.", address, foodItem, page, size);
        Pageable paging = PageRequest.of(page, size);
        return foodTruckService.searchByAddressContainsOrFoodItemContains(address, foodItem, paging);
    }



}
