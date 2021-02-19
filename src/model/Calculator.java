package model;

public class Calculator {
	private double operand1;
	private double operand2;
	private String operator;
	private double answer;
	
	public Calculator() {
		super();
	}
	
	public Calculator(double op1, double op2, String operator) {
		setOperand1(op1);
		setOperand2(op2);
		setOperator(operator);
		calculate(op1, op2, operator);
	}
	
	private void calculate(double op1, double op2, String operator) {
		char c = operator.charAt(0);
		if (c == '*') {
			setAnswer(op1 * op2);
		}
		
		else if (c == '/') {
			setAnswer(op1 / op2);
		}
		
		else if (c == '+') {
			setAnswer(op1 + op2);
		}
		
		else if (c == '-') {
			setAnswer(op1 - op2);
		}
		//throw error?
	}

	public double getOperand1() {
		return operand1;
	}
	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}
	public double getOperand2() {
		return operand2;
	}
	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
}
