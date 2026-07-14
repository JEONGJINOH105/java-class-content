import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner 키보드 = new Scanner(System.in);
	
	static ArrayList<String> 장바구니 = new ArrayList<>();

	static int 총금액 = 0;

	public static void 커피(int coffeePrice,String c) {
		키보드.nextLine();

		System.out.println("=== 사이즈 선택 ===");
		System.out.println("1. G(grande)");
		System.out.println("2. R(regular)");
		System.out.println("3. S(short)");
		System.out.print("번호 입력: ");
		int 사이즈선택 = 키보드.nextInt();

		총금액 += coffeePrice;

		if (사이즈선택 == 1) {
			총금액 += 1000;
		} else if (사이즈선택 == 2) {
			총금액 += 500;
		} else if (사이즈선택 == 3) {
			총금액 += 0;
		}
		
		장바구니.add(c);
		System.out.println("🛒 " + c + "가 장바구니에 담겼습니다.");
		
	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("⭐Welcome to Harry Cafe⭐");
			System.out.println("1. 메뉴 선택");
			System.out.println("2. 장바구니");
			System.out.println("3. 결제");
			System.out.print("번호 입력: ");
			int 번호선택 = 키보드.nextInt();

			if (번호선택 == 1) {
				System.out.println("=== 커피 선택란 ===");
				System.out.println("1. 아메리카노");
				System.out.println("2. 카페모카");
				System.out.println("3. 카페라떼");
				System.out.println("4. 그린티라떼");
				System.out.print("번호 입력: ");
				int 커피선택 = 키보드.nextInt();

				if (커피선택 == 1) {

					커피(3900,"아메리카노");
					
				} else if (커피선택 == 2) {

					커피(4500,"카페모카");
					
				} else if (커피선택 == 3) {

					커피(5000,"카페라떼");

				} else if (커피선택 == 4) {

					커피(5500,"그린티라떼");

				} 
				
			} else if (번호선택 == 2) {

				System.out.println(장바구니);

			} else if (번호선택 == 3) {

				System.out.println("=== 결제 ===");
				System.out.println("총금액: " + 총금액);
				
				break;

			}
		}

	}
}