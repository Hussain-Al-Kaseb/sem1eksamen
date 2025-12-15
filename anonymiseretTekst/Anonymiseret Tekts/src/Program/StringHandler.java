package Program;

import java.util.ArrayList;

public class StringHandler {

    public String replaceText(String originalSentence, ArrayList<String> names) {
        for (String name : names) {
            originalSentence = originalSentence.replace(name, "den studerende");
        }
        return originalSentence;
    }
}
