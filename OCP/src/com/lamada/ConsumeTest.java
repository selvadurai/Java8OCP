package com.lamada;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

public class ConsumeTest {

  public static void main(String [] args){
    
	 Consumer<String> c2 =x->{System.out.println(x); int num=100; System.out.println(num);};	  
	 c2.accept("Chunsa Jung"); 

     Consumer<PersonModel> model =m->{for(int i=0;i<100;i++) System.out.println(m.getId()+i +" "+m.getName()) ; };
     PersonModel person =new PersonModel();
     model.accept(person);
  
  }
 
}
