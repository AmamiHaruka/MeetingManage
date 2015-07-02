import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atm.dao.PersonDao;
import com.atm.service.PersonService;
import com.atm.vo.Person;


public class test {
	public static void main(String[] args){
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		PersonDao dao = (PersonDao) ctx.getBean("personDao");
		PersonService ps = new PersonService();
		List<Person> list = new ArrayList<Person>();
		Person p = new Person(7, "dps11", 21, "1994.11.28",
				"beijing", 110, "bjut", "123456",
				"ttt", 70000, "department", "male");
		//ps.addPerson(p);
//		list = ps.search("d", "d", "");
//		for(Person p1:list){
//			
//			System.out.println(p1.getName());
//		}
		ps.deletePerson(1);
		//System.out.println(ps.getPerson(1).getName());
	}
}
