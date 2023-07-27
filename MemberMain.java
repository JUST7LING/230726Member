package member;

import java.util.InputMismatchException;

public class MemberMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		
		while(true) {
			try {
				memberService.menu();
				break;
			}catch(InputMismatchException e) {
				System.out.println("번호를 정확히 입력해 주세요."); 
			}
		}
	}

}
