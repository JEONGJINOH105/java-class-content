
class 내가원하는타입 {
	int a;
	double b;
	String c;
	char d;
}

class 상품 {
	String 이름;
	int 가격;
	int 재고;
}

class 게임캐릭터 {
	String 이름;
	int 체력;
	int 공격력;
}

//게시판에 들어가는 한 개의 정보를 묶는다.
//각각 다른 타입의 변수들을 묶는 기능! class 
//값들의 묶음인데 그 묶음의 대표이름이 필요하다!  게시판정보
//이름이 들어간다. 
class 게시판정보 {
	String 제목;
	String 내용;
	int 조회수;
	String 글쓴이;
}

public class ClassTest2 {

	public static void main(String[] args) {

		// 여러개의 데이터를 저장할때 사용
		// 배열
		// 배열의 단점은 같은 타입만 저장 가능하다.
		int[] 배열1 = { 10, 20, 30 };
		double[] 배열2 = { 1.1, 2.2, 3.3 };

		// 각각 다른 타입들도 여러개 저장하고싶다.
		// 클래스는 다르다.

	}
}