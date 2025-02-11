public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float X, float Y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
