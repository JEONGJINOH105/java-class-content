
class 로그인{
	private String 아이디;
	
	  로그인(String 아이디){
		this.아이디 = 아이디;
	}
	
	void 로그인처리(String 아이디){
		this.아이디 = 아이디;
		System.out.println("로그인을 처리합니다");
	}
}

class 이메일로그인 extends 로그인{
	 이메일로그인(String 아이디) {
		super(아이디);
	}
	
	@Override
	void 로그인처리(String 아이디){
		System.out.println(아이디 + " 님, 이메일과 비밀번호를 확인합니다");
	}
}

class 카카오로그인 extends 로그인{
	 카카오로그인(String 아이디) {
		super(아이디);
	}
	
	@Override
	void 로그인처리(String 아이디){
		System.out.println(아이디 + " 님, 카카오톡 인증을 요청합니다");
	}
}

class 지문로그인 extends 로그인{
	 지문로그인(String 아이디) {
		super(아이디);
	}
	
	@Override
	void 로그인처리(String 아이디){
		System.out.println(아이디 + " 님, 지문 인식을 시작합니다");
	}
}


class 결제{
	int 잔액;
	
	public 결제(int 잔액) {
        this.잔액 = 잔액;
    }
	
	void 결제하기(int 금액){
		잔액 -= 금액;
		System.out.println("결제 완료: " + 금액 + "원");
	}
}

class 카드결제 extends 결제{
	public 카드결제(int 잔액) {
        super(잔액); 
    }
	
	@Override
	void 결제하기(int 금액){
		int 수수료 = 금액 * 2 / 100;
        this.잔액 -= (금액 + 수수료);
		System.out.println("결제 완료: " + 금액 + "원 (수수료포함)");
        System.out.println("// 잔액: " + this.잔액);
	}
}

class 카카오페이결제 extends 결제{
	public 카카오페이결제(int 잔액) {
        super(잔액);
    }
	
	@Override
	void 결제하기(int 금액){
		this.잔액 -= 금액;
		System.out.println("카카오페이 결제 완료: " + 금액 + "원");
		System.out.println("// 잔액: " + this.잔액);
	}
}

public class MethodOverrideTest4 {
	public static void main(String[] args) {
		
		// 1. 로그인 시스템
		로그인 방법1 = new 이메일로그인("minsu01");
		로그인 방법2 = new 카카오로그인("minsu01");
		로그인 방법3 = new 지문로그인("minsu01");
		
		방법1.로그인처리("minsu01");
		방법2.로그인처리("minsu01");
		방법3.로그인처리("minsu01");
		
		
		// 2. 결제 시스템
		
		카드결제 내카드 = new 카드결제(100000);
		카카오페이결제 내페이 = new 카카오페이결제(100000);
		
		내카드.결제하기(10000);
		내페이.결제하기(10000);
		
	}
}