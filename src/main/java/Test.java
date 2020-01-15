import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orilore.model.Dept;
import com.orilore.service.IDeptService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		IDeptService biz = app.getBean(IDeptService.class);
//		Dept dept = biz.get(2);
//		System.out.println(dept.getName());
		Dept d1 = new Dept("AAAA");
		Dept d2 = new Dept("BAAA");
		Dept d3 = new Dept("CAAAAAAAAA");
		Dept d4 = new Dept("DAAA");
		Dept[] ds = new Dept[] {d1,d2,d3,d4};
		biz.saves(ds);
	}
}
