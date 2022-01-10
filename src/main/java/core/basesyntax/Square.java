package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return "Figure: "
                + getClass().getSimpleName() + ","
                + " area: " + getArea() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor();
    }
}