 import java.math.BigInteger;
 //import java.util.String;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          BigInteger factorial = new BigInteger("1");
        
        for (int i=1;i<=number;i++){
            
          factorial=factorial.multiply(BigInteger.valueOf(i)); 
        
        }
        
        return factorial.intValue();
          
    
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acro=""+phrase.charAt(0);
          
          for (int i=1;i<phrase.length();i++){
              
              if(Character.isWhitespace(phrase.charAt(i)))
              {
                  
                acro=acro+phrase.charAt(i+1);  
                  
                }
                
                else continue;
              
              
            }
          
          return acro.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String encpt="";
          //String sample ="abcdefghijklmnopqrstuvwxyz";
          
          for (int count=0;count<word.length();count++){
              
             switch(word.charAt(count)){
                 
               case 'a':
               //word.charAt(count)= 'd';
               encpt=encpt+'d';
               
               break;
               
               case 'b':
               
               //word.charAt(count)= 'e';
               encpt=encpt+'e';
               break;
               
               case 'c':
               
               //word.charAt(count)= 'f';
               encpt=encpt+'f';
              
               break;
               
               case 'd':
               
               //word.charAt(count)= 'g';
               encpt=encpt+'g';
               break;
               
               case 'e':
               
               //word.charAt(count)= 'h';
               encpt=encpt+'h';
               break;
               
               case 'f':
               
               //word.charAt(count)= 'i';
               encpt=encpt+'i';
               break;
               
               
               
               case 'g':
               
               //word.charAt(count)= 'j';
               encpt=encpt+'j';
               break;
               
               case 'h':
               
               //word.charAt(count)= 'k';
               encpt=encpt+'k';
               break;
               case 'i':
               
               //word.charAt(count)= 'l';
               encpt=encpt+'l';
               break;
               
               case 'j':
               
               //word.charAt(count)= 'm';
               encpt=encpt+'m';
               break;
               case 'k':
               
               //word.charAt(count)= 'n';
               encpt=encpt+'n';
               break;
               case 'l':
               
               //word.charAt(count)= 'o';
               encpt=encpt+'o';
               break;
               
               case 'm':
               
               //word.charAt(count)= 'p';
               encpt=encpt+'p';
               break;
               case 'n':
               
               //word.charAt(count)= 'q';
               encpt=encpt+'q';
               break;
               case 'o':
               
               //word.charAt(count)= 'r';
               
               encpt=encpt+'r';
               break;
               
               case 'p':
               
               //word.charAt(count)= 's';
               encpt=encpt+'s';
               break;
               
               case 'q':
               
               //word.charAt(count)= 't';
               encpt=encpt+'t';
               break;
               
               case 'r':
               
               //word.charAt(count)= 'u';
               encpt=encpt+'u';
               break;
               
               case 's':
               
               //word.charAt(count)= 'v';
               encpt=encpt+'v';
               break;
               case 't':
               
               //word.charAt(count)= 'w';
               encpt=encpt+'w';
               break;
               case 'u':
               
               //word.charAt(count)= 'x';
               encpt=encpt+'x';
               break;
               case 'v':
               
               //word.charAt(count)= 'y';
               
               encpt=encpt+'y';
               break;
               
               case 'w':
               
               //word.charAt(count)= 'z';
               encpt=encpt+'z';
               break;
               
               case 'x':
               
               //word.charAt(count)= 'a';
               encpt=encpt+'a';
               break;
               
               case 'y':
               
               //word.charAt(count)= 'b';
               
               encpt=encpt+'b';
               break;
               case 'z':
               
               //word.charAt(count)= 'c';
               encpt=encpt+'c';
               break;
               
                 
                }
              
            }
          
          
          return encpt;
      }
}
