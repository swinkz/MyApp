import javax.faces.bean.ManagedBean;

/**
 * Created by wkoper on 08.09.2016.
 */
@ManagedBean
public class startPage {
    public String letters;

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public String findWords() {
        return letters;
    }
}
