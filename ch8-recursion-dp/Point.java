public class Point {
    int row;
    int col;

    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Point) && ((Point) o).row == this.row && ((Point) o).col == this.col) {
            return true;
        } else {
            return false;
        }
    }
}
