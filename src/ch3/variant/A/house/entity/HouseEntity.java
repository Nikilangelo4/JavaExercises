package ch3.variant.A.house.entity;

import java.util.Objects;

public class HouseEntity {
    private short apartmentNumber;
    private short floor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseEntity that = (HouseEntity) o;
        return apartmentNumber == that.apartmentNumber && floor == that.floor && Objects.equals(street, that.street) && buildingType == that.buildingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apartmentNumber, floor, street, buildingType);
    }

    @Override
    public String toString() {
        return "HouseEntity{" +
        "apartmentNumber=" + apartmentNumber +
        ", floor=" + floor +
        ", street='" + street + '\'' +
        ", buildingType=" + buildingType +
        '}';
    }

    public short getFloor() {
        return floor;
    }

    public void setFloor(short floor) {
        this.floor = floor;
    }

    private String street;
    private BuildingType buildingType;
    public HouseEntity (short apartmentNumber, String street, BuildingType buildingType, short floors) {
        this.apartmentNumber = apartmentNumber;
        this.buildingType = buildingType;
        this.street = street;
        this.floor = floors;
    }

    public String getStreet() {
        return street;
    }

    public short getApartmentNumber() {
        return apartmentNumber;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setApartmentNumber(short apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

}
