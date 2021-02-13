import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Loop {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する

        int result = 0;
        String operation = null;
        for(int i=0; i < param.length; i++) {
        	if(param[i].equals("+") || param[i].equals("-")) {
        		operation = param[i];
        	}else {
        		int num = Integer.parseInt(param[i]);
        		if(operation != null) {
        			if(operation.equals("+")) {
        				result += num;
        			}else if(operation.equals("-")) {
        				result -= num;
        			}
        		}else {
        			result = num;
        		}
        	}
        }
        System.out.println(result);
    }
}