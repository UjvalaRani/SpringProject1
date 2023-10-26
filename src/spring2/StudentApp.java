package spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("config.xml");
	    Student st = ctx.getBean("st",Student.class);
		System.out.println(st);
	}
}
