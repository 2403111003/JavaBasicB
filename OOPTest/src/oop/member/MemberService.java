package oop.member;

public interface MemberService {
	void regist(Member member);
	void remove(String id);
	void login(String id, String password);
	void logout(String id);
	String info(String id, String password);
}
