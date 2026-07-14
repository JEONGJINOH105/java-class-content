
public class FunctionTest2 {
	
	public static void 체중(double bmi,String 성함) {
		if(bmi >= 30) {
			System.out.println(성함 + "님은 비만입니다.");
		} else if(bmi >= 25) {
			System.out.println(성함 + "님은 과체중입니다.");
		} else if(bmi >= 18.5) {
			System.out.println(성함 + "님은 정상입니다.");
		} else {
			System.out.println(성함 + "님은 저체중입니다.");
		}
	}

	// 긴 코드들이 중복되서 나오기 때문에 
	// 하나 단어로 바꿔서 계속 사용하려고
	// 여러개의 실행문들을 묶어서 계속 재사용하려고
	
	//등급을 출력하는 기능안에 판단이 들어갔다.
	public static void 등급(int 점수,String 과목명) {
		if (점수 >= 90) {
			System.out.println(과목명 + ": A등급");
		} else if (점수 >= 80) {
			System.out.println(과목명 + ": B등급");
		} else if (점수 >= 70) {
			System.out.println(과목명 + ": C등급");
		} else if (점수 >= 60) {
			System.out.println(과목명 + ": D등급");
		} else {
			System.out.println(과목명 + ": F등급");
		}
	}
	

	public static void main(String[] args) {
		
		// 병원에서 건강검진
		// BMI 지수 100번 판단!
		// 비만,과체중 , 정상 , 저체중
//		String 이름 = "철수";
//		double bmi = 22.5;
//
//		String 이름2 = "영희";
//		double bmi2 = 18.3;
//
//		String 이름3 = "민수";
//		double bmi3 = 25;

		// 30이상 비만
		// 25이상 ~ 30미만 과체중
		// 18.5이상 ~ 25미만 정상
		// 18.5미만 저체중 

		// 1. 함수 쓰지마시고! if문 
		
//		if(bmi >= 30) {
//			System.out.println("철수님은 비만입니다.");
//		} else if(bmi >= 25) {
//			System.out.println("철수님은 과체중입니다.");
//		} else if(bmi >= 18.5) {
//			System.out.println("철수님은 정상입니다.");
//		} else {
//			System.out.println("철수님은 저체중입니다.");
//		}
//		
//		if(bmi2 >= 30) {
//			System.out.println("영희님은 비만입니다.");
//		} else if(bmi2 >= 25) {
//			System.out.println("영희님은 과체중입니다.");
//		} else if(bmi2 >= 18.5) {
//			System.out.println("영희님은 정상입니다.");
//		} else {
//			System.out.println("영희님은 저체중입니다.");
//		}
//		
//		if(bmi3 >= 30) {
//			System.out.println("민수님은 비만입니다.");
//		} else if(bmi3 >= 25) {
//			System.out.println("민수님은 과체중입니다.");
//		} else if(bmi3 >= 18.5) {
//			System.out.println("민수님은 정상입니다.");
//		} else {
//			System.out.println("민수님은 저체중입니다.");
//		}

		// 2. 함수로 변경해서 장점 파악!
		체중(22.5,"철수");
		체중(18.3,"영희");
		체중(25,"영희");
		
		
		
System.out.println();
System.out.println();
		
		// 국어, 영어, 수학 각각 점수 100,80,90
		int 국어 = 100, 영어 = 80, 수학 = 90;

		// 각각의 등급 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 나머지는 모두 F

//국어의 등급 A 등급
//영어 등급  B 등급
//수학 등급  A 등급 

		등급(국어,"국어");

		// 영어 등급
		등급(영어,"영어");

		// 수학 등급
		등급(수학,"수학");
		
		// 사회 등급 
        등급(100 ,"사회");
        
        // 과학 등급 
        등급(50, "과학");

	}
}