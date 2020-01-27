public class Decipher {
    private String mText;
    private int mNumbers;
    public Decipher(String Text,int Numbers) {
        this.mText= Text;
        this.mNumbers=Numbers;
    }

    public String getText() {
        return mText;
    }

    public int getNumbers() {
        return mNumbers;
    }
    public String getDecryptedText(){
        String decryptMessage = "";
        for(int i=0; i < mText.length();i++)

        {
            char alphabet = mText.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet - mNumbers);

                if(alphabet < 'a') {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - mNumbers);

                if (alphabet < 'A') {
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else
            {
                decryptMessage = decryptMessage + alphabet;
            }
        }
        System.out.println(" decrypt message : " + decryptMessage);
        return decryptMessage;
    }
}

