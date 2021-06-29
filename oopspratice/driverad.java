public class driverad {
    public static void main(String[] args)
	{
		Addresshas a1=new Addresshas(105,"hyd");
		empa e=new empa(5035,"siddu",a1);
		System.out.println(e.getEno() +"-"+e.getEname());
		System.out.println(e.getAddr().getHno() +"-"+e.getAddr().getLoc());
	}
    
}
