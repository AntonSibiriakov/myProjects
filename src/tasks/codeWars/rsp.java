package tasks.codeWars;

public class rsp {
    public static String rps(String p1, String p2) {
        //камень ножницы бумага
        if (p1.equals(p2)) {
            return "Draw!";
        }
        int p1Int = rspInt(p1);
        int p2Int = rspInt(p2);
        int tot = p1Int+p2Int;

        if (tot == 3||tot==5) {
            return p1Int>p2Int?"Player 2 won!":"Player 1 won!";
        }
        if (tot == 4) {
            return p1Int > p2Int ? "Player 1 won!" : "Player 2 won!";
        }
        return null;
    }
    public static int rspInt(String str) {
        if (str.equals("rock")) {
            return 1;
        }
        if (str.equals("scissors")) {
            return 2;
        }
        if (str.equals("paper")) {
            return 3;
        }
        return -1;
    }
}
