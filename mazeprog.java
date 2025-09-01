public class mazeprog {
    public static void maze (int sr, int sc, int er, int ec, String s) {
        if(sr == er && sc == ec){ 
            System.out.println(s);
            return;
        }
        if(sr > er || sc > ec) return;
        maze(sr + 1, sc, er, ec, s + "D");
        maze(sr, sc + 1, er, ec, s + "R");
        return;
    }
    public static void main(String[] args) {
        int row = 2, col = 3;
        maze (1 , 1, row, col, "");
    }
}
