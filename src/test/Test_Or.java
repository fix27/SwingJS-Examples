package test;

class Test_Or extends Test_ {

	public static void main(String[] args) {
		
		int count = 0;
		
		boolean ok = true;

		ok |= (count++ == 0);
		ok |= (count++ == 0);
		
		System.out.println(count);
		assert (count == 2);
		
		ok = false;
		
		ok &= (count++ == 0);
		ok &= (count++ == 0);
		
		System.out.println(count);
		assert (count == 4);

		ok = true; 
		ok = ok | (count++ == 0);
		ok = ok | (count++ == 0);
		
		System.out.println(count);
		assert (count == 6);
		
		ok = false;
		
		ok =  ok & (count++ == 0);
		ok =  ok & (count++ == 0);
		
		System.out.println(count);
		assert (count == 8);

		ok = false;
		
		ok =  ok && (count++ == 0);
		ok =  ok && (count++ == 0);
		
		System.out.println(count);
		assert (count == 8);

	}

}