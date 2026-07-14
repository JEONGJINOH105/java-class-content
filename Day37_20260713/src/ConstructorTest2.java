import java.util.Random;
import java.util.Scanner;

class 유저{
	String 닉네임;
	int 점수;
	int 승리횟수;
	int 패배횟수;
	int 무승부횟수;
	유저(String 닉네임){
		this.닉네임 = 닉네임;
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {

		// 가위(0) 누르면 가위를 냈다!
		// 바위(1) 누르면 바위를 냈다!
		// 보 (2) 누르면 보를 냈다!게임
		// 이기는 경우 ,나를 기준으로 작성
		// 나 컴퓨터
		// 가위 보 (이긴다)
		//		          가위(비김)
		//		          주먹(졌다)
	
		// 보 주먹(이긴다)
		//		          보(비김)
		//		          가위(졌다)

		// 바위 가위(이긴다)
		//		          주먹(비김)
		//		          보(졌다)

		// 1. 필요한 도구들 가져오기
		//  컴퓨터는 랜덤하게 숫자를 뽑아야된다.
		//  사람은 키보드로 입력을한다.
		Scanner 키보드 = new Scanner(System.in);
		Random 랜덤도구 = new Random();
		
		// 게임시작을 누르면 유저의 닉네임을 가져와서 
		유저 첫번째유저 = new 유저("너구리");
		유저 두번째유저 = new 유저("포로리");
				
		
		// 2. 컴퓨터는 0~2 사이에 숫자 하나를 입력받는다.
		// 사람은 키보드로 0~2상에 숫자를 하나 작성한다.
		
		int 컴퓨터선택 = 랜덤도구.nextInt(3);
		System.out.println("내가 가위0 바위1 보2 : ");
		int 나선택= 키보드.nextInt();
		
		String[] 이름표 = {"가위","바위","보"};
		System.out.println("나 : " + 이름표[나선택] + " / 컴퓨터: " + 이름표[컴퓨터선택]);
		
		
		
		// 3. 비교! (이겼다? 졌다 ? 비겼다) 
	    //   정답을 출력하기!

		if (나선택 == 컴퓨터선택) {
			System.out.println("비겼다!");
			} else if (
			(나선택 == 0 && 컴퓨터선택 == 2) || // 가위 vs 보 → 이김
			(나선택 == 1 && 컴퓨터선택 == 0) || // 바위 vs 가위 → 이김
			(나선택 == 2 && 컴퓨터선택 == 1)
			) { // 보 vs 바위 → 이김
			System.out.println("이겼다!");
			} else {
			System.out.println("졌다!");
			}
		
	}
}