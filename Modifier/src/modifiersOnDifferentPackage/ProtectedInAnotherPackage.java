package modifiersOnDifferentPackage;

import modifiers.ProtectedModifier;

public class ProtectedInAnotherPackage extends ProtectedModifier{

	public static void main(String[] args) {


		// Protected modifier.

		// I was able to access the Protected modifier outside the class and in a different package through child class. 

		ProtectedInAnotherPackage a = new ProtectedInAnotherPackage();

		System.out.println(a.number );
		a.Protected();

		}
}
