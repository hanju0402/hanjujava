
public class Member {
	private String ID;
	private String PassWord;
	
	public Member(String iD, String passWord) {
		super();
		ID = iD;
		PassWord = passWord;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	@Override
	public String toString() {
		return "Member [ID=" + ID + ", PassWord=" + PassWord + "]";
	}
	
	

}
