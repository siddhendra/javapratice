public class empa {
    int eno;
	String ename;
	//HAS-A relationship
	Addresshas addr;
	public empa(int eno, String ename, Addresshas addr)
	{
		this.eno = eno;
		this.ename = ename;
		this.addr = addr;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Addresshas getAddr() {
		return addr;
	}
	public void setAddr(Addresshas addr) {
		this.addr = addr;
	}
    
}
