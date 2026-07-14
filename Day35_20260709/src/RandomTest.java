import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		// 랜덤 값들을 이용해서 캐릭터들의 위치나 각각 고객의 고유한 id값들을 생성할때 사용된다.
		// (무작위 수) 만들어주는 도구.

		Random 랜덤도구 = new Random();

		// 정수 뽑기
		int 숫자 = 랜덤도구.nextInt();

		System.out.println("랜덤 값: " + 숫자);

		int 숫자2 = 랜덤도구.nextInt(2);

		System.out.println("랜덤 값: " + 숫자2);
		
		// 1~3 사이에 랜덤값 뽑고싶다
		// nextInt(개수) + 시작수;
		int 숫자3 = 랜덤도구.nextInt(3) +1;

		System.out.println("랜덤 값: " + 숫자3);
		
		int 숫자4 = 랜덤도구.nextInt(45) +1;

		System.out.println("랜덤 값: " + 숫자4);
		
		//1~45사이에 랜덤값 뽑는데 6개 뽑고싶다.
		int count = 1;
		
		while(count <= 6) {
			int 로또 = 랜덤도구.nextInt(45) +1;

			System.out.println("로또 번호: " + 로또);
			
			count++;
		}
		
		String[] 운세들 = {
				"오! 오늘 횡재한다!!",
				"로또에 당첨된다!",
				"집에 가다 빗물 맞는다!",
				"앗! 지갑 잃어버린다.",
				"버스를 놓칠 수 있다.",
				"모든 일이 술술 풀린다.",
				"오늘 귀인 만난다."
		};
		//배열은 항상 공간의 번호가 있다.
		int 랜덤번호 = 랜덤도구.nextInt(운세들.length);
		
		System.out.println("오늘의 운세는!!!");
		System.out.println(운세들[랜덤번호]);

	}
}