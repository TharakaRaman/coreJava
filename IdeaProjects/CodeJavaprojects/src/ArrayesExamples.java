public class ArrayesExamples {
    int[] arrayData;

    public void setArrays(int[] arrayData) {
        this.arrayData = arrayData;
    }
    public void displayArray(){
        for(int i=0; i<this.arrayData.length; i++){
            System.out.println(this.arrayData[i]);
        }
    }
    public void reverseArray(){
        for(int i=this.arrayData.length-1; i>=0; i--){
            System.out.println(this.arrayData[i]);
        }
    }
    public int  maxElementArray(){
        int max = this.arrayData[0];
        for(int i=1; i<this.arrayData.length; i++){
            if(this.arrayData[i]>max){
                max = this.arrayData[i];
            }
        }
        return max;
    }

    public int  minElementArray(){
        int min = this.arrayData[0];
        for(int i=1; i<this.arrayData.length; i++){
            if(this.arrayData[i]<min){
                min = this.arrayData[i];
            }
        }
        return min;
    }

    public int findSecoundMax(){
        int firstmax = this.arrayData[0];
        int secoundmax = this.arrayData[0];
        for(int i=1; i<this.arrayData.length; i++){
            if(this.arrayData[i]>secoundmax){
                firstmax = this.arrayData[i];
            }
        }
        return secoundmax;
    }

    public static void main(String[] args) {
        ArrayesExamples examples = new ArrayesExamples();
        examples.setArrays(new int[]{1,2,3,4,5,6,7,8,9,10});
        examples.displayArray();
        System.out.println("Reversed Array");
        examples.reverseArray();
        System.out.println("Max element in Array== "+examples.maxElementArray());
        System.out.println("Min element in Array== "+examples.minElementArray());
    }
}
