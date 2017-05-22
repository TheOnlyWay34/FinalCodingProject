package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	@Test
	public void test() throws RateException{
		assertEquals(RateBLL.getRate(725),6.0,.001);
	}
	
	
	// Ran test and it does throw a RateException
	@Test
	public void test2() throws RateException{
		double h=RateBLL.getRate(10);
	}
	
	// Testing getPayment with values given in assignment
	@Test
	public void test3(){
		double i=RateBLL.getPayment(.04/12, 360, 300000, 0, false);
		assertEquals(i,-1432.25,.01);
	}
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

}
