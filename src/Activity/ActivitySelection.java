package Activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
    static void activityselection(ArrayList<Activitys> activitylist){
        Comparator<Activitys> finishtimecomplete=new Comparator<Activitys>() {
            @Override
            public int compare(Activitys o1, Activitys o2) {
                return o1.getFinishtime()-o2.getFinishtime();
            }
        };
        Collections.sort(activitylist,finishtimecomplete);
        Activitys previousactivity=activitylist.get(0);

        System.out.println("\n\nRecommended Schedule:\n"+activitylist.get(0));
            for (int i=0;i<activitylist.size();i++){
                Activitys activity=activitylist.get(i);
                if (activity.getStarttime()>=previousactivity.getFinishtime()){
                    System.out.println(activity);
                    previousactivity=activity;
                }
            }
    }
}
