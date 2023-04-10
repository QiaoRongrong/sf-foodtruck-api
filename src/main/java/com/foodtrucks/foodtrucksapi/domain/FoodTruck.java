package com.foodtrucks.foodtrucksapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "food_truck")
public class FoodTruck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @JsonProperty("locationid")
    @Column(name = "location_id")
    public String locationId;

    @JsonProperty("Applicant")
    public String applicant;

    @JsonProperty("FacilityType")
    @Column(name = "facility_type")
    public String facilityType;
    public String cnn;

    @JsonProperty("LocationDescription")
    @Column(name = "location_description")
    public String locationDescription;

    @JsonProperty("Address")
    public String address;

    @JsonProperty("blocklot")
    @Column(name = "blocklot")
    public String blockLot;
    public String block;
    public String lot;
    public String permit;

    @JsonProperty("Status")
    public String status;
    @JsonProperty("FoodItems")
    @Column(name = "food_items")
    public String foodItems;

    @JsonProperty("X")
    public String x;
    @JsonProperty("Y")
    public String y;
    @JsonProperty("Latitude")
    public String latitude;
    @JsonProperty("Longitude")
    public String longitude;
    @JsonProperty("Schedule")
    public String schedule;

    @JsonProperty("dayshours")
    @Column(name = "days_hours")
    public String daysHours;

    @JsonProperty("NOISent")
    @Column(name = "noi_sent")
    public String noiSent;

    @JsonProperty("Approved")
    public String approved;

    @JsonProperty("Received")
    public String received;

    @JsonProperty("PriorPermit")
    @Column(name = "prior_permit")
    public String priorPermit;

    @JsonProperty("ExpirationDate")
    @Column(name = "expiration_date")
    public String expirationDate;

    @JsonProperty("Location")
    public String location;

    @JsonProperty("Fire Prevention Districts")
    @Column(name = "fire_prevention_districts")
    public String firePreventionDistricts;

    @JsonProperty("Police Districts")
    @Column(name = "police_districts")
    public String policeDistricts;

    @JsonProperty("Supervisor Districts")
    @Column(name = "supervisor_districts")
    public String supervisorDistricts;

    @JsonProperty("Zip Codes")
    @Column(name = "zip_codes")
    public String zipCodes;

    @JsonProperty("Neighborhoods (old)")
    public String neighborhoods; // (old)


}
