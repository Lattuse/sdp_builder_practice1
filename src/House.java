public class House {
    private final int floors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final boolean hasSwimmingPool;

    // private constructor here
    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // getters
    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    // builder class
    public static class Builder {
        private int floors;
        private int rooms;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
