import java.util.HashMap;

public class userdefinedmap {
    int eid;
    String ename;
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public userdefinedmap(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + eid;
        result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
        userdefinedmap other = (userdefinedmap) obj;
        if (eid != other.eid)
            return false;
        if (ename == null) {
            if (other.ename != null)
                return false;
        } else if (!ename.equals(other.ename))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "userdefinedmap [eid=" + eid + ", ename=" + ename + "]";
    }
    
    }
    
}
