package mortgage.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MortgageCalculatorController {
	
	// Attributes
	@FXML
	private TextField income;
	@FXML
	private TextField monthlyDebt;
	@FXML
	private TextField interestRate;
	@FXML
	private TextField downPayment;
	@FXML
	private double housingPayment;
	@FXML
	private double housingPlusOther;
	@FXML
	private double maximumPayment;
	@FXML
	private double amountFinanced;
	@FXML
	private Button calculateButton;
	@FXML
	final ComboBox<Integer> term = new ComboBox<Integer>();
	
    // Calculate method to work on button
	@FXML
	public void handleCalculate(){
		double incom = Double.valueOf(income.getText());
		double mDebt = Double.valueOf(monthlyDebt.getText());
		double iRate = Double.valueOf(interestRate.getText());
		double dPayment = Double.valueOf(downPayment.getText());
		this.housingPlusOther = (( incom / 30 ) * 0.36);
		this.housingPayment = (( incom / 30 ) * 0.18);
		this.maximumPayment = housingPayment;
		this.amountFinanced = 0;
	}
}
