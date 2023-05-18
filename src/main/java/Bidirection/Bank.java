package Bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bank 
{
	@Id
	private int acc_no;
	private String IFSC;
	private String BranchId;
	private String BrachAddresas;
	@ManyToOne
	Pancard1 pancard1s;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getBranchId() {
		return BranchId;
	}
	public void setBranchId(String branchId) {
		BranchId = branchId;
	}
	public String getBrachAddresas() {
		return BrachAddresas;
	}
	public void setBrachAddresas(String brachAddresas) {
		BrachAddresas = brachAddresas;
	}
	public Pancard1 getPancard1s() {
		return pancard1s;
	}
	public void setPancard1s(Pancard1 pancard1s) {
		this.pancard1s = pancard1s;
	}
	
	
	

}
