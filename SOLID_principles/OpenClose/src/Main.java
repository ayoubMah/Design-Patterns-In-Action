import ApplyingOCP.CLang;
import ApplyingOCP.JavaLang;
import ViolationOCP.ProgramingLanguage;

public class Main {
    public static void main(String[] args) {
        // Violation OCP
        ProgramingLanguage p = new ProgramingLanguage();
        p.programmingWith(".java");
        p.programmingWith(".go");

        // applying OCP => so now if we want to add other langage it's easy to create a new one
        CLang c = new CLang();
        c.runing(".c");
        JavaLang  j = new JavaLang();
        j.runing(".java");


    }



}
