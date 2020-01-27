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
}
