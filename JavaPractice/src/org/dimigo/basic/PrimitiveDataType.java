/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author : persi
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("이름 : " + name);
		System.out.printf("성별 : ");
		if(isMale){
			System.out.println("남자");
		}
		else{
			System.out.println("여자");
		}
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}

}
