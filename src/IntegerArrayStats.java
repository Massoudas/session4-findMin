public class IntegerArrayStats {

    public static int findMin(int[] array){
        int min=0;
        for(int i=0; i<array.length-1;i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]) min=array[j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, -1, 10, -13};
        System.out.println( findMin(array));

    }
}
