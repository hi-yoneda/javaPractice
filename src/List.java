//String型のList,Mapを作成して、その内容をコンソール画面に表示する。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class List {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> foods = new ArrayList<String>();

		foods.add("バナナ");
		foods.add("ヨーグルト");
		foods.add("プロテイン");

		//getメソッド
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}

		// iterator
		Iterator it = foods.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//拡張for文
		for(String food: foods) {
			System.out.println(food);
		}


		Map <String,Integer> drinks = new HashMap <String, Integer>();
		drinks.put("ビール",500);
		drinks.put("ハイボール",400);
		drinks.put("モンスターエナジー",200);

		//HashMapは順序を指定しない
		for(String key : drinks.keySet()) {
			Integer drink = drinks.get(key);
			System.out.println(key + " : " + drink);
		}


	}

}
