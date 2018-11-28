package jdbcdelete;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneManager m=new PhoneManager();
		Phone_book b = new Phone_book();
		b.setId(9);
		int i =m.deletePhone(b);
		System.out.println("修改了"+i+"条数据");
		return ;

	}

}
