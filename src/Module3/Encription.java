package Module3;

public class Encription {
    //public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";
    public static String text = "Lorem ipsum is a placeholder text";

    public static String encrypt(String text, int shift) {
        String result = "";

        for(int i = 0; i < text.length(); i++){

            char ch = text.charAt(i);
            //System.out.println(ch);
            //System.out.println((int) ch);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + shift);
                if (ch > (int)'Z') ch = (char) (ch % ((int)'Z' + 1) + (int)'A');
            }

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch + shift);
                if (ch > (int)'z') ch = (char) (ch % ((int)'z' + 1) + (int)'a');
            }

            //System.out.println((int) ch);

            result = result + ch;
        }
        return result;
    }

    public static String decrypt(String text, int shift) {
        String result = "";

        for(int i = 0; i < text.length(); i++){

            char ch = text.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - shift);
                if (ch < (int)'A') ch = (char) ( (int)'Z' - ((int)'A' -1 ) % ch );
            }

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - shift);
                if (ch < (int)'a') ch = (char) ( (int)'z' - ((int)'a' - 1) % ch );
            }
            result = result + ch;
        }
        return result;
    }

    public static String encrypt2(String text, int shift) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        char[] encrypted = new char[text.length()];

        while (shift < 0) {
            shift += upper.length();
        }

        for (int i = 0; i < text.length(); i++) {
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
                System.out.println(text.charAt(i));
                System.out.println(upper.indexOf(text.charAt(i)));
                System.out.println((upper.indexOf(text.charAt(i)) + shift));
                System.out.println((upper.indexOf(text.charAt(i)) + shift) % upper.length());
                System.out.println(encrypted[i]);
            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
                System.out.println(text.charAt(i));
                System.out.println(lower.indexOf(text.charAt(i)));
                System.out.println((lower.indexOf(text.charAt(i)) + shift));
                System.out.println((lower.indexOf(text.charAt(i)) + shift) % lower.length());
                System.out.println(encrypted[i]);
            } else {
                encrypted[i] = text.charAt(i);
            }
        }

        return new String(encrypted);
    }

    public static String decrypt2(String text, int shift) {
        return encrypt2(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(text);
        String encryptedText = encrypt2(text, 5);
        System.out.println(encryptedText);
        String decryptedText = decrypt2(encryptedText, 5);
        System.out.println(decryptedText);


        System.out.println(text.equals(decryptedText));
    }
}
