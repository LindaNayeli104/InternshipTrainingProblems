import java.util.*;


class Roomba {
    public static boolean solve(String[] moves, int x, int y) {
        int xCounter = 0;
        int yCounter = 0;
        for(int i=0; i<moves.length;i++){
            if(moves[i] == "NORTH"){
                yCounter++;
            }else if(moves[i] == "SOUTH"){
                yCounter--;
            }else if(moves[i] == "EAST"){
                xCounter++;
            }else if(moves[i] == "WEST"){
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
