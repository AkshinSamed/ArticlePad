package session4.geometricshape;

public enum ShapeType {
    TRIANGLE(3);

    private final int sideCount;

    private ShapeType(int sideCount) {
        this.sideCount = sideCount;
    }

    public int sideCount() {
        return sideCount;
    }
}
