-- create database sf_food_trucks_db;
use sf_food_trucks_db;

DROP TABLE IF EXISTS `food_truck` ;
CREATE TABLE IF NOT EXISTS `food_truck` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `location_id` VARCHAR(128) NULL COMMENT 'locationId',
  `applicant` VARCHAR(512) NOT NULL COMMENT '',
  `facility_type` VARCHAR(45) NOT NULL COMMENT 'FacilityType',

  `cnn` VARCHAR(32) NOT NULL COMMENT '',
  `location_description` VARCHAR(512) NOT NULL COMMENT 'LocationDescription',
  `address` VARCHAR(128) NULL COMMENT 'Address',

  `blocklot` VARCHAR(45) NOT NULL COMMENT 'blocklot',
  `block` VARCHAR(32) NOT NULL COMMENT 'block',
  `lot` VARCHAR(16) NULL COMMENT 'lot',
  `permit` VARCHAR(16) NULL COMMENT 'permit',

  `status` VARCHAR(16) NULL COMMENT 'status',
  `food_items` VARCHAR(512) NULL COMMENT 'FoodItems',
  `x` VARCHAR(16) NULL COMMENT 'X',
  `y` VARCHAR(16) NULL COMMENT 'Y',
  `latitude` VARCHAR(64) NULL COMMENT 'Latitude',
  `longitude` VARCHAR(64) NULL COMMENT 'Longitude',

  `schedule` VARCHAR(1024) NULL COMMENT 'Schedule',
  `days_hours` VARCHAR(128) NULL COMMENT 'dayshours',
  `noi_sent` VARCHAR(128) NULL COMMENT 'NOISent',

  `approved` VARCHAR(32) NULL COMMENT 'eg: 01/28/2022 12:00:00 AM',
  `received` VARCHAR(16) NULL COMMENT 'eg: 20210315',
  `prior_permit` VARCHAR(16) NULL COMMENT 'PriorPermit, eg: 0 or 1',
  `expiration_date` VARCHAR(32) NULL COMMENT 'ExpirationDate, eg: 11/15/2022 12:00:00 AM',
  `location` VARCHAR(128) NULL COMMENT 'Location, eg: (37.76201920035647, -122.42730642251331)',
  `fire_prevention_districts` VARCHAR(16) NULL COMMENT 'Fire Prevention Districts',
  `police_districts` VARCHAR(16) NULL COMMENT 'Police Districts',
  `supervisor_districts` VARCHAR(16) NULL COMMENT 'Supervisor Districts',
  `zip_codes` VARCHAR(16) NULL COMMENT 'Zip Codes',
  `neighborhoods` VARCHAR(16) NULL COMMENT 'Neighborhoods (old)',
  -- `create_time` DATETIME DEFAULT NOW() NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
ENGINE = InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='SF food trucks';

