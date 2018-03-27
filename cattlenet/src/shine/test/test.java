package shine.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import sun.applet.Main;

public class test {

	public static void main(String[] args) {
		test t1 = new test();
		test t2 = new test();
		test t3 = new test();
		System.out.println(Main.theVersion+" ");
		SoftReference sr = new SoftReference(t1);
		if(sr.get()==null){
			System.out.println("1被清除了");
		}
		WeakReference wr = new WeakReference(t2);
		if(sr.get()==null){
			System.out.println("2被清除了");
		}
		PhantomReference pr = new PhantomReference(t3, null);
		if(sr.get()==null){
			System.out.println("3被清除了");
		}
		System.out.println("都没清楚");
	}
}
