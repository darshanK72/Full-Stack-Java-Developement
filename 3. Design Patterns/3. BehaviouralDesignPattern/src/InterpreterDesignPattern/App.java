package InterpreterDesignPattern;

public class App {

	public static void main(String[] args) {
		
		InterpreterEngine engine = new InterpreterEngine();
		
		Interpreter intrepreter = new Interpreter(engine);
		
		intrepreter.interpret("add 3 and 6");
		intrepreter.interpret("subtract 11 and 3");
	}

}
