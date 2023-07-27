package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput implements Member{


	@Override
	public void execute(List<MemberDTO> list) {
		
		try {
			output(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void output(List<MemberDTO> list) throws IOException{
		ObjectOutputStream oos = 
				new ObjectOutputStream
					(new FileOutputStream("member.txt"));
		
		for(MemberDTO memberDTO : list) {
			
			oos.writeObject(memberDTO);
			// writeObject()를 사용하면 덮어쓰기 형태이다.
			
		}//for
		oos.close();
	}
}
