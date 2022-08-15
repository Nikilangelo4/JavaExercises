package ch3.variant.A.house.creator;

import ch3.variant.A.house.entity.BuildingType;
import ch3.variant.A.house.entity.HouseEntity;

import java.util.Scanner;

public class HouseCreator {

    public static HouseEntity createFromCode(short apartmentNumber, String street, BuildingType buildingType, short floor) {
        return new HouseEntity(apartmentNumber, street, buildingType,floor);
    }

    public static HouseEntity createFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill HouseEntity from console");
        System.out.println("Enter type:" +
                "1 - RESIDENTIAL,\n" +
                "2 - EDUCATIONAL,\n" +
                "3 - INSTITUTIONAL,\n" +
                "4 - BUSINESS; ");
        int type = scanner.nextInt();
        BuildingType buildingType = BuildingType.UNDEFINED;
        switch(type) {
            case 1:
                buildingType = BuildingType.RESIDENTIAL;
            case 2:
                buildingType = BuildingType.EDUCATIONAL;
            case 3:
                buildingType = BuildingType.INSTITUTIONAL;
            case 4:
                buildingType = BuildingType.BUSINESS;
            default:
        }
        System.out.println("Enter apartment number: ");
        short apartmentNumber = scanner.nextShort();
        System.out.println("Enter number of floors: ");
        short floor = scanner.nextShort();
        System.out.println("Enter street: ");
        scanner.nextLine();
        String street = scanner.nextLine();
        scanner.close();
        return new HouseEntity(apartmentNumber, street, buildingType, floor);
    }
}
