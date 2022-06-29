public class LetterInventory {

    private static final int TOTAL_LETTERS = 26;
    private final int[] letterCounts = new int[TOTAL_LETTERS];
    private int size;

    public LetterInventory(String data){
        for (int i = 0; i < data.length(); i++){
            if (isLetter(data.toLowerCase().charAt(i))) {
                letterCounts[data.toLowerCase().charAt(i) - 'a']++;
                size++;
            }
        }
    }

    public int get(char letter){
        if (isLetter(Character.toLowerCase(letter)))
            return letterCounts[Character.toLowerCase(letter) - 'a'];
        else
            throw new IllegalArgumentException();
    }

    public void set(char letter, int value){
        letterCounts[Character.toLowerCase(letter) - 'a'] = value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String returnVal = "[";
        for (int i = 0; i < TOTAL_LETTERS; i++){
            for (int j = 0; j < letterCounts[i]; j++){
                returnVal += (char)('a' + i);
            }
        }
        return returnVal + "]";
    }

    private boolean isLetter(char letter){
        return (letter >= 'a' && letter <= 'z');
    }
}
