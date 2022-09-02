package preview;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		InterfaceC ic = (InterfaceC) ia;
		
	}
}
