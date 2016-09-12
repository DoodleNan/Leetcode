{
    public int compareVersion(String version1, String version2) {
        int result = 0;
        String []s1 = version1.split("\\.");
        String []s2 = version2.split("\\.");
        int length = s1.length > s2.length ? s1.length:s2.length;
        int []array1 = new int[length];
        int []array2 = new int[length];
        for(int i = 0; i<length;i++){
            if(i < s1.length){
                array1[i] = Integer.parseInt(s1[i]);
            }
            if(i < s2.length){
                array2[i] = Integer.parseInt(s2[i]);
            }
        }
        
        for(int i = 0; i<length;i++){
            if(array1[i] == array2[i]){
                if(i == length){
                    break;
                }
                else{
                    continue;
                }
            }
            else{
                result =  array1[i] > array2[i] ? 1:-1;
                break;
            }
            
        }
        return result;
    }
}
