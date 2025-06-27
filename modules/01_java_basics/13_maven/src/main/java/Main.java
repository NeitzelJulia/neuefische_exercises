import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main(String[] args) {
        try {
            String asciiArt1 = FigletFont.convertOneLine("Hello world!");
            System.out.println(asciiArt1);
        } catch (Exception ex) {}
    }
}
