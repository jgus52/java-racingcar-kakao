package racingcar;

public class Car {
    private int position;
    private String name;

    Car(String name) {
        position = 0;
        this.name = name;
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    public CarDTO toDTO() {
        return new CarDTO(this.name, this.position);
    }
}
