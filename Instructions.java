package computer_architecture_mips_implementation;

public class Instructions {

	public String instName;
	public String reg1;
	public String reg2;
	public String comments;
	public int numStalls;
	public int getNumStalls() {
		return numStalls;
	}
	public void setNumStalls(int numStalls) {
		this.numStalls = numStalls;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getReg1() {
		return reg1;
	}
	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}
	public String getReg2() {
		return reg2;
	}
	public void setReg2(String reg2) {
		this.reg2 = reg2;
	}



}
