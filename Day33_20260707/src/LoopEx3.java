import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		
		
		
		
		Scanner 키보드 = new Scanner(System.in);
		
		// 아이디 찾기 
		String[] 기존아이디 = {"apple", "banana", "cherry"};

		//1. 사용자한테 아이디를 입력받아서 확인
		System.out.println("기존 아이디를 입력하세요.");
		String 찾을아이디 = 키보드.nextLine();
		
		//2. 입력했으면 기존 아이디 배열에서 찾는다.
		int 번호 = 0;
		
		while(번호 <= 2) {
			boolean 결과 = 찾을아이디.equals(기존아이디[번호]);
			
			if(결과) {
				System.out.println("찾았습니다.");
				break;
			}
			번호++;
		}




		System.out.println();
		System.out.println();
		
		
		//break 그만! 이제 반복하지마!
		String[] fruits = {"딸기", "사과", "바나나", "포도"};
		
		// 배열에서 사과라는 과일을 찾는다
		// 검색을 할 때 기본적으로 왼쪽 기준으로 즉 0번째 인덱스부터 찾는다.
		
		int 공간번호 = 0; //시작값
		
		while(공간번호 <= 3) {
			if(fruits[공간번호].equals("사과")) {
				System.out.println("사과 찾았다! 몇번째 공간: " + 공간번호);
				break;
			}
			공간번호 += 1;
		}
		
		
		
	}
}