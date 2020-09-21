import java.util.*;


class Roomba {
    public static boolean solve(String[] moves, int x, int y) {
        int xCounter = 0;
        int yCounter = 0;
        for(int i=0; i<moves.length;i++){
            if(moves[i].equals("NORTH")){
                yCounter++;
            }else if(moves[i].equals("SOUTH")){
                yCounter--;
            }else if(moves[i].equals("EAST")){
                xCounter++;
            }else if(moves[i].equals("WEST")){
                xCounter--;
            }
        }
        if(x==xCounter && y==yCounter){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String[] moves = {"NORTH", "EAST"};
        int x = 1;
        int y = 1;
        System.out.println(solve(moves,x,y));
    }
}
