import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

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

    public List search(String letters) {
        System.err.println("Search for letters: " + letters);
        return availableWords(letters);
    }

    private List availableWords(String letters) {
        List availableWords = new ArrayList();
        availableWords.add(letters);
        return availableWords;
    }
}
