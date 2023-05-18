package Unidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pancard 
{
	@Id
private int pan_id;
private String Name;
private String Address;
private long ph_no;
private String DOB;

@OneToMany
List<Banka> bank;

public int getPan_id() {
	return pan_id;
}

public void setPan_id(int pan_id) {
	this.pan_id = pan_id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public long getPh_no() {
	return ph_no;
}

public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public List<Banka> getBank() {
	return bank;
}

public void setBank(List<Banka> bank) {
	this.bank = bank;
}



}
