import model.*;

public class Main {
    public static void main(String[] args) { Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 25, 3, 1);
        Lamp lamp = new Lamp(LampType.DESK, true, 75);
        Wardrobe wardrobe = new Wardrobe(75,75,32.5);
        Carpet carpet = new Carpet(5, 7, PaintColor.BLUE);


        Bedroom myBedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);


        System.out.println("Bedroom name: " + myBedroom.getName());
        myBedroom.getWall1().create();
        System.out.println("Ceiling height: " + myBedroom.getCeiling().getHeight());
        myBedroom.getBed().make();
        myBedroom.getLamp().turnOn();
        myBedroom.getCarpet().lying();





    }
}