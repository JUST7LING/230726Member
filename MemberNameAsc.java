package member;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberNameAsc implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		Comparator<MemberDTO> com = new Comparator<MemberDTO>() {
		@Override
		public int compare(MemberDTO m1, MemberDTO m2) {
			return m1.getName().compareTo(m2.getName());
		}// compare
		};
		Collections.sort(list,com);
		
		MemberPrint print = new MemberPrint();
		print.execute(list);
		}// execute
		
	
	

}
