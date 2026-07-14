
class 동물{
String 이름;
int 나이;
String 품종;
}
//강아지는 동물이다!
class 강아지 extends 동물{

// 예방접종 여부!
String 예방접종날짜;
}
class 도마뱀 extends 동물{

double 온도;
double 습도;

}
class 고양이 extends 동물{
//스크래쳐사용여부
boolean 스크래쳐사용여부;
}
class 토끼 extends 동물{
int 당근섭취량;
}

class 부모님{
	String 재산 = "10억";
	String 집 = "60평";
}

class 자식 extends 부모님{
	String 슈퍼카 = "람보르기니";
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		
		강아지 말티즈 = new 강아지();
		
		말티즈.이름 = "초코";
		말티즈.나이 = 3;
		말티즈.품종 = "말티즈";
		
		고양이 페르시안 = new 고양이();
		
		페르시안.이름 = "나비";
		페르시안.나이 = 2;
		페르시안.품종 = "페르시안";
		
		도마뱀 레오파드게코 = new 도마뱀();
		
		레오파드게코.이름 = "레오";
		레오파드게코.나이 = 1;
		레오파드게코.품종 = "레오파드게코";
		
		토끼 앙고라 = new 토끼();
		
		앙고라.이름 = "토순이";
		앙고라.나이 = 2;
		앙고라.품종 = "앙고라";
		
	}
}




/*// 아이돌의 정보를 저장하는 프로그램
class 아이돌{
	String 이름;
	String 포지션;
	String 팀이름;
}



// 소녀시대의 정보를 저장하기때문에 하나 묶는다.
class 소녀시대 extends 아이돌{
	
}

//슈퍼주니어의 정보를 저장하기 위한
class 슈퍼주니어 extends 아이돌{
	
}

// 세븐틴 13명 정보를 저장하는 타입
class 세븐틴 extends 아이돌{
	
}

//NCT 그룹 26명 정보를 저장하는 타입
class NCT extends 아이돌{
	
}*/