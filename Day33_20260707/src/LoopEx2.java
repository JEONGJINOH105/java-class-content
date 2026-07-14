
public class LoopEx2 {

	public static void main(String[] args) {
		
		// 1번 학생부터 20번 학생 호출
		// 3명씩 건너뛰며 번호를 부른다.
		//1 4 7 10 ....
		int 번호 = 1;
		while(번호 <= 20) {
			System.out.println(번호 + "학생");
			번호 += 3;
		}
		
		
		// 엘리베이터 층 출력!
		// 현재 층은 1층  고객이 15층 까지 
		// 1 2 3 4 5 6 7 8 9 ... 15 !
		int 현재층 = 1;
		int 고객이원하는층 = 15;

		while(현재층 <= 고객이원하는층) {
		System.out.println(현재층);
		현재층 += 1;
		}
		
		//로켓 발사!
		// 카운트 다운
		//5
		//4
		//3
		//2
		//1
		
		int count = 5;
		
		System.out.println("로켓 발사 !");
		while(count >= 1) {
			System.out.println(count--);
		}
		
		System.out.println();
		
		// 2단 구구단 
	//  2 * 1 = 2
	//  2 * 2 = 4
	//  2 * 3 = 6
	//  2 * 4 = 8
	//  2 * 5 = 10
	// .....
	// 2 * 9 = 18
		
		int count2 = 1;
		
		while(count2 != 10) {
			System.out.println("2 * " + count2 + "= " + (2*count2));
			count2 += 1;
		}
		
	}
}