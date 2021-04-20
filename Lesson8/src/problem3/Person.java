package problem3;

import java.util.Arrays;

class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	private final int INITIAL_LENGTH = 4;
	private Person[] personArray; 
	private int size;

	public Person() { 
		personArray=new Person[INITIAL_LENGTH];
		size=0;
	}
	
	public Person(String lname,String fname,int age) {
		this.firstName=fname;
		this.lastName=lname;
		this.age=age;
	}

	// Add element in last
		public void add(Person p){
			if(p==null) return;
			if(size == personArray.length) resize();
			personArray[size++] = p;
		}
		
		public Person get(int i){
			if(i < 0 || i >= size){
				return null;
			}
			return personArray[i];
		}
		
		public boolean find(String lname){
			if(personArray==null) 
				return false;
			for(int i=0;i<personArray.length;i++){
				if(personArray[i].lastName.equals(lname)) return true;
			}
			return false; 
		}
		
		
		public void insert(Person p1, int pos){
			if(pos > size || pos<0 ) return;
			if(pos == personArray.length||size+1 > personArray.length) {
				resize();
			}
			Person[] temp = new Person[personArray.length+1];
			System.arraycopy(personArray,0,temp,0,pos); // src, spos,des,dspos,number of elements
			temp[pos] = p1;
			
			System.arraycopy(personArray,pos,temp,pos+1, personArray.length - pos);
			personArray = temp;
			++size;
		}
		
		public boolean remove(Person p2){
			if(size == 0) return false; // list is empty
			if(p2==null) return false;
			int index = -1;
			for(int i = 0; i < size; ++i ){
				if(personArray[i].equals(p2)){
					index = i;
					break;
				}
			}
			if(index==-1) return false; // s is not found in the list
			Person[] temp = new Person[personArray.length];
			System.arraycopy(personArray,0,temp,0,index);
			System.arraycopy(personArray,index+1,temp,index,personArray.length-(index+1));
			personArray = temp;
			--size;
			return true;
		}

	@Override   
    public String toString(){
        String coll="";
        for(int i = 0; i < size; ++i){
            coll+="["+personArray[i].firstName+","+personArray[i].lastName+","+personArray[i].age+"]";
        }
       
        return coll;
    }
		
		public int size() {
			return size;
		}
		public boolean isEmpty(){
			return(size==0);
		}
		
		public Object clone()
	    {
	    	Person[] temp = Arrays.copyOf(personArray, size);
	    	return temp;
	    	
	    }
		
		private void resize(){
			System.out.println("resizing");
			int len =personArray.length;
			int newlen = 2*len;
			Person[] temp = new Person[newlen];
			System.arraycopy(personArray,0,temp,0,len);
			personArray = temp;
		}

	
	public String getLast() // get last name
	{
		return lastName;
	}
	

	
} // end class Pers