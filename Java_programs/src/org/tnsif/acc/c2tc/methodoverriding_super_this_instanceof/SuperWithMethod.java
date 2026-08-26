package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

import org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof.GPay;
import org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof.Payment1;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment via google pay");
	}
	void completeTransaction()
	{
		super.process();
		process();
	}
}
public class SuperWithMethod {

	public static void main(String[] args) {
		GPay obj=new GPay();
		obj.completeTransaction();

	}

}

