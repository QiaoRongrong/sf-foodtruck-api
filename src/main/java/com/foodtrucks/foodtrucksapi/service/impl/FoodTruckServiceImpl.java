package com.foodtrucks.foodtrucksapi.service.impl;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import com.foodtrucks.foodtrucksapi.repo.FoodTruckRepository;
import com.foodtrucks.foodtrucksapi.service.FoodTruckService;
import com.foodtrucks.foodtrucksapi.vo.FoodTruckVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.stream.Collectors;

@Slf4j
@Service
public class FoodTruckServiceImpl implements FoodTruckService {
    private final FoodTruckRepository foodTruckRepository;
    public FoodTruckServiceImpl(FoodTruckRepository foodTruckRepository) {
        this.foodTruckRepository = foodTruckRepository;
    }

    @Override
    public Flux<FoodTruck> getFoodTruckByAddress(String address) {
        return Flux.fromIterable(foodTruckRepository.findAllByAddress(address));
    }

    @Override
    public Flux<FoodTruckVo> getByAddress(String address) {
        return Flux.fromIterable(
                foodTruckRepository.findAllByAddress(address)
                .stream()
                        .map(it -> FoodTruckVo.from(it))
                        .collect(Collectors.toList())
        );
    }

    @Override
    public Flux<FoodTruckVo> searchBy(String address, String foodItem, Pageable pageable) {
        return Flux.fromIterable(
                foodTruckRepository.findAllByAddressAndFoodItemsLike(address, foodItem, pageable)
                        .stream()
                        .map(it -> FoodTruckVo.from(it))
                        .collect(Collectors.toList())
        );
    }

    @Override
    public Flux<FoodTruckVo> searchByAddressContainsOrFoodItemContains(String address, String foodItem, Pageable pageable) {
        return Flux.fromIterable(
                foodTruckRepository.findAllByAddressContainsOrFoodItemsContains(address, foodItem, pageable)
                        .stream()
                        .map(it -> FoodTruckVo.from(it))
                        .collect(Collectors.toList())
        );
    }


    /*@PostConstruct
    public void loadDataToDb() {
        log.info("load data start...");
        // parse csv
        final String fileName = "Mobile_Food_Facility_Permit.csv";
        List<FoodTruck> foodTrucks = CsvParserUtil.loadObjectList(FoodTruck.class, fileName);
        log.debug("foodTrucks.size: {}, first one: {}",
                foodTrucks.size(), foodTrucks.get(0));

        foodTruckRepository.saveAll(foodTrucks);
        log.info("load data to DB done.");
    }*/


}
