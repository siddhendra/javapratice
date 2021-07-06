public class duplisetimple {
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
    public duplisetimple(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
    @Override
    public String toString() {
        return "duplisetimple [ename=" + ename + ", eno=" + eno + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
        result = prime * result + eno;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        duplisetimple other = (duplisetimple) obj;
        if (ename == null) {
            if (other.ename != null)
                return false;
        } else if (!ename.equals(other.ename))
            return false;
        if (eno != other.eno)
            return false;
        return true;
    }
      
}
