package tpf;

import java.io.File;
import java.io.FileWriter;
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
            File fileout = new File("output/analisis.txt");
            FileWriter output = new FileWriter(fileout,true);
            miVisitor visitor = new miVisitor(cuartetos);
            visitor.visit(t);
            String TAC = cuartetos.getThreeAddressCode();
            cuartetos.optimizar();
            String TACOptimized = cuartetos.getThreeAddressCode();
            try {
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.write("A continuación se imprime el código de tres direcciones sin optimizar:\n");
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.write(TAC);
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.write("A continuación, imprimimos el código de tres direcciones con una revisión de optimización:\n");
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.write(TACOptimized);
                output.write("\n----------------------------------------------------------------------------------------------------------\n");
                output.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}
