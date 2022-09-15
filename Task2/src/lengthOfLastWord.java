public class lengthOfLastWord {
    public static void main (String[] args) {

        String str = "   fly me   to   the moon  and     back  ";
        String clearStr = str.trim();
        int lastWhiteSpacePosition = clearStr.lastIndexOf(' ');

        System.out.println(clearStr.length()- lastWhiteSpacePosition-1);
    }}

