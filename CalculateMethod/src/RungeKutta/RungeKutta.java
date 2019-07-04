package RungeKutta;

public class RungeKutta {
	private static double f(double x0,double y0) {
	  double x1 = Math.exp(x0);
	  double x2 = Math.sin(x0);
	  double x3 = Math.cos(x0);
		return -20*(y0-x1*x2)+x1*(x2+x3);
	}
	private static double z(double x1) {
		return Math.exp(x1)*Math.sin(x1);
	}
	private static void rungeKutta(double a,double b,double y,int N) {
		double x0 = a,
				y0 = y,
				h = (b-a)/N;
		for(int n=1;n<=N;n++) {
			double k1 = h*f(x0, y0);
			double k2 = h*f(x0+h/2, y0+k1/2);
			double k3 = h*f(x0+h/2, y0+k2/2);
			double k4 = h*f(x0+h, y0+k3);
			double x1 = x0+h;
			double y1 = y0+(k1+2*k2+2*k3+k4)/6;
			System.out.println("x1 = "+x1+" ,y1 = "+y1+" ,ÕæÊµÖµy = "+z(x1));
			x0=x1;y0=y1;
		}
		return ;
	}
	public static void main(String[] args) {
		int[] N = {5,10,20};
		for(int i=0;i<3;i++) {
			System.out.println("N = "+N[i]+":");
			rungeKutta(0.0, 1.0, 0, N[i]);
		}
	}
}
