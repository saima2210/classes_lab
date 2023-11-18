
public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        //1. Create a new rectangle object
        Rectangle rectangle = new Rectangle(5, 10); // ✅
        Rectangle rectangle2 = new Rectangle(7, 15);

        //2. Calculate the rectangle's area and store it in a variable
        int area = rectangle.calculateArea();
        int area2 = rectangle2.calculateArea();
        System.out.println("The rectangle has an area of " + area);
        System.out.println("The rectangle2 has an area of " + area2);

        // 3. Check if your rectangle is actually a square
        Rectangle square = new Rectangle (5,5);
        boolean isRectangle = square.checkSquare();
        System.out.println("Object is a square (true/false): " + isRectangle);
    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object

        Computer computer = new Computer(500);

        // 2. Use a getter to find out how much storage the computer has
        int currentStorage = computer.getStorage();
        System.out.println("Computer has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
        // We use the getter again to check that the amount of storage has been updated
         computer.addStorage(200);
        int newStorage = computer.getStorage();
        System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
         computer.setPrinter("inkjet");
        // Write a getter and use it below to check that the setter worked
        String currentPrinter = computer.getPrinter();
        System.out.println("Computer currently has a " + currentPrinter + " printer connected.");

        // 5. Write a method to print a message.
        // To test this works *without* a printer too you can comment out the code for question 4
        computer.printMessage("Hello World!");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
        ShoppingTrolley trolley = new ShoppingTrolley();

        // 2. Add an item to the trolley
        trolley.addItems("persimmon");

        // 3. Count items in the trolley
        int itemCount = trolley.countItems();
        System.out.println("The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
        boolean itemInTrolley = trolley.isItemInTrolley("milk");
        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}
