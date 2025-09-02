package Activity;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Activitys> act=new ArrayList<>();
        act.add(new Activitys("A1",0,6));
        act.add(new Activitys("A2",3,4));
        act.add(new Activitys("A3",1,2));
        act.add(new Activitys("A4",5,8));
        act.add(new Activitys("A5",5,7));
        act.add(new Activitys("A6",8,9));

        ActivitySelection.activityselection(act);
    }
}
