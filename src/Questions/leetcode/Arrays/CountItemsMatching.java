package Questions.leetcode.Arrays;

import java.util.List;

//1773:Count Items Mathcing a Rule
public class CountItemsMatching {
    public static void main(String[] args) {

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=-1;
        if(ruleKey.equals("type")){
            count=0;
        } else if (ruleKey.equals("color")) {
            count=1;
        } else if (ruleKey.equals("name")) {
            count=2;
        }
        int count2=0;

        for(List<String> item:items){
            if(item.get(count).equals(ruleValue)){
                count2++;
            }
        }
        return count2;
    }


}
