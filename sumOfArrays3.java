public class sumOfArrays3 {
    static int sumArrays(int[] array, int index){
        if (array.length == index) {
            return 0;
        }
        return array[index] + sumArrays(array,index + 1);  
   }     
    public static void main(String[] args){
        int[] data = { 2, 1, 3, 4, 6, 7, 8, 9};
        int hasil = sumArrays(data, 0);
        System.out.println("Sum of array = " + hasil);
    }
    
}
