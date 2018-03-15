public class Game {
    public static void main(String[] args){
        System.out.println("Hello Game!");
        Game game = new Game();
        int[] myboard = game.createboard();
        Game mygame = null;
        mygame = new Game();
        mygame.newgame();
    };
    public int[] createboard(){
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
