package member.service;

import member.vo.Member;

public interface MemberService {
	// 가입
	public abstract void join(Member member);
	// 로그인
	Member login(Member member);
	// 로그아웃
	void logout(Member member);
	
	// 회원찾기
	Member findBy(String userid);
}
