import enums.LampType;
import enums.PaintColor;
import model.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Wall[] walls = {wall1, wall2, wall3, wall4};
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        ceiling.create();
        Bed bed = new Bed("Single", 5, 180, 2, 3);
        Lamp lamp = new Lamp(LampType.DESK, true, 75);
        lamp.turnOn();
        Bedroom bedroom = new Bedroom("My Bedroom",
                wall1, wall2, wall3, wall4, ceiling,bed,
                new Lamp(LampType.DESK, true, 75),
                new Wardrobe(75, 75, 32.5),
                new Carpet(5, 7, PaintColor.BLUE));
        System.out.println(bedroom);
    }
}