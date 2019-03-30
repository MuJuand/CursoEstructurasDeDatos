package LinearDS_Problems;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1211


import java.io.BufferedReader;
import java.io.InputStreamReader;

import LinearDataStructures.*;

public class EconomicPhonebook {
	public class PhoneNumbers  implements Node{
		public int  data;

		public PhoneNumbers next=null;
		public PhoneNumbers(int numeber) {
			this.data=numeber;
		}

		@Override
		public void setNext(Node node) {
			// TODO Auto-generated method stub
			this.next=(PhoneNumbers)node;
		}

		@Override
		public Node getNext() {
			// TODO Auto-generated method stub
			return next;
		}

		@Override
		public Node clone() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isEqual(Node node) {
			PhoneNumbers temp=(PhoneNumbers)node;
			return this.data==temp.data ? true : false;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}

	}
	 
}
