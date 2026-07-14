import java.util.ArrayList;
import java.util.Scanner;

class 책2 {
    String 제목;
    String 저자;
    String 대출자;
    String 대출일;
    String 반납예정일;
    boolean 반납완료여부;
}

public class LibrarySystem {
    public static void main(String[] args) {
        
        Scanner 키보드 = new Scanner(System.in);
        ArrayList<책2> 책정보 = new ArrayList<>(); // 💡 무한히 쌓일 도서 창고

        while (true) {
            System.out.println("\n========= 도서 등록 시스템 =========");
            System.out.println("1. 새 도서 등록하기");
            System.out.println("2. 전체 도서 목록 보기");
            System.out.println("3. 시스템 종료");
            System.out.print("메뉴 번호 선택: ");
            int 메뉴 = 키보드.nextInt();
            키보드.nextLine(); // ⭐ nextInt() 직후 버퍼 비우기 청소기!

            if (메뉴 == 1) {
                // 💡 [질문의 핵심] 개발자가 치는 게 아니라, 사용자에게 물어보고 입력받기!
                System.out.print("📚 책 제목 입력: ");
                String 입력제목 = 키보드.nextLine();

                System.out.print("✍️ 저자 이름 입력: ");
                String 입력저자 = 키보드.nextLine();

                System.out.print("👤 대출자 이름 입력: ");
                String 입력대출자 =  키보드.nextLine();

                System.out.print("📅 대출일 입력 (YYYY-MM-DD): ");
                String 입력대출일 = 키보드.nextLine();

                System.out.print("📅 반납예정일 입력 (YYYY-MM-DD): ");
                String 입력반납예정일 = 키보드.nextLine();

                // 💡 1. 사용자가 입력을 마치면 그 타이밍에 "빈 붕어빵 상자"를 새로 하나 찍어냅니다.
                책2 새책 = new 책2();

                // 💡 2. 사용자가 입력했던 변수 알맹이들을 새 상자 칸칸이 배달합니다.
                새책.제목 = 입력제목;
                새책.저자 = 입력저자;
                새책.대출자 = 입력대출자;
                새책.대출일 = 입력대출일;
                새책.반납예정일 = 입력반납예정일;
                새책.반납완료여부 = false; // 신규 등록이니 기본값은 false로 세팅

                // 💡 3. 데이터가 꽉 찬 새책 상자를 도서 창고(ArrayList)에 add 합니다!
                책정보.add(새책);
                System.out.println("🎉 [안내] " + 입력제목 + " 정보가 창고에 자동으로 저장되었습니다!");

            } else if (메뉴 == 2) {
                System.out.println("\n--- 📋 현재 창고에 저장된 도서 리스트 ---");
                if (책정보.size() == 0) {
                    System.out.println("등록된 책이 하나도 없습니다.");
                } else {
                    // 향상된 for문으로 창고에 쌓인 책들을 하나씩 꺼내서 보여줍니다.
                    for (책2 b : 책정보) {
                        System.out.println("[" + b.제목 + "] 저자: " + b.저자 + " / 대출자: " + b.대출자 + " / 반납예정: " + b.반납예정일);
                    }
                }

            } else if (메뉴 == 3) {
                System.out.println("도서 시스템을 종료합니다.");
                break;
            }
        }
        키보드.close();
    }
}