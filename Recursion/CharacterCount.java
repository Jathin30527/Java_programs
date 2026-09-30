public class CharacterCount {
    static int couint(String str , char ch, int index) { 
        if (index == str.length()) {
            return 0 ;
        }
        if (str.charAt(index) == ch) {
            return 1 + couint(str , ch , index + 1) ;
            
        }
        return couint(str, ch, index + 1) ;

    }
    public static void main(String[] args) {
        String str = "banana" ;
        System.out.println(couint(str, 'a', 0));
    }
    
}
