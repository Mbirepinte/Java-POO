class Classroom {

public static void main(String[] args) {
Wilder wilder1 = new Wilder("Jean", true);
Wilder wilder2 = new Wilder("Paul", false);
Wilder wilder3 = new Wilder("Jacques", true);
Wilder wilder4 = new Wilder("Pierre", false);
System.out.println(wilder1.whoAmI());
System.out.println(wilder2.whoAmI());
System.out.println(wilder3.whoAmI());
System.out.println(wilder4.whoAmI());
}

};


