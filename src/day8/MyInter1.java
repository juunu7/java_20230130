package day8;

import day7.MyListener;

public class MyInter1 implements MyListener {

	@Override
	public void work() {
		System.out.println("myinter1 => work");
	}

	@Override
	public void study() {
		System.out.println("myinter1 => study");
	}

}
