public class Game {
    public static void main(String[] args){
        System.out.println("Hello Game!");
        int[] myboard = createboard();
        Game mygame = null;
        mygame = new Game();
        mygame.newgame();
    };
    public static int[] createboard(){
        int board[];
        board = new int[64];
        String output = String.format("board length: %s", board.length);
        System.out.println(output);
        return board;
    }
    public Game newgame(){
        return new Game();
    }
}
