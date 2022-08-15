package ch3.variant.A.house.main;

import ch3.variant.A.house.actions.HouseActions;
import ch3.variant.A.house.creator.HouseCreator;
import ch3.variant.A.house.entity.BuildingType;
import ch3.variant.A.house.entity.HouseEntity;


public class HouseMain {
    public static void main(String[] args) {
        HouseEntity[] houseEntities = new HouseEntity[3];
        houseEntities[0] = HouseCreator.createFromCode((short)3,"asds", BuildingType.BUSINESS, (short)23);
        houseEntities[1] = HouseCreator.createFromCode((short)5,"asdsad", BuildingType.EDUCATIONAL, (short)25);
        houseEntities[2] = HouseCreator.createFromCode((short)6,"asd213", BuildingType.RESIDENTIAL, (short)25);
        HouseActions.numberOfHousesWithParticularNumberOfRooms(houseEntities, (short)3);
        HouseActions.numberOfHousesWithParticularNumberOfRoomsAndSituatedOnTheRangeOfFloors(houseEntities,(short)5, (short)10, (short)25);
        HouseActions.numberOfHousesWithParticularNumberOfRooms(houseEntities, (short)6);

    }
}
