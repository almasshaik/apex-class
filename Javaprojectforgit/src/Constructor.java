public class Constructor {
	String name;
	int id;
	
	Constructor (String name,int id){
		this.name=name;
		this.id=id;
	}
}
class Implement { 
    public static void main (String[] args) { 
        Constructor obj = new Constructor("almas", 1); 
        System.out.println("Constructor Name :" + obj.name + 
                           " and Constructor Id :" + obj.id); 
    } 
} 
