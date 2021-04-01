package member.service;

import lombok.Getter;
import member.dao.MemberDao;
import member.vo.Member;

@Getter
public class MemberServiceImpl implements MemberService{
	private MemberDao memberDao = new MemberDao();
	
	@Override
	public void join(Member member) {
		memberDao.join(member);
	}

	@Override
	public Member login(Member member) {
		return memberDao.login(member);
	}

	@Override
	public void logout(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findBy(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
