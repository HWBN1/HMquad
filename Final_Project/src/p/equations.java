
package p;
public class equations {

	public double[] linear_equation(double a,double b,double c,double d,double f,double e)
	{
		double[] ans=new double[2];
		
		ans[0]=(e*d-b*f)/(a*d-b*c);
		ans[1]=(a*f-e*c)/(a*d-b*c);
		
		return ans;
	}
	
	public double[] linear_equation(double a,double b,double c,double d,
			double l,double m,double n,double k,
			double p,double q,double r,double s)
	{
		double[] ans=new double[2];
		
		double D = (a*m*r+b*p*n+c*l*q)-(a*n*q+b*l*r+c*m*p);
		 ans[0] = ((b*r*k+c*m*s+d*n*q)-(b*n*s+c*q*k+d*m*r))/D;
		 ans[1] = ((a*n*s+c*p*k+d*l*r)-(a*r*k+c*l*s+d*n*p))/D;
		 ans[2] = ((a*q*k+b*l*s+d*m*p)-(a*m*s+b*p*k+d*l*q))/D;
		
		return ans;
	}
	
	public double[] Quadratic_Equations(double a,double b,double c)
	{
		double[] ans=new double[2];
		double dis=(Math.pow(b,2.0))-(4*a*c);
		
		ans[0]=(Math.pow(dis,0.5)-b)/(2*a);
		ans[1]=(-1*(Math.pow(dis,0.5))-b)/(2*a);
		
		return ans;
	}
	
	public double[] Cubic_Equations(double a,double b,double c,double d)
	{
		double[] ans=new double[3];
		double t1=(2*a*a*a -9*a*b +27*c);
		double t2=(-a*a + 3*b);
		double t3= t1*t1 + 4*t2*t2*t2;
		  
		double t4=((-t1 + Math.sqrt(t3))/54);
		double t41=((-t1 - Math.sqrt(t3))/54);
		double t5=(-a*a + 3*b);
		double t6=Math.sqrt(t1*t1 + 4*t5*t5*t5);
		double t7=((-t1 - t6)/54);
		ans[0] = -a/3 + Math.pow(t4,1/3) + Math.pow(t7,1/3);
		ans[1] = -a/3 - 0.5*Math.pow(t4,1/3)+  -0.5*Math.pow(t4,1/3);
		ans[2] = -a/3 + Math.pow(t4,1/3) + Math.pow(t41,1/3);
		return ans;
		
	}
	
	
	 
	
}
