package model;

public class TempConverter {

	private double temperature;
	private boolean isF;
	private String answer;
	
	
	public TempConverter() {
		super();
		
	}
	public TempConverter(double t, boolean isF) {
		super();
		this.temperature = t;
		ConvertTemp(t, isF);
	}
	
	public void ConvertTemp (double temp, boolean isF) {
		if (isF == false) {
			//convert to F
			answer = String.valueOf((temp * 1.8) + 32) + 'F';
		}
		else if (isF == true) {
			//convert to C
			answer = String.valueOf((temp - 32) * 0.5556) + 'C';
		}
	}

	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public boolean isF() {
		return isF;
	}
	public void setF(boolean isF) {
		this.isF = isF;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
