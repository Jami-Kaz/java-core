package stepic.begin_course._3_3_inner_conditions;

import java.util.Arrays;

public class Dictionary {
    private String name;
    private String[] words;
    private String[] translations;

    public Dictionary(String name, String... words) {
        this.name = name;
        this.words = words;
        translations = new String[words.length];
    }

    public void setTranslation(String word, String translation) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                translations[i] = translation;
            }
        }
    }
    public String getTranslation(String word) {
        String res = null;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(word)) {
                res = translations[i];
            }
        }
        return res;
    }
    public String toString() {
        return String.format(
                "{name=%s \nwords=%s \ntranslation=%s}",
                name, Arrays.toString(words), Arrays.toString(translations));
    }
}

class Test {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("en-ru", "finish", "start");

        dictionary.setTranslation("finish", "конец");
        dictionary.setTranslation("start", "начало");

        String trans = dictionary.getTranslation("finish");
        dictionary.getTranslation("start");
        System.out.println(dictionary);
    }
}