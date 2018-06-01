package com.basics;

                   
	public class savingsaccount {
		public static double annualIN;
		private double savingBal;


		      public savingsaccount(int a) {
		    	this.savingBal= a;
		      }

		public void  CalculateIN() {
			double intrest = (savingBal*(annualIN/100.0))/12;
			savingBal = savingBal+intrest;
		}

		public static void  modifyRate(double newvalue) {
			annualIN = newvalue;
		}
		 public void  showbal() {
			 System.out.println("Your balance : "+ savingBal);
			 
		 }



		public static void main(String[] args) {
			double annaulIN=2000.0;
			double savingBal=300;
			savingsaccount saver1=new savingsaccount(2000);
			savingsaccount saver2= new savingsaccount(3000);
			savingsaccount.modifyRate(4);
			saver1.showbal();
			saver2.showbal();
			saver1.CalculateIN();
			saver2.CalculateIN();
			saver1.showbal();
			saver2.showbal();
			savingsaccount.modifyRate(5);
			saver1.showbal();
			saver2.showbal();
			saver1.CalculateIN();
			saver2.CalculateIN();
			saver1.showbal();
			saver2.showbal();
		}
	}
