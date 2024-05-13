package java_0513_ch06;

public class Memberservice {

	String id;
	int password;
	
	public boolean Memberservice(String id, int password) {
	
		if ((this.id.equals("hong")) && (this.password==12345)) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}	
}
