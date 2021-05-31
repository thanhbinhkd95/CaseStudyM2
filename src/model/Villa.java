package model;

public class Villa extends Service {
    private String roomStandard;
    private String amenities;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String id , String serviceName , double usableArea ,
                 double rentalCost , int maxNumberOfPeople ,
                 String rentalType , String roomStandard , String amenities ,
                 double poolArea , int numberOfFloors) {
        super(id , serviceName , usableArea , rentalCost , maxNumberOfPeople , rentalType);
        this.roomStandard = roomStandard;
        this.amenities = amenities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", amenities='" + amenities + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public void showInfo() {

    }
}
