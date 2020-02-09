package encapsulationAbstraction;

public class Encapsilation {
	/*Encapsulation & abstraction:
		--------------
		-> Required for better designing the java classes.
		-> Guidelines & common sense for creating class.

		  
		Encapsulation:
		-----------------
		->Class is a building block for instance variables & methods
		-> We need to create one class per entity
		-> Class should contain related instance varibales + methods


		Case#1:

		Class Person:
		  id, name , age,aadhar
		  
		Class PersonDetails:
		  id,name,age,pan

		Req: Create a obj and set data for id,name,age.
		  
		solution:  delete any one of the two classes.
		 Class Person:
		    id,name,age,pan,aadhar



		Case#2:
		Maintain a vehicle showroom .
		capture vehicle & customer info.

		class Data{
		  vehicleId
		  vehicelName
		  vechicleBrand
		  custId
		  custName
		  custMobile
		}


		If the vechicle comes to showroom then create obj for  Data and set values for   vehicleId  +  vehicelName  + vechicleBrand
		If the customer comes to showroom then create obj for  Data and set values for     custId  + custName + custMobile

		Problmes:
		1.This class has unrelated instance variables.
		2. Memory wastage
		3. future enhancement
		4.Ends up creating one more class
		  
		  
		solutions:
		  create seperate class for vechicle info
		  and create seperate class for customer info

		class Vehicle:
		  vehicleId
		  vehicelName
		  vechicleBrand

		class Customer:
		  custId
		  custName
		  custMobile  
		  
		  
		  
		Case#3:
		class Person:
		  id, name , age
		  
		  void sum(x,y){
		    print("sum = " , (x+y))
		   }
		    

		req: call sum funtion
		Person p = Person()
		p.sum(10,20)

		  

		Problem:
		1.Class has unrelated method
		2.Memory waste
		  

		solution:
		-> remove sum() futn from Person class
		 class Cal{
		      	void sum(x,y):
		          print(x+y)
		 }
		 
		 Abstraction:
-> Hide unnecessary data and expose only what ever is required.
->for every action/task there should be only funtion.
  
Ex:
  Class Vehicle:
    wheel,
    engine
    fuel.
    
		void brake(){}
      
    void acclerate{}
      
		void showFuelReading(){}
  

Req#1:To stop vehicle 
solution) call the brake()


brake() -> changing the values for the instance variable wheel + engine


Req#2:speedup vehicle
solution) call accelarate() function.
  

acclearate() - >changing the values for the instance variable wheel + engine using fuel..


Req#3:see the fuel reading:
solution) call the showFuelReading() function..



with abstraction we are changing the instance variables by calling the function

conclution:
--------------
-> Hide the instance variables and expose the methods.
-> change the instance variables/read the instance variables using the functions.
-> one action == one function

technical changes in class:
  1. make instance variables as private
  2. for every instance variable provide setter and getter



*/

		          
		  
		    




}
