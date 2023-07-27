package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberFileInput implements Member{

	@Override
	public void execute(List<MemberDTO> list) {
		
		try {
			try {
				input(list);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void input(List<MemberDTO> list) throws IOException, ClassNotFoundException{
		
		ArrayList<MemberDTO> read = new ArrayList<>();
		ObjectInputStream ois = new ObjectInputStream
					(new FileInputStream("member.txt"));
		
		while(true) {
			try {
				MemberDTO memberDTO = (MemberDTO) ois.readObject();
				read.add(memberDTO);
			}catch(EOFException e) {
				// 파일의 끝에 도달했을 때 발생하는 오류이다.
				break;
			}
		} // while
		
		
		ois.close();
		for(MemberDTO memberDTO2 : read) {
	
			System.out.println(memberDTO2);
			
		}//for
		
	}



}