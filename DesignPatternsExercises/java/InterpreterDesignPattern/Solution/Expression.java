// interface __________(3)__________ {
interface Expression {
	// int __________(4)__________();
	int interpret();

	int FIRST_CONSTANT_INDEX = 0;
	int SECOND_CONSTANT_INDEX = 2;
	String SUMMATION_OPERATOR = "+";
	String SUBTRACTION_OPERATOR = "-";
	String MULTIPLICATION_OPERATOR = "*";
	String DIVISION_OPERATOR = "/";
}
