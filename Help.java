class Help {
	public static void main(String[] args) 
		throws java.io.IOException	{
		System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");

		char num = (char) System.in.read();

		switch(num) {
			case '1':
				System.out.println("The if:\n\nif(condition) statement;\nelse statement;");
				break;
			case '2':
				System.out.println("The switch:\n\nswitch(expression) {\n\tcase constant:\n\t\tstatement sequence\n\t\tbreak;\n\t// ...\n}");
				break;
			default:
				System.out.println("Not 1 or 2");
		}

	}
}