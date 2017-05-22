package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	//TODO - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test
	public void test(){
	ArrayList<RateDomainModel> lst = RateDAL.getAllRates();
	assertEquals(lst.get(0).getdInterestRate(),5.5,.001);
	assertEquals(lst.get(1).getdInterestRate(),5.75,.001);
	assertEquals(lst.get(2).getdInterestRate(),6,.001);
	assertEquals(lst.get(3).getdInterestRate(),6.5,.001);
	assertEquals(lst.get(4).getdInterestRate(),7,.001);
	}
	
	@Test
	public void test2(){
		RateDomainModel R = new RateDomainModel();
		R.setiMinCreditScore(725);
		ArrayList<RateDomainModel> lst = RateDAL.getAllRates();
		for (RateDomainModel r:lst){
			if (R.getiMinCreditScore()>r.getiMinCreditScore()){
				R.setdInterestRate(r.getdInterestRate());
				break;
			}
			else{}
		}
		assertEquals(R.getdInterestRate(),6.0,.001);
	}
	
	// Tested, exception gets thrown and printed
	@Test
	public void test3(){
		RateDomainModel R = new RateDomainModel();
		R.setiMinCreditScore(10);
		ArrayList<RateDomainModel> lst = RateDAL.getAllRates();
		try{
		for (RateDomainModel r:lst){
			if (R.getiMinCreditScore()>r.getiMinCreditScore()){
				R.setdInterestRate(r.getdInterestRate());
				break;
			}
			else{throw new Exception();}
		}
		}
		catch(Exception e){
			System.out.println("There is no rate for the given credit score");
		}
	}
}
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score



