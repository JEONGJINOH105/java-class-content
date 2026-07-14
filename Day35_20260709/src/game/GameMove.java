package game;

import java.util.Scanner;

public class GameMove {

	public static void main(String[] args) {

		Scanner 키보드 = new Scanner(System.in);

		// 배열을 이용해서 딱 7칸 만들기
		// 안에 있는 값을 이용해서 0은 빈공간
		// 2는 주인공 위치

		// 키보드를 이용해서 왼쪽은 1번, 3번을 누르면 오른쪽으로 이동

		// 게임판
		int[] game = { 0, 0, 0, 2, 0, 0, 0 };
		
		//주인공의 위치를 기억
		int 주인공위치 = 3;

		while (true) {
			// 게임판 출력
			int 번호 = 0;

			// 게임은 한번 실행하고 끝나는게 아니라 내가 엑스버튼을
			// 누르거나 ESC키를 눌러서 종료해야한다.
			// 그 전까지는 무한반복되야한다.

			while (번호 <= 6) {

				if (game[번호] == 0) {
					System.out.print("__ ");
				} else if (game[번호] == 2) {
					System.out.print("옷 ");
				}

				// 다음칸으로 이동한다.
				++번호;

			}

			// 키보드로 왼쪽/오른쪽 입력받기
			System.out.print("왼쪽(1) / 오른쪽(3) / exit(0) :");
			int 방향 = 키보드.nextInt();
			
			if(방향 == 0) {
				System.out.println("게임 종료! bye~");
				break;
			} else if(방향 == 1) {
			
				//미리 검사한다.
				if(주인공위치 -1 < 0) {
					continue;
				}
				
				//왼쪽으로 이동
				//현재 주인공의 위치를 하나 감소
				// 기존에 주인공의 위치는 빈 공간으로 만들어준다.
				game[주인공위치 -1] = 2;
				game[주인공위치] = 0;
				
				주인공위치 = 주인공위치 - 1;
				
			} else if(방향 == 3) {
				
				if(주인공위치 +1 > 6) {
					continue;
				}
				
				game[주인공위치 +1] = 2;
				game[주인공위치] = 0;
				
				주인공위치 = 주인공위치 + 1;
			}
			
		}
	}
}



/*
프로그램 시작
     │
     ▼
① Scanner 생성
     │
     ▼
② 게임판 배열 생성
     │
     ▼
③ 주인공 위치 저장
     │
     ▼
④ while(true)
     │
     ▼
⑤ 게임판 출력
     │
     ▼
⑥ 방향 입력
     │
     ▼
     방향은?
     │
┌────┼─────┐
│    │     │
▼    ▼     ▼
0    1      3
│    │      │
│    │      │
▼    ▼      ▼
종료  왼쪽이동  오른쪽이동
│    │      │
└────┴──────┘
     │
     ▼
⑦ 게임판 다시 출력
     │
     ▼
⑤로 반복
*/