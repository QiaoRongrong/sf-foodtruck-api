package com.foodtrucks.foodtrucksapi.vo;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodTruckVo {

    public String applicant;
    public String locationDescription;
    public String address;
    public String foodItems;

    public String latitude;
    public String longitude;
    public String schedule;

    public String daysHours;

    public static FoodTruckVo from(FoodTruck foodTruck){
        FoodTruckVo vo = new FoodTruckVo();
        BeanUtils.copyProperties(foodTruck, vo);

        return vo;
    }
}
