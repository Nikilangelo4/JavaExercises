package ch3.variant.A.house.actions;

import ch3.variant.A.house.entity.HouseEntity;

public class HouseActions {
    public static void numberOfHousesWithParticularNumberOfRooms(HouseEntity[] houseEntities, short numberOfApartments) {
        for (HouseEntity entity : houseEntities) {
            if (entity.getApartmentNumber() == numberOfApartments)
                System.out.println(entity);
        }
    }

    public static void numberOfHousesWithParticularNumberOfRoomsAndSituatedOnTheRangeOfFloors(HouseEntity[] houseEntities, short numberOfApartments, short minFloor, short maxFloor) {
        for (HouseEntity entity : houseEntities) {
            if (entity.getApartmentNumber() == numberOfApartments && entity.getFloor() <= maxFloor && entity.getFloor() >= minFloor)
                System.out.println(entity);
        }
    }

    public static void numberOfHousesWithSquareBiggerThanParticular(HouseEntity[] houseEntities, short numberOfFloors) {
        for (HouseEntity entity : houseEntities) {
            if (entity.getFloor() >= numberOfFloors)
                System.out.println(entity);
        }

    }
}
