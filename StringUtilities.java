import java.*;


public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return (baseValue+valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        //String rev ="";
        char [] rev= valueToBeReversed.toCharArray();
        int len = valueToBeReversed.length();
        char temp;
        int end =len-1;
        int start =0;
        
        while (end>start){
            
            temp= rev[start];
            rev[start]= rev[end];
            rev [end]=temp;
           end--;
           start++;
            
            
            //rev.charAt(i) = valueToBeReversed.charAt(len-(i+1));
            
        }
        
        return new String(rev);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int a;
        //char [] middle= word.toCharArray();
        int len = word.length();
        
        if(len%2==0){
            
           a=len/2-1;
        }
            
            else {
            
            a=len/2;
        }
        
        return word.charAt(a);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        /*String new_string ="";
        new_string= value.replace(charToRemove,"");
        //value.substring(0,value.indexOf(charToRemove))+
        return new_string; */
        
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String a[] = sentence.split(" ");
        
       
        
        return a[a.length-1];
    }
}
