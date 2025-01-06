import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String args[]){
        List<String> obj3 = new ArrayList<>();
        int selection = 0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("----------------------");
                System.out.println("1.Add Element");
                System.out.println("2.Delete Element");
                System.out.println("3.Print");
                System.out.println("4.Get the Element");
                System.out.println("5.Update the Element");
                System.out.println("6.Exit");
                System.out.println("----------------------");

                System.out.println("Enter the Number:");
                selection = Integer.parseInt(input.nextLine());
                if (selection >= 1 && selection <= 6) {
                    String Ele;
                    switch (selection) {
                        case 1:
                            System.out.println("Enter the value that you want to add in List :- ");
                            Ele = input.nextLine();
                            obj3.add(Ele);
                            System.out.println("Element is added successfully");
                            break;
                        case 2:
                            System.out.println("List :- ");
                            for (int i = 0; i < obj3.size(); i++) {
                                System.out.println(obj3.get(i));
                            }
                            System.out.println("Enter the Element that you want to delete");
                            Ele = input.nextLine();
                            try {
                                obj3.remove(obj3.get(Integer.parseInt(Ele)));
                                System.out.println("Item is removed Successfully");
                            } catch (Exception e) {
                                System.out.println("Due to some issue element is not deleted !!!");
                                System.out.println("Checkout Error :- " + e);
                            }
                            break;
                        case 3:
                            System.out.println("List :- ");
                            for (int i = 0; i < obj3.size(); i++) {
                                System.out.println(obj3.get(i));
                            }
                            break;
                        case 4:
                            System.out.println("Enter the index number which you want to access :- ");
                            Ele = input.nextLine();
                            try {
                                System.out.println(obj3.get(Integer.parseInt(Ele)));
                            }
                            catch(Exception e){
                                System.out.println("Dur to some issue Element "+Ele+" is not accessible");
                                System.out.println("Checkout Error :- "+e);
                            }
                            break;
                        case 5:
                            System.out.println("Enter the index number which you want to update :- ");
                            Ele = input.nextLine();
                            System.out.println("Current value is " + obj3.get(Integer.parseInt(Ele)));
                            System.out.println("Enter the value that you want to replace in place of it :- ");
                            String replace = input.nextLine();
                            try{
                                obj3.set(Integer.parseInt(Ele), replace);
                                System.out.println("Element is Updated Successfully");
                            }
                            catch(Exception e){
                                System.out.println("Dur to some issue Element "+Ele+" is not updated");
                                System.out.println("Checkout Error :- "+e);
                            }
                            break;
                        case 6:
                            System.out.println("Great interaction !!!");
                            System.out.println("xxxxxxxxxxxxxxxxxxxxx");
                            break;
                    }

                } else {
                    System.out.println("Enter a valid range number(1 to 6).");

                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input.Please enter a valid Number");
            }
        } while (selection != 6);
    }
}
