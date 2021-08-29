
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class FamilyMembers {
private String Name;
private int age;
private String role;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
/**
 * 
 */
public FamilyMembers() {
	super();
}
/**
 * @param name
 * @param age
 * @param role
 */
public FamilyMembers(String name, int age, String role) {
	super();
	Name = name;
	this.age = age;
	this.role = role;
}
@Override
public String toString() {
	return "FamilyMembers [Name=" + Name + ", age=" + age + ", role=" + role + "]";
}


}
