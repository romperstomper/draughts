public class Carrier extends Battleship{
    public int hits = 7;

    @Override
    public int getSize() {
        return this.hits;
    }

}
