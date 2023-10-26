package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("config.xml");
		Javadeveloper jd = ctx.getBean("jd",Javadeveloper.class);
	    jd.work();
	    jd.doproject();
	    System.out.println("Id is:"+jd.id);
	    System.out.println("Name is:"+jd.name);
	}
}
