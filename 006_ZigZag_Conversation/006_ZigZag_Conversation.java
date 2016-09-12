{
    public String convert(String s, int numRows) {
        int length = s.length();
        if(numRows == 1){
            return s;
        }
        int period = 2*numRows-2;
        StringBuffer result = new StringBuffer(length);
        for(int i = 0; i<numRows;i++){
            if(i == 0 || i == numRows-1 ){
                int index = i;
                while(index < length){
                    result.append(s.charAt(index));
                    index += period;
                }
            }
            else{
                int index1 = i;
                int index2 = period - i;
                while(index1 < length || index2 < length){
                    if(index1 < length && index2 < length){
                        result.append(s.charAt(index1));
                        result.append(s.charAt(index2));
                        index1 += period;
                        index2 += period;
                    }
                    
                    else if(index1 < length && index2 >= length){
                        result.append(s.charAt(index1));
                        break;
                    }
                    
                    else if(index1 >= length && index2 < length){
                        result.append(s.charAt(index2));
                        break;
                    }
                    
                    else{
                        break;
                    }
                }
                
            }
        }
        return result.toString();
    }
}
