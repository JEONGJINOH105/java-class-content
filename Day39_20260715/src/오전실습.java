import java.util.ArrayList;

class 택배{
	String 이름;
	int 배송비;
	
	택배(String 이름, int 배송비){
		this.이름 = 이름;
		this.배송비 = 배송비;
	}
	
	void 배송하기(){
		System.out.println("배송을 진행합니다");
	}
}

class 우체국택배 extends 택배{
	우체국택배(String 이름, int 배송비){
		super(이름,배송비);
	}
	
	@Override
	void 배송하기(){
		System.out.println("우체국 집배원이 배송합니다");
	}
}

class CJ대한통운 extends 택배{
	CJ대한통운(String 이름, int 배송비){
		super(이름,배송비);
	}
	
	@Override
	void 배송하기(){
		System.out.println("CJ 택배기사가 배송합니다");
	}
}

class 로젠택배 extends 택배{
	로젠택배(String 이름, int 배송비){
		super(이름,배송비);
	}
	
	@Override
	void 배송하기(){
		System.out.println("로젠택배 기사가 배송합니다");
	}
}

class 택배사{
	ArrayList<택배> 오늘접수건 = new ArrayList<>();
}


public class 오전실습 {
	public static void main(String[] args) {
		택배사 대리점 = new 택배사();
		대리점.오늘접수건.add(new 우체국택배("우체국", 3000));
		대리점.오늘접수건.add(new CJ대한통운("CJ", 2500));
		
		for (택배 건 : 대리점.오늘접수건) {
		    건.배송하기();
		}
		
	}
}