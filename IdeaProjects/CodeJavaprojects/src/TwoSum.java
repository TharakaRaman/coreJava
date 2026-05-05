public class TwoSum {
    public static void main(String[] args) {
        int[] arrayData= {4,1,3,5,7,2};
        int target = 6;

        for(int index=0;index<arrayData.length;index++){
            System.out.println(arrayData[index]);
            for(int j=index;j<arrayData.length;j++){
                int sum =  arrayData[index]+arrayData[j];
                //System.out.println(":::::"+sum);
                if(arrayData[index]+arrayData[j]==target){
                    System.out.println("index of target ::"+arrayData[index]);
                    System.out.println("index of target ::"+arrayData[j]);
                }
            }
        }

    }
}
