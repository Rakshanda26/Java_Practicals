import java.util.SplittableRandom;
public class OtpGenerator {
    public static void main(String[] args)
	{
		System.out.println(OtpGenerator.generateOtp(5));
	}
	public static String generateOtp(int otplength)
	{
		SplittableRandom splittableRandom =new SplittableRandom();
	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i< otplength;i++)
		{
			sb.append(splittableRandom.nextInt(0,10));
		}
		return sb.toString();
	}
}
