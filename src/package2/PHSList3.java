package package2;

public class PHSList3 {
    private static PHSListNode head;
    private static int numNodes;
    public static int currentObj;


    public PHSList3(Object obj) {
        head = new PHSListNode(obj);
        numNodes++;
    }


    public void addToEnd(Object value) {
        PHSListNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = new PHSListNode(value);
        numNodes++;
    }


    public static Object findValue(int index) {
        PHSListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }


    public int firstElement() {
        return 1;
    }


    public boolean hasMoreElements(Object obj) {
        PHSListNode temp = head;
        temp = temp.next;
        if(temp != null){
            return true;
        }
        else{
            return false;
        }
    }


    public void nextElement() throws Exception {
        if(hasMoreElements(this)){
            head = head.next;
        }
        else{
            throw new NoNextElementException("Exception thrown: out of bounds");
        }
    }

    public static void Print() {
        String result = "[ ";

        PHSListNode temp = head;
        while(temp != null)
        {
            result += temp.value;
            result += " ";
            temp = temp.next;
        }

        result += "]";
        System.out.println(result);
    }

/*
    public static void main(String[] args) {
        PHSList3 myList = new PHSList3("Toyota");
        myList.addToEnd("Honda");
        myList.addToEnd("Subaru");

        PHSList3.Print();

        System.out.println("There are " + numNodes + " items in the list");

        System.out.println("The first element in the list is [" + findValue(currentObj) + "]");

        while(myList.hasMoreElements(myList)) {
            myList.nextElement(myList);

            System.out.println("The next element in the list is [" + findValue(currentObj) + "]");
        }
    }
*/
}


class PHSListNode {

    PHSListNode next;
    Object value;

    public PHSListNode(Object val) {
        value = val;
    }

    public Object getValue() {return value;}
    public PHSListNode getNext() {return next;}
    public void setValue(Object newVal) {value = newVal;}
    public void setNext(PHSListNode newNext) {next = newNext;}
}


@SuppressWarnings("serial")
class NoNextElementException extends Exception {

    public NoNextElementException() {}

    public NoNextElementException(String message) {
        super(message);
    }
}