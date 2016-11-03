public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        getNums(result, 0, A);
        int nums = 0;
        for(int i: result){
            nums += (i-1)*(i-2)*0.5;
        }
        return nums;
    }
    
    public void getNums(ArrayList<Integer> result, int index, int[] array){
        if(index > array.length - 3) return;
        if(array[index] + array[index+2] != array[index+1] * 2) getNums(result, index+1, array);
        else{
            int i = index + 2;
            int difference = array[index+1] - array[index];
            while(i+1<array.length && (array[i+1] - array[i]) == difference) i++;
            result.add(i - index + 1);
            getNums(result, i, array);
        }
    }
}
