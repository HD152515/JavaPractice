/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_PersoTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : persi
 * @version : 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		Person e = new Person("Tom");
		System.out.println(e);
		Korean k = new Korean("홍길동");
		System.out.println(k);
		Japanese j = new Japanese("다나카");
		System.out.println(j);
		Chinese c = new Chinese("왕밍");
		System.out.println(c);
		System.out.println();
		
		e.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		
		e.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye(); 
		
	}

}
