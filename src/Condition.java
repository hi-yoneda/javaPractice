import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Condition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        int num1 = Integer.parseInt(param[0]);
        String operator = param[1];
        int num2 = Integer.parseInt(param[2]);

        if(operator.equals("+")) {
        	System.out.println(num1 + num2);
        }else if(operator.equals("-")){
        	System.out.println(num1 - num2);
        }else if(operator.equals("*")) {
        	System.out.println(num1 * num2);
        }else if(operator.equals("/")) {
        	System.out.println(num1 / num2);
        }

        switch(operator) {
        	case "+" :
	        	System.out.println(num1 + num2);
	        	break;
        	case "-" :
        		System.out.println(num1 - num2);
        		break;
        	case "*" :
        		System.out.println(num1 * num2);
        		break;
        	case "/" :
        		System.out.println(num1 / num2);
        }
    }
}