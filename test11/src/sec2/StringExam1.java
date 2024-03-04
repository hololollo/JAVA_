package sec2;

public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "강범준";
		String name2 = new String("강범준"); // 같은 의미.
		// int su1 = 1004; -> int형과  String형 비교라서 오류 
		Integer su1 = 1004;
		String su2 = "1004";
		String su3 = String.valueOf(su1); // su1을 문자열로 변경
		System.out.println(su1.equals(su2)); // 두개 다 참조형으로 취급하니까 가능.(주소값 비교 false)
		System.out.println(su2.equals(su3)); // su3을 int타입으로 변경하니까 가능.(값 비교 true)
		
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지"; 
		// ,,로 나눠 지지 않은 상태로 문자열 하나에서 나누어 출력하는 방법
		
		String[] names = new String[6];
		names = str.split("/");
		for (String s : names) {
			System.out.println(s);
		}
		/*
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		*/
		String str2 = new String();
		str2.equals(str);
		System.out.println(str2);
		
		
	}
	
	

}
