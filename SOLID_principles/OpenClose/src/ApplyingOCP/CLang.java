package ApplyingOCP;

public class CLang implements Runing {
    @Override
    public void runing(String fileName) {
        System.out.println("Programming Language is a C file cuz we have '" + fileName + "' extesion");
    }
}
