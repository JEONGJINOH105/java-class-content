import java.util.ArrayList;
import java.util.Scanner;

class 고객{
	String 이름;
	String 전화번호;
	int 포인트;
	public 고객(String 이름, String 전화번호, int 포인트) {
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.포인트 = 포인트;
	}
}

public class CafeManager {

public static void main(String[] args) {

	
	Scanner 키보드 = new Scanner(System.in);
	ArrayList<고객> 고객정보 = new ArrayList<>();
	
	while(true) {
		
		System.out.println("\n===== 메뉴 =====");
        System.out.println("1. 고객 등록");
        System.out.println("2. 포인트 적립");
        System.out.println("3. 포인트 조회");
        System.out.println("0. 종료");
        System.out.print("선택: ");
        int 선택 = 키보드.nextInt();
        키보드.nextLine();
        
        if(선택 == 1) {
        	System.out.print("이름: ");
        	String 이름 = 키보드.nextLine();
        	System.out.print("전화번호: ");
        	String 전화번호 = 키보드.nextLine();
        	
        	고객 새로운회원 = new 고객(이름, 전화번호, 0);
        	고객정보.add(새로운회원);
        	
        	System.out.println("🎉 [안내] " + 이름 + " 고객님이 새로 등록되었습니다.");
        } else if(선택 == 2) {
        	System.out.print("이름: ");
        	String 입력한이름 = 키보드.nextLine();
        	System.out.print("전화번호: ");
        	String 입력한전화번호 = 키보드.nextLine();
        	
        	int count = 0;
        	boolean 탐색 = false;
        	
        	while(count < 고객정보.size()) {
        		고객 한분 = 고객정보.get(count);
        		
        		if(한분.이름.equals(입력한이름) && 한분.전화번호.equals(입력한전화번호)) {
        			한분.포인트 += 100;
        			System.out.println("포인트 적립이 완료되었습니다.");
        			System.out.println("현재 포인트 금액: " + 한분.포인트 + "점");
        			탐색 = true;
        			break;
        		} 
        		count += 1;
        	if(탐색 == false) {
                System.out.println("❌ 일치하는 회원 정보가 없습니다. 다시 입력해 주세요.");
        	}
          }
        } else if(선택 == 3) {
        	System.out.print("조회할 전화번호 입력: ");
            String 입력한전화번호 = 키보드.nextLine();
            
            int count2 = 0;
            boolean 탐색2 = false;
            
            while(count2 < 고객정보.size()) {
                고객 한분 = 고객정보.get(count2);
                
                if(한분.전화번호.equals(입력한전화번호)) {
                    System.out.println("[조회 결과]");
                    System.out.println("고객 이름: " + 한분.이름);
                    System.out.println("현재 포인트: " + 한분.포인트 + "점");
                    
                    탐색2 = true;
                    break;   
                }
                count2 += 1;
            }
            
            if(탐색2 == false) {
                System.out.println("등록되지 않은 정보입니다.");
            }
        } else if(선택 == 0) {
        	System.out.println("프로그램을 종료합니다.");
            break;
        } else {
        	System.out.println("번호를 다시 누르십시오.");
        }
		
	}
 }
}


/*
 * 
 * 카페 포인트 적립 — 상황
 * 고객 정보
 *  이름,전화번호,포인트 
 * 
 * 
 * 전화번호 하나로 여러 정보를 관리하는 상황 
 * (등록 → 적립 → 조회) 등록 시점엔 이름,
 * 전화번호만 알고, 포인트는 아직 없음 (이제 막 가입했으니까)
 * 
 * 기본값 필드기본값왜 이 값인지이름(직접 입력)등록 
 * 시점에 이미 앎전화번호(직접 입력)등록 시점에 이미 앎
 * 포인트 0  방금 가입했으니 적립된 게 없음
 * 
 * 
 * System.out.println("\n===== 메뉴 =====");
            System.out.println("1. 고객 등록");
            System.out.println("2. 포인트 적립");
            System.out.println("3. 포인트 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");
 */