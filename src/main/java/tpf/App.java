package tpf;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Cuartetos cuartetos = new Cuartetos();
        System.out.println( "Bienvenido al compilador" );
        CharStream input = CharStreams.fromFileName("input/programa.txt");
        tpfLexer lexer = new tpfLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tpfParser parser = new tpfParser(tokens);
        miListener listener = new miListener(parser);
        miErrorListener eListener = new miErrorListener(listener.getErrores());
        lexer.addErrorListener(eListener);
        parser.addErrorListener(eListener);
        parser.addParseListener(listener);
        ParseTree t = parser.si();
        if (eListener.hayErrores()){
            System.out.println("No se genera el código de tres direcciones por la presencia de errores");
        }
        else{
            miVisitor visitor = new miVisitor(cuartetos);
            visitor.visit(t);
            String TAC = cuartetos.getThreeAddressCode();
            System.out.println(TAC);
            cuartetos.optimizar();
            System.out.println(TAC);
        }
    }
}
