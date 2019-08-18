import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    static ArrayList<Employee> list=new ArrayList<>();
    static int person,sizeList,location;
   // static Employee empArray[];





    // main method

    public static void main(String[] args) {

        System.out.println("How Many Employees ?");
        sizeList =scanner.nextInt();
        //empArray=new Employee[sizeList];






         mainMenu();

    }



        // Main menu
    private static void mainMenu() {
        char ch;

        do{
            System.out.println("----------------------------");
            System.out.println("         Main Menu          ");
            System.out.println(" 1 -------> Add Employee    ");
            System.out.println(" 2 -------> Display Employee");
            System.out.println(" 3 -------> Delete Employee ");
            System.out.println(" 4 -------> Update Employee ");
            System.out.println(" 5 -------> Exit    ");
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("      Enter your Choice     ");

            switch (scanner.nextInt()){
                case 1:getEmp(); break;
                case 2: display();
                break;
                case 3: delete();
                    break;
                case 4:updateEmp();
                    break;
                case 5:systemExit();
                break;
                default:
                    System.out.println("-------------\n");
                    System.out.println(" Invalid Key\n");
                    System.out.println("--------------");
            }   // end of switch

            System.out.println("Again Main Menu y/n ?");
            ch=scanner.next().charAt(0);
            if (ch=='n'){
                System.out.println("------------\n");
                System.out.println("  GOOD BYE\n");
                System.out.println("------------");
                systemExit();
            }
            else {}

        }while (ch=='y' || ch=='Y');

    }

    private static void delete() {

        if(list.isEmpty())
        display();

        else {


            System.out.println("------------------------");
            System.out.println("   Select a Employee   ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getEmpID() + " for " + list.get(i).getEmpName());
            }
            System.out.println("0 for Main Menu         ");
            System.out.println("------------------------");
            location = scanner.nextInt();


            if (location == 0)
                mainMenu();
    else {
            for (var i = (location - 1); i < list.size(); i++) {
                list.remove(location - 1);
                break;
            }
            System.out.println("The Size of arry " + list.size());
        }

        }


    }

    //  Update Details
    private static void updateEmp() {

        if (list.isEmpty()) {
            display();
        }
        else {

            char select;
            System.out.println("------------------------");
            System.out.println("   Select a Employee   ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getEmpID() + " for " + list.get(i).getEmpName());
            }
            System.out.println("0 for Main Menu         ");
            System.out.println("------------------------");
            person = scanner.nextInt();

            if (person == 0)
                mainMenu();

            else if (person > 0 && person <= list.size()) {
                do {
                    System.out.println("-------------------------");
                    System.out.println(list.get(person - 1).getEmpName() + "'s Profile Update");
                    System.out.println(" 1  Update ID ");
                    System.out.println(" 2  Update Name");
                    System.out.println(" 3  Update Age ");
                    System.out.println(" 4  Update Gender ");
                    System.out.println(" 5  Update Post ");
                    System.out.println(" 6  Exit ");
                    System.out.println("Select any Choice ----->");

                    switch (scanner.nextInt()) {
                        case 1:
                            updateId();
                            break;
                        case 2:
                            updateName();
                            break;
                        case 3:
                            updateAge();
                            break;
                        case 4:
                            updateGender();
                            break;
                        case 5:
                            updatePost();
                            break;
                        case 6:

                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    System.out.println("Do you want to update anything about " + list.get(person - 1).getEmpName() + " ?");
                    select = scanner.next().charAt(0);
                    if (select == 'n') {
                        System.out.println("------------------------------");
                        System.out.println("|||| Exiting From Profile ||||");
                        System.out.println("------------------------------");
                        break;
                    }

                } while (select == 'y' || select == 'Y');

            }
        }
    }

    private static void updateId(){
        System.out.println("Enter id to update ");
        list.get(person-1).setEmpID(scanner.nextInt());
    }

    private static void updateName(){
        System.out.println("Enter name to update");
        list.get(person-1).setEmpName(scanner.next().toUpperCase());
    }
    private static void updateAge(){
        System.out.println("Enter Age to update");
        list.get(person-1).setEmpAge(scanner.nextInt());
    }

    private static void updateGender(){
        System.out.println("Enter Gender (M/F/O) to update");
        list.get(person-1).setEmpGender(Gender.valueOf(scanner.next().toUpperCase()));
    }
    private static void updatePost(){
        System.out.println("Enter Post to update");
        list.get(person-1).setEmpPost(scanner.next().toUpperCase());

    }









    //Display All details
    private static void display() {
        char ch;
        if (list.isEmpty())
        {
            System.out.println("Please Enter some Details First");
            System.out.println("---> Do you want to enter Details y/n ?");
            ch=scanner.next().charAt(0);
            if(ch=='n'){
                System.out.println("------------------------------");
                System.out.println("|||| Going To Main menu  ||||");
                System.out.println("------------------------------");
                mainMenu();
            }
            else {
                System.out.println("----------------------------------");
                System.out.println("|||| Adding Employee Details  ||||");
                System.out.println("----------------------------------");
                getEmp();
            }

        }

        else if (list.size() == sizeList) {
            System.out.println("\n The Size Is Full ");
            System.out.println(" Details Are ");



            for (var i = 0; i < list.size(); i++) {



                System.out.println("----------------------------");
                System.out.println(" Id "+  list.get(i).getEmpID());
                System.out.println(" Name "+ list.get(i).getEmpName());
                System.out.println(" Age " + list.get(i).getEmpAge());
                System.out.println(" Gender "+list.get(i).getEmpGender());
                System.out.println(" Post "+list.get(i).getEmpAge());
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        } else {
            System.out.println(" Details Are ");
            for (var i = 0; i < list.size(); i++) {
                System.out.println("-----------------------------");
                System.out.println(" Id "+ list.get(i).getEmpID());
                System.out.println(" Name "+ list.get(i).getEmpName());
                System.out.println(" Age " + list.get(i).getEmpAge());
                System.out.println(" Gender "+list.get(i).getEmpGender());
                System.out.println(" Post "+list.get(i).getEmpAge());
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            }


        }
    }


    //Getting Emp Details
    private static void getEmp() {

        int id;
        String name;
        int age;
        Gender gender;
        String post;




        if(list.size()==sizeList)
            display();

        else if(list.isEmpty()) {

                for(var i=0;i<sizeList;i++){
                    System.out.println("Enter "+(i+1)+" no Employee Details");
                    System.out.println("Enter Id");
                    id=scanner.nextInt();
                    System.out.println(" Enter Name ");
                    name=scanner.next().toUpperCase();
                    System.out.println("Enter Age");
                    age=scanner.nextInt();
                    System.out.println("Enter Gender");
                    gender=Gender.valueOf(scanner.next().toUpperCase());
                    System.out.println("Enter Post");
                    post=scanner.next().toUpperCase();
                    //empArray[i]=new Employee(id,name,age,gender,post);
                    list.add(i,new Employee(id,name,age,gender,post) );

                }

        }
        else {
            for(var i=(list.size()-1);i<(sizeList-1);i++){
                System.out.println("Enter "+(i+1)+" no Employee Details");
                System.out.println("Enter Id");
                id=scanner.nextInt();
                System.out.println(" Enter Name ");
                name=scanner.next().toUpperCase();
                System.out.println("Enter Age");
                age=scanner.nextInt();
                System.out.println("Enter Gender");
                gender=Gender.valueOf(scanner.next().toUpperCase());
                System.out.println("Enter Post");
                post=scanner.next().toUpperCase();
                //empArray[i]=new Employee(id,name,age,gender,post);
                list.add(i,new Employee(id,name,age,gender,post) );

            }


        }

    }

    // System status 0 exit

    private static void systemExit() {
        System.exit(0);
    }
}
