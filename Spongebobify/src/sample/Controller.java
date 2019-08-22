package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;


public class Controller {
	@FXML
	private TextArea input;
	@FXML
	private TextArea output;
	@FXML
	private Button button;


	public void onSpongebobify(){
		output.setText(spongebobify());
	}
	public void onSpongebobify2(){
		output.setText(spongebobify2());
	}


	public String spongebobify(){
		char[] letterArray = input.getText().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : letterArray){
			if (Math.random()<0.5){
				sb.append(Character.toUpperCase(c));
			}else{
				sb.append(Character.toLowerCase(c));
			}
		}
		return new String(String.valueOf(sb));
	}
	public String spongebobify2(){
		char[] letterArray = input.getText().toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean status = true;
		for (char c : letterArray){
			if (status){
				sb.append(Character.toUpperCase(c));
				status = false;
			}else{
				sb.append(Character.toLowerCase(c));
				status = true;
			}
		}
		return new String(String.valueOf(sb));
	}
}
