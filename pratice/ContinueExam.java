public class ContinueExam {
    public static void main(String[] args) {
        int j=0;
        do
	{
	   if (j==5)
	   {
		 j++;
		 continue;
	   }
	   System.out.print(j+ " ");
	   j++;
       }
       while(j<10);
    }
    
}
