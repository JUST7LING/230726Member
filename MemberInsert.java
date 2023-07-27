package member;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberInsert implements Member{

	@Override
	public void execute(List<MemberDTO> list) throws InputMismatchException{
		String name;
		int age;
		String phone, address;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		scanner.nextLine(); // flush
		System.out.print("핸드폰 입력 : ");
		phone = scanner.nextLine();
		System.out.print("주소 입력 : ");
		address = scanner.nextLine();
		
		MemberDTO memberDTO = new MemberDTO(name, age, phone, address);
		list.add(memberDTO);
		
		System.out.println("등록 완료");
	
		
	}

}
