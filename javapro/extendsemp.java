
public class extendsemp {
 public static void main(String[] args)
{
    address a1 = new address(101, "hyd");
    emp1 e = new emp1(011, "siddu", a1);
    System.out.println(e.getEno()+"-"+e.getEname());
    System.out.println(e.getAddr().getHno() +"-" +e.getAddr().getLoc());
}    
}
