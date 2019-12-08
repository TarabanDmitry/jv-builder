package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String model;
    private String pilotName;
    private String color;
    private int numOfEngines;
    private Boolean hasGun;

    public Plane(String model,
                 String pilotName,
                 String color,
                 int numOfEngines,
                 Boolean hasGun) {
        this.model = model;
        this.pilotName = pilotName;
        this.color = color;
        this.numOfEngines = numOfEngines;
        this.hasGun = hasGun;
    }

    public static class PlaneBuilder {

        private String model;
        private String pilotName;
        private String color;
        private int numOfEngines;
        private Boolean hasGun;

        public PlaneBuilder(String model,
                            String pilotName,
                            String color,
                            int numOfEngines,
                            Boolean hasGun) {
            this.model = model;
            this.pilotName = pilotName;
            this.color = color;
            this.numOfEngines = numOfEngines;
            this.hasGun = hasGun;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            this.pilotName = pilotName;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setNumOfEngines(int numOfEngines) {
            this.numOfEngines = numOfEngines;
            return this;
        }

        public PlaneBuilder setHasGun(Boolean hasGun) {
            this.hasGun = hasGun;
            return this;
        }

        public Plane build() {
            return new Plane(this.model,
                    this.pilotName,
                    this.color,
                    this.numOfEngines,
                    this.hasGun);
        }

    }

}
