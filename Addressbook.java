import java.util.*;
import javax.swing.JOptionPane;

class Address 
{

	String First_name;
	String Last_name;
	String address;
	String phoneNum;
	String zip;
	String city;
	String state;
	String email;

	public Object name;

	public Address(String F_name, String L_name, String Addr, String MobileNum, String ZipCode, String City,
			String State, String Mail) {
		First_name = F_name;
		Last_name = L_name;
		address = Addr;
		phoneNum = MobileNum;
		zip = ZipCode;
		city = City;
		state = State;
		email = Mail;
	}

	public void display() 
	{
		System.out.println("\n First Name : " + First_name + "\n Last Name : " + Last_name + "\n Address : " + address
				+ "\n Emial : " + email + "\n Phone No : " + phoneNum + "\n Zip Code : " + zip + "\n City : " + city
				+ "\n State : " + state);
		System.out.println("  ");
	}
}

class Addressbook1 {

	ArrayList<Address> arr_list = new ArrayList<>();

	public void AddPreson() {

		String First_name = JOptionPane.showInputDialog("Enter the First name :");
		String Last_name = JOptionPane.showInputDialog("Enter the Last name :");
		String address = JOptionPane.showInputDialog("Enter the address :");
		String phoneNum = JOptionPane.showInputDialog("Enter the phone number :");
		String zip = JOptionPane.showInputDialog("Enter the zip code: ");
		String city = JOptionPane.showInputDialog("Enter the city name : ");
		String state = JOptionPane.showInputDialog("Enter the state name : ");
		String email = JOptionPane.showInputDialog("Enter the email : ");

		Address adress = new Address(First_name, Last_name, address, phoneNum, zip, city, state, email);

		arr_list.add(adress);
//			arr_list.toString();
		for (Address add : arr_list) {
			add.display();
		}
	}

	public void EditePeson(String name, String name1) {
		for (Address a : arr_list) {
			if (name.equals(a.First_name))
			{
				a.First_name = name1;
				a.display();
			}

		}
	}

	public void DeletePerson(String name) 
	{
		for (int i = 0; i < arr_list.size(); i++) 
		{
			Address p = arr_list.get(i);
			if (name.equals(p.First_name)) 
			{
				arr_list.remove(i);
				System.out.println("Person deleted");
				System.out.println(arr_list);
			} else
				System.out.println("Person name not found");
		}
	}
}

class AddressBook {

	public static void main(String[] args) {

		 Address s1 = new Address("Anusha", "n", "Rotary nagar",
		 "9652814314", "507303",
		 "khammam", "telangana", "xyz@gmail.com");

		 s1.display();

		Addressbook1 b = new Addressbook1();
		b.AddPreson();
		//b.AddPreson();
		b.EditePeson("Anusha", "anusha");
		b.DeletePerson("anusha");

	}
}
