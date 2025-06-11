package ViolationOCP;

public class ProgramingLanguage {

    public ProgramingLanguage() {}

    public void programmingWith(String fileName){
        if (fileName == ".java"){
            System.out.println("Programming Language is a Java file");
        }
        else if (fileName == ".c"){
            System.out.println("Programming Language is a C file");
        }
        else if (fileName == ".go"){
            System.out.println("Programming Language is a Go file");
        }
        // so now if we want to add other extension like .js or .html or whatever we should modify this class
        // which is violiting the Open close principle OCP
    }
}
