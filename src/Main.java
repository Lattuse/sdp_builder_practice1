public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFloors(2)
                .setRooms(5)
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(false)
                .build();
        System.out.println(house);
    }
}




