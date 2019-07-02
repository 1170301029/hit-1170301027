package Lagerange;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lagerange {
	public static double fx1(double x) {
		return (double)1/(1+x*x);
	}
	public static double fex(double x) {
		return Math.exp(x);
	}
	public static double f1d2(double x) {
		return Math.sqrt(x);
	}
	public static double cal(int choice,double x) {
		if(choice==1) {
			return fx1(x);
		}else if (choice==2) {
			return fex(x);
		}else {
			return f1d2(x);
		}
	}
	public static void lagerange(Double x,List<Double> list,int choice) {
		int n=list.size()-1;
		double y = 0.0;
		for(int k=0;k<=n;k++) {
			double l = 1.0;
			for(int j=0;j<k;j++) {
				l = l*(x-list.get(j))/(list.get(k)-list.get(j));
			}
			for(int j=k+1;j<=n;j++) {
				l = l*(x-list.get(j))/(list.get(k)-list.get(j));
			}
			y = y+l*cal(choice,list.get(k));
		}
		System.out.println("x = "+x+" ,y ="+y+" ,fx = "+cal(choice, x)+" ,Îó²îe = "+(cal(choice, x)-y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("question 1:");
		System.out.println("(1):fx = 1/(1+x^2) ,x in [-5.0,5.0]");
		int[] n = {5,10,20}; 
		List<Double> list = new ArrayList<Double>();
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(-5.0+j*10.0/n1);
			}
			System.out.println("when n = "+n1+":");
			lagerange(0.75, list, 1);
			lagerange(1.75, list, 1);
			lagerange(2.75, list, 1);
			lagerange(3.75, list, 1);
			lagerange(4.75, list, 1);
			list.clear();
		}
		System.out.println("(2):fx = e^x ,x in [-1.0,1.0]");
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(-1.0+j*2.0/n1);
			}
			System.out.println("when n = "+n1+":");
			lagerange(-0.95, list, 2);
			lagerange(-0.05, list, 2);
			lagerange(0.05, list, 2);
			lagerange(0.95, list, 2);
			list.clear();
		}
		System.out.println("question 2:");
		System.out.println("(1):fx = 1/(1+x^2) ,x in [-1.0,1.0]");
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(-1.0+j*2.0/n1);
			}
			System.out.println("when n = "+n1+":");
			lagerange(-0.95, list, 1);
			lagerange(-0.05, list, 1);
			lagerange(0.05, list, 1);
			lagerange(0.95, list, 1);
			list.clear();
		}
		System.out.println("(2):fx = e^x ,x in [-5.0,5.0]");
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(-5.0+j*10.0/n1);
			}
			System.out.println("when n = "+n1+":");
			lagerange(-4.75, list, 2);
			lagerange(-0.25, list, 2);
			lagerange(0.25, list, 2);
			lagerange(4.75, list, 2);
			list.clear();
		}
		System.out.println("question 3:");
		System.out.println("(1):fx = 1/(1+x^2) ,x in [-1.0,1.0]");
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(Math.cos((2*j+1)*Math.PI/2/(n1+1)));
			}
			System.out.println("when n = "+n1+":");
			lagerange(-0.95, list, 1);
			lagerange(-0.05, list, 1);
			lagerange(0.05, list, 1);
			lagerange(0.95, list, 1);
			list.clear();
		}
		System.out.println("(2):fx = e^x ,x in [-1.0,1.0]");
		for(int i=0;i<3;i++) {
			int n1 = n[i];
			for(int j = 0;j<=n1;j++) {
				list.add(Math.cos((2*j+1)*Math.PI/2/(n1+1)));
			}
			System.out.println("when n = "+n1+":");
			lagerange(-0.95, list, 2);
			lagerange(-0.05, list, 2);
			lagerange(0.05, list, 2);
			lagerange(0.95, list, 2);
			list.clear();
		}
		System.out.println("question 4:");
		System.out.println("(1):fx = ¡Ìx ,x in {1,4,9}");
		list.add(1.0);
		list.add(4.0);
		list.add(9.0);
		lagerange(5.0, list, 3);
		lagerange(50.0, list, 3);
		lagerange(115.0, list, 3);
		lagerange(185.0, list, 3);
		list.clear();
		System.out.println("(2):fx = ¡Ìx ,x in {36,49,64}");
		list.add(36.0);
		list.add(49.0);
		list.add(64.0);
		lagerange(5.0, list, 3);
		lagerange(50.0, list, 3);
		lagerange(115.0, list, 3);
		lagerange(185.0, list, 3);
		list.clear();
		System.out.println("(3):fx = ¡Ìx ,x in {100,121,144}");
		list.add(100.0);
		list.add(121.0);
		list.add(144.0);
		lagerange(5.0, list, 3);
		lagerange(50.0, list, 3);
		lagerange(115.0, list, 3);
		lagerange(185.0, list, 3);
		list.clear();
		System.out.println("(4):fx = ¡Ìx ,x in {169,196,225}");
		list.add(169.0);
		list.add(196.0);
		list.add(225.0);
		lagerange(5.0, list, 3);
		lagerange(50.0, list, 3);
		lagerange(115.0, list, 3);
		lagerange(185.0, list, 3);
		list.clear();
	}
}
