package package2;

public class PHSTest {

    public PHSTest() {}

    public static void main(String[] args) {
        PHSList3 myList = new PHSList3("head");
        myList.addToEnd("Blue");
        myList.addToEnd("Orange");
        myList.addToEnd("Purple");
        myList.addToEnd("Green");
        myList.addToEnd("Yellow");

        System.out.println("The first element in the list is [" + myList.findValue(myList.firstElement()) + "]");

        int currentObjIndex = 0;
        while(myList.hasMoreElements(myList)){
            try {
                myList.nextElement();
            }
            catch(Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
            currentObjIndex++;
        }

        System.out.println("The list has " + currentObjIndex + " values");
        System.out.println("Trying to access a value out of bounds...");
        try{
            myList.nextElement();
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}