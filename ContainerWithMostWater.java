import java.util.*;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //brute force
        // for (int i = 0; i < height.size(); i++) {
        //     for(int j=0;j< height.size();j++){
        //         int ht=Math.min(height.get(i),height.get(j));  //shortest of both boundary
        //         int width=j-i;
        //         int currwater=ht*width;
        //         maxWater=Math.max(currwater,maxWater);
        //     }
        // }
        //optimized version 2 pointer approach
        int lp=0;
        int rp=height.size()-1;

        //continue until rp and lp doesnt cross each other as they will only produce duplicates i.e pairs of already visited
        while(lp<rp){
            //Step 1:calculate volume
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;  //area formula
            maxWater=Math.max(currWater,maxWater);  //gives max of area for all pairs

            //Step2:Now update pointers
            if(height.get(lp)<height.get(rp)){
                lp++;  //if left pointer height is small than right one then move left pointer by one
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();  // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print(storeWater(height));
    }
}
