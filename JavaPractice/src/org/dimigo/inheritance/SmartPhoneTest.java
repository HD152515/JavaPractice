/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : persi
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] sm = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
				
		};
		
		for(SmartPhone arr : sm){
			sm.toString();
//			System.out.println(arr);
			arr.turnOn();
			arr.pay();
			arr.useSpecialFuction(arr);
			arr.turnOff();
			}
	}

}
