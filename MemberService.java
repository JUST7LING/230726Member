package member;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberService {	
	
	public void menu() throws InputMismatchException {
		ArrayList<MemberDTO> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		Member member = null;
		while(cont!= 6) {
			System.out.println("************************");
			System.out.println("\t1. 등록");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 파일 저장");
			System.out.println("\t4. 파일 읽기");
			System.out.println("\t5. 이름으로 오름차순");
			System.out.println("\t6. 끝");
			System.out.println("************************");
			System.out.print("번호 : ");
			cont = scanner.nextInt();
			
			if(cont==6) break;

			switch(cont) {
			
			case 1: try {
						member = new MemberInsert();
					}catch(Exception e) {
						System.out.println("잘못된 입력값입니다. : MemberService.java -> select case 1");
					}break;

			case 2:	member = new MemberPrint();
					break;
					
			case 3: member = new MemberFileOutput();
					break;
					
			case 4: member = new MemberFileInput();
					break;
					
			case 5 : member = new MemberNameAsc();
					break;
					
			default: System.out.println("값이 잘못되었습니다.");
					 continue;
			}// switch
			
			member.execute(list);

		}// while
	}
	
}
