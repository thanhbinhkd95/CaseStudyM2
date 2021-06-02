package model;

public class Room extends Service {
    protected String freeService;

    public Room(String id , String serviceName , String usableArea , String rentalCost , String maxNumberOfPeople , String rentalType , String freeService) {
        super(id , serviceName , usableArea , rentalCost , maxNumberOfPeople , rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
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
