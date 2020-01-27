public class Cipher {
    private String mText;
    private int mNumbers;
    public Cipher(String Text,int Numbers) {
        this.mText= Text;
        this.mNumbers=Numbers;
    }

    public String getText() {
        return mText;
    }

    public int getNumbers() {
        return mNumbers;
    }
    public String getEncryptedText(){
        String ciphertext = "";
        char alphabet;
        for (int i=0;i<mText.length();i++){
            alphabet = mText.charAt(i);
            if(alphabet>='a'&& alphabet<='z'){
                alphabet = (char)(alphabet + mNumbers);
                if(alphabet>'z'){
                    alphabet = (char)(alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext+alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z'){
                alphabet=(char)(alphabet+mNumbers);
                if (alphabet>'Z'){
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println(" ciphertext : " + ciphertext);
        return ciphertext;
    }
}
