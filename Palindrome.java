public class Palindrome{
  public boolean isPalindrome(String s) {
    int j = s.length()-1;  
    int i = 0; 
    while(i<(s.length()/2 + 1)){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
  }
}
