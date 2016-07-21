package studentmanagement;

public class Student {
	public int id ;
	public String name;
	public String city;
	
	public void getid()
	{
		System.out.println(id);
	}

	public void getname()
	{
		System.out.println(name);
	}
   public void getcity()
   {
	   System.out.println(city);
   }

   
   
   public void setid(int id)
	
   {
	  this.id=id;
   }	
	
	public void setname(String name)
	{
		this.name=name;
	}
  public void setcity(String city)
  {
	   this.city=city;
  }
}
