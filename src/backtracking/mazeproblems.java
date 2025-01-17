package backtracking;

import java.util.ArrayList;

public class mazeproblems {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(pathdia("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("",board
                ,0,0);
    }

    static int count ( int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int down=count(r-1,c);
        int right=count(r,c-1);
        return down+right;
    }

//    printing path

    static ArrayList<String> path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c>1) {
            list.addAll(path(p + 'D', r-1, c));
        }

        if (c > 1) {
            list.addAll(path(p + 'R', r, c-1));
        }
        return list;
    }

//    diagonal
static ArrayList<String> pathdia(String p, int r, int c) {
    if (r == 1 && c == 1) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;

    }
    ArrayList<String> list = new ArrayList<>();
    if (r > 1) {
        list.addAll(pathdia(p + 'D', r-1, c-1));
    }
    if (r > 1) {
        list.addAll(pathdia(p + 'V', r-1, c));
    }

    if (c > 1) {
        list.addAll(pathdia(p + 'H', r, c-1));
    }
    return list;
}

//maze with obstacle
static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
        System.out.println(p);
        return;
    }

    if (maze[r][c]==false) {
        return;
    }

    if (r < maze.length - 1) {
        pathRestrictions(p + 'D', maze, r+1, c);
    }

    if (c < maze[0].length - 1) {
        pathRestrictions(p + 'R', maze, r, c+1);
    }
}


}
