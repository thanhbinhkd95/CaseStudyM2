package model;

public class House extends Service {
    private String roomStandard;
    private String amenitie;
    private int numberOfFloors;


    public House(String id, String serviceName, double usableArea, double rentalCost,
                 int maxNumberOfPeople, String rentalType, String roomStandard ,
                 String amenitie , int numberOfFloors) {
        super(id , serviceName , usableArea , rentalCost , maxNumberOfPeople , rentalType);
        this.roomStandard = roomStandard;
        this.amenitie = amenitie;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAmenitie() {
        return amenitie;
    }

    public void setAmenitie(String amenitie) {
        this.amenitie = amenitie;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", amenitie='" + amenitie + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public void showInfo() {

    }
}
