import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //incase the activities are not sorted then the method of sorting is below
        //first we will make a 2d matrix where we will store index, start and end time for each activity

        // int activities[][] = new int[start.length][3];
        // for(int i =0; i<start.length;i++){
        //     activities[i][0] = i; //index at 0th column
        //     activities[i][1] = start[i]; //start time at 1st column
        //     activities[i][2] = end[i]; // end time at 2nd column
        // }

        // Arrays.sort(activities, Comparator.comparingDouble( o -> o[2])); //sort based on column 2 . o[2]
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0); //activities[0][0]
        int lasActEnd = end[0]; //activities[0][2] and the below code wile change accordingly
        for(int i =1;i<end.length;i++){
            if(start[i] >= lasActEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lasActEnd = end[i];
            }
        }
        System.out.println("Max activities = " +maxAct );
        for(int i =0; i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
