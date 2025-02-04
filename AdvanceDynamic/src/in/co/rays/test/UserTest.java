package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class UserTest {

	public static void main(String[] args) throws Exception {
		testSearch();

	}

	private static void testSearch() throws Exception {
		UserBean bean=new UserBean();
		bean.setFirstName("r");
		UserModel model=new UserModel();
		List list=model.search(bean, 1, 5);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			bean=(UserBean) it.next();
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
		}
		
	}

}
