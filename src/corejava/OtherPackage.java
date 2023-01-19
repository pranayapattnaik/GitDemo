package corejava;

import corejava1.SamePackageUsage2;// User Defined Packages

public class OtherPackage extends SamePackageUsage2 {

	public static void main(String[] args) {
	//	SamePackageUsage2 sp = new SamePackageUsage2();
	//	sp.abc();
	//	sp.i=5;

		OtherPackage op = new OtherPackage();
		op.abc();
		op.i=5;
		
	}

}
