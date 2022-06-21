import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter numbers of slots have to added");
        n = sc.nextInt();

        Person person = new Person();

        int time[] = person.addBookedSlots(n);

        int queries;
        System.out.println("No. of slots to be searched for : ");
        queries = sc.nextInt();

        Calender calender = new Calender();

        for (int i = 0; i < queries; i++)
        {
            int start, end;
            System.out.println("enter start time :");
            start = sc.nextInt();
            System.out.println("enter end time :");
            end = sc.nextInt();

            boolean isAvailable = calender.isSlotAvailable(time,start,end);

            if (isAvailable)
                System.out.println("Slot Available");
            else
                System.out.println("Slot Not Available");
        }
    }
}
