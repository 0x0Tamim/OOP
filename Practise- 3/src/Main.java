public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("h = " + box.h + " l = " + box.l + " w = " + box.w);
        Box box1 = new Box(5);
        System.out.println("h = " + box1.h + " l = " + box1.l + " w = " + box1.w);

        BoxWeight box2 = new BoxWeight();
        System.out.println("h = " + box2.h + " l = " + box2.l + " w = " + box2.w + " weight = " + box2.weight);

        BoxWeight box3 = new BoxWeight(2, 4, 5, 6);
        System.out.println("h = " + box3.h + " l = " + box3.l + " w = " + box3.w + " weight = " + box3.weight);

        BoxWeight box4 = new BoxWeight(box1, 5);
        System.out.println("h = " + box4.h + " l = " + box4.l + " w = " + box4.w + " weight = " + box4.weight);

        // Box is the parent class
// BoxWeight is the child class: class BoxWeight extends Box

// ✅ VALID: Upcasting – assigning child object to parent reference
        Box box5 = new BoxWeight(3, 5, 6, 7);
        //Reference     object
// Allowed because BoxWeight *is-a* Box
// But: box5 can only access Box members (not BoxWeight-specific ones like weight)

// ❌ INVALID: Downcasting – assigning parent object to child reference (without cast)
        //BoxWeight box6 = new Box(3);
// Error: Box is NOT necessarily a BoxWeight
// Even though BoxWeight extends Box, the reverse is not true

// ✅ VALID with explicit casting (only if object is actually a BoxWeight)
        Box box7 = new BoxWeight(1, 2, 3, 4);   // Upcasting
        BoxWeight box8 = (BoxWeight) box7;     // Downcasting – safe here because object is BoxWeight

// ❌ Runtime error (ClassCastException) if object is NOT actually a BoxWeight
        Box box9 = new Box(3);
// BoxWeight box10 = (BoxWeight) box9; // Compiles, but crashes at runtime!

    }
}
//Child can access parent class bt parent cant access child class info