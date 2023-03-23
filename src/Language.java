public class Language {
    String languages;
    Language(String a){
        languages = a;
        System.out.println(languages + " is a language");

    }

    public static void main(String[] args) {
        Language l = new Language("Sinhala");
        Language l1 = new Language("English");
        Language l2 = new Language("Tamil");
    }
}
