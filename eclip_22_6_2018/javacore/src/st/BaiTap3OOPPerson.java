package st;

import com.doituong.model.BaiTapOOP3Address;
import com.doituong.model.BaiTapOOP3BloodGroup;
import com.doituong.model.BaiTapOOP3Mammal;

public abstract class BaiTap3OOPPerson implements BaiTapOOP3Mammal {

	private String fistName;
	private BaiTapOOP3BloodGroup blood;
	private BaiTapOOP3Address homeAddress;
	private BaiTapOOP3Address schoolAddress;
	
	public BaiTapOOP3BloodGroup getBlood() {
		return blood;
	}

	public void setBlood(BaiTapOOP3BloodGroup blood) {
		this.blood = blood;
	}

	public BaiTapOOP3Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(BaiTapOOP3Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public BaiTapOOP3Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(BaiTapOOP3Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public void setDateOfBirth() {
		
	}
	
	public int getAgesAsDates() {
		return 0;
		
	}
}
