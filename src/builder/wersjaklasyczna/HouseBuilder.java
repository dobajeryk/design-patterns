package builder.wersjaklasyczna;

public interface HouseBuilder {
    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void biuldDoors();
    void buildGarage();

    House getHouse();
}
