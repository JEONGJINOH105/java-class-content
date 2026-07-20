import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiTest3 {

	public GuiTest3() { 
		
		System.out.println("test3 실행해!");
		
		// 창 만들기
		JFrame 화면2 = new JFrame();
		
		// 화면 설정
		화면2.setSize(400,300);
		
		// 내용 넣기
		JLabel 아이디라벨 = new JLabel("아이디: ");
		
		// 버튼
		JButton 확인버튼 = new JButton("확인!");
		
		
		//실무에서는 add를 이용해서 여러개의 도구들을 하나의 창에 붙인다.
		화면2.add(아이디라벨);
		화면2.add(확인버튼);
		
		// 보여주기
		화면2.setVisible(true);
		
	}
	
}
