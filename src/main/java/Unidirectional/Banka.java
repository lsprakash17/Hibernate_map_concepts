package Unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banka 
{
	@Id
private long Account_no;
private String ifsc_code;
private String branch_code;
private String Address;

public long getAccount_no() {
	return Account_no;
}
public void setAccount_no(long account_no) {
	Account_no = account_no;
}
public String getIfsc_code() {
	return ifsc_code;
}
public void setIfsc_code(String ifsc_code) {
	this.ifsc_code = ifsc_code;
}
public String getBranch_code() {
	return branch_code;
}
public void setBranch_code(String branch_code) {
	this.branch_code = branch_code;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}


}
