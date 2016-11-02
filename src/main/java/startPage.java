import javax.faces.bean.ManagedBean;

/**
 * Created by wkoper on 08.09.2016.
 */
@ManagedBean
public class startPage {
    public String welcomeText = "Welcome! ;)";

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }
}
