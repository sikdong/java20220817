package ch15.lecture;

import java.util.Arrays;
import java.util.List;

public class C02List {
	//리스트 만드는 방법
	List<String> list = Arrays.asList("java", "css", "spring");
	
	//리스트 만드는 방법
	List<String> list1 = List.of("java", "css", "spring");
	// 주의 위 방법들은 추가 불가능
//	list.add("jsp");  // x
//	list1.add("jsp"); // x
}
