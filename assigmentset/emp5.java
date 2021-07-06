public class emp5 {
    int eno;
	String ename;
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
	public emp5(int eno, String ename)
	{
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString()
	{
		return eno+"-"+ename;
	}
	
	public boolean equals(Object obj) 
	{
		emp5 e=(emp5)obj;
		boolean flag=false;
		if(this.eno==e.eno && this.ename.equals(e.ename))
			return true;
		else
			return false;
        }
    
}
