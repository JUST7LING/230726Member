package member;

import java.util.List;

public interface Member {
	
	public void execute(List<MemberDTO> list);
	// ArrayList의 super가 List이므로 이렇게 써도 관계없다.

}
