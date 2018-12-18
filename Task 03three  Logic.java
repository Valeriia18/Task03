public class Logic {

    public static boolean isVowelOrConsonant(char a) {
        // switch (String a)
char temp = Character.toLowerCase(a);

        Logic.toLowerCase(a);
        if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'y') {
            return true;
        }
        return false;

    }
    public static boolean isVowelOrConsonantSwitch(char a) {
      char temp = Character.toLowerCase(a);

        Logic.toLowerCase(a);
        boolean f = false;
        switch (temp) {
            case 'a':
               f = true;
                break;
            case 'e':
                f = true;
                break;
            case 'i':
                f = true;
                break;
            case 'o':
                f = true;
                break;
            case 'u':
               f = true;
                break;
            case 'y':
                f = true;
                break;
           default: f = false; break;
        }
        
        return f;

    }
    
    public static boolean isLetterA(char a){             
     return Character.isLetter(a);
    }
    public static boolean isLetterB(char b){             
     return Character.isLetter(b);
    }
     public static char toLowerCase(char a) {
        return Character.toLowerCase(a);
    }

}
