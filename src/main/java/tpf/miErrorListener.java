package tpf;

import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class miErrorListener extends BaseErrorListener{
    private List<String> err;

    miErrorListener(List<String> errores){
        this.err = errores;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                             String msg, RecognitionException e) {
        err.add("Syntax Error in line "+line+": "+msg);
        System.out.println("Syntax Error in line "+line+": "+msg);        
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        err.add("Report context sensitivity at line "+i);
        System.out.println("Report context sensitivity at line "+i);
    }

    public boolean hayErrores(){
        return err.size() > 0;
    }
}
