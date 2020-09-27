package modifiers;

public class MainForTheModifiers {
	
	public static void main (String []args) {

	// Private Modifier 
	/* I was not able to access the private Modifier outside the class and in the same package.
	 * 
	 * PrivateModifier pmode = new PrivateModifier();

	System.out.println( pmode.num1);

	pmode.PrivateMod (); */

	// Protected Modifier.
	// I was able to access the protected modifier outside the class, in the same package.

		ProtectedModifier p = new ProtectedModifier();

	System.out.println( p.number);
	p.Protected();


	// Default Modifier 
	// I was able to access the default modifier outside the class, in the same package.

	modifiers d = new modifiers();

	System.out.println(d.nim + " " + d.name);
	d.Default();




	// Public Modifier 

	// I was able to access the public modifier outside the class, in the same package.

	PublicModifier pm = new PublicModifier();

	System.out.println(pm.letter + pm.name);
	pm.Public();

	}

}
