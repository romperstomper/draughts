public class Destroyer extends Battleship {
    public int hits = 5;

    @Override
    public int getSize() {
        return this.hits;
    }
}
