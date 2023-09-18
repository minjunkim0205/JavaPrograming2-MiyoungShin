package Week4Practice;

public class Word {
    /*Private*/
    final private String word_en;
    final private String word_kr;
    /*Static*/
    /*Constructor*/
    public Word(final String word_en, final String word_kr) {
        this.word_en = word_en;
        this.word_kr = word_kr;
    }
    /*Public*/
    public String getWordEn(){
        return word_en;
    }
    public String getWordKr(){
        return word_kr;
    }
    /*ToString*/
    public String toString() {
        return (word_en+" : "+word_kr);
    }
}
