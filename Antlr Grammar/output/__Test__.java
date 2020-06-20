import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        PragLexer lex = new PragLexer(new ANTLRFileStream("D:\\Users\\czetie\\Documents\\GitHub\\Prag\\Antlr Grammar\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        PragParser g = new PragParser(tokens, 49100, null);
        try {
            g.ID();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}