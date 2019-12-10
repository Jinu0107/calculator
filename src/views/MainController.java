package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	// int 를 String 로 :String.valueOf()
	// String 를 int 로 : Integer.parseInt()
	@FXML
	private Label mainLabel; // 계산결과가 보이는 라벨
	@FXML
	private Label subLabel; // 계산과정이 보이는 라벨
	private String clicknumber; // 숫자패드 클릭
	private boolean onoff;
	private int x;
	private String operator;
	private boolean temp;
	private boolean temp1;
	private boolean temp2;

	@FXML
	private void initialize() {
		reset();
	}

	public void reset() { // 계산결과,과정등을 모두 초기화
		mainLabel.setText("0 ");
		onoff = true;
		operator = "";
		subLabel.setText("");
		temp = true;
		x = 0;
		temp1 = true;
		temp2 = true;
	}

	public void input(String n) { // 입력할때
		temp2 = false;
		if (onoff == true) {
			mainLabel.setText("");
			onoff = false;
		}
		mainLabel.setText(mainLabel.getText() + n);
		subLabel.setText(subLabel.getText() + n);
	}

	public void click1() { // 1 ~~ 9 까지 수를 클릭했을때
		clicknumber = "1";
		input(clicknumber);
		temp1 = false;
	}

	public void click2() {
		clicknumber = "2";
		input(clicknumber);
		temp1 = false;
	}

	public void click3() {
		clicknumber = "3";
		input(clicknumber);
		temp1 = false;
	}

	public void click4() {
		clicknumber = "4";
		input(clicknumber);
		temp1 = false;
	}

	public void click5() {
		clicknumber = "5";
		input(clicknumber);
		temp1 = false;
	}

	public void click6() {
		clicknumber = "6";
		input(clicknumber);
		temp1 = false;
	}

	public void click7() {
		clicknumber = "7";
		input(clicknumber);
		temp1 = false;
	}

	public void click8() {
		clicknumber = "8";
		input(clicknumber);
		temp1 = false;
	}

	public void click9() {
		clicknumber = "9";
		input(clicknumber);
		temp1 = false;
	}

	public void click0() {
		clicknumber = "0";
		input(clicknumber);
		temp1 = false;
	}

	public void plus() {
		if (temp1 == false) {
			if (temp == true) {
				temp = false;
				temp1 = true;
			} else {
				mainLabel.setText(calculate(operator, x, Integer.parseInt(mainLabel.getText())) + "");
			}
			operator = "+";
			x = Integer.parseInt(mainLabel.getText());
			onoff = true;
			temp1 = true;
			subLabel.setText(subLabel.getText() + " + ");
		}

	}

	public void minus() {
		if (temp1 == false) {
			if (temp == true) {
				temp = false;
				temp1 = true;
			} else {
				mainLabel.setText(calculate(operator, x, Integer.parseInt(mainLabel.getText())) + "");
			}
			operator = "-";
			x = Integer.parseInt(mainLabel.getText());
			onoff = true;
			temp1 = true;
			subLabel.setText(subLabel.getText() + " - ");

		}
	}

	public void multiplication() {
		if (temp1 == false) {
			if (temp == true) {
				temp = false;
				temp1 = true;
			} else {
				mainLabel.setText(calculate(operator, x, Integer.parseInt(mainLabel.getText())) + "");
			}
			operator = "x";
			x = Integer.parseInt(mainLabel.getText());
			onoff = true;
			temp1 = true;
			subLabel.setText(subLabel.getText() + " x ");
		}
	}

	public void division() {
		if (temp1 == false) {
			if (temp == true) {
				temp = false;
				temp1 = true;
			} else {
				mainLabel.setText(calculate(operator, x, Integer.parseInt(mainLabel.getText())) + "");
			}
			operator = "/";
			x = Integer.parseInt(mainLabel.getText());
			onoff = true;
			temp1 = true;
			subLabel.setText(subLabel.getText() + " / ");

		}
	}

	public void equal() {
		if (temp2 == false) {
			temp = true;
			mainLabel.setText(calculate(operator, x, Integer.parseInt(mainLabel.getText())) + "");
			temp2 = true;
		}
	}

	public int calculate(String operator, int x, int y) {
		if (operator.equals("+")) {
			return x + y;
		} else if (operator.equals("-")) {
			return x - y;
		} else if (operator.equals("x")) {
			return x * y;
		} else {
			return x / y;
		}

	}

}
