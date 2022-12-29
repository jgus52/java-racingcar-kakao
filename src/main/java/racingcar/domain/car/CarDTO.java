package racingcar.domain.car;

public class CarDTO {
    public CarDTO(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.name +
                ": " +
                "-".repeat(Math.max(0, this.position));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CarDTO))
            return false;

        CarDTO cp = (CarDTO) obj;

        return name.equals(cp.name) && cp.position == this.position;
    }

    private final String name;
    private final int position;
}
