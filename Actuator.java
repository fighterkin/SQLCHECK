import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Actuator {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        JavaLexer lexer = new JavaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaParser parser = new JavaParser(tokens);
	System.out.println("asw");
    }
}
