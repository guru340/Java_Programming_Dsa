package Activity;

public class Activitys {
    private String name;
    private int starttime;
    private int finishtime;

    public Activitys(String name, int starttime, int finishtime) {
        this.name = name;
        this.starttime = starttime;
        this.finishtime = finishtime;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getStarttime(){
        return starttime;
    }
    public void setStarttime(int starttime){
        this.starttime=starttime;
    }public int getFinishtime(){
        return finishtime;
    }
    public void setFinishtime(int finishtime){
        this.finishtime=finishtime;
    }
    @Override
    public String toString(){
        return "name"+name+"Starttime"+starttime+"finishtime"+finishtime;
    }

}
