import java.util.Scanner;

public class Students {
        String name;
        int id;
        String address;

        public Students(String name, int id, String address){
            this.name = name;
            this.id = id;
            this.address=address;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setId(int id){
            this.id = id;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
        public String getAddress(){
            return address;
        }
        public void inputData(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Your name:");
            name =  scanner.nextLine();
            System.out.println("Enter Your id:");
            id =  scanner.nextInt();
            System.out.println("Enter Your address:");
            address = scanner.nextLine();
            scanner.close();
        }
        public void showData(){
            System.out.println("Name:" + this.getName() + "\n" + "id: " + this.getId() + "\n" + "Address: " + this.getAddress());
        }
        public static void main(String[] args){
            Students stu = new Students("Vichea", 1, "Phnom Penh");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            scanner.close();                

            for (int i=0; i<n ; i++)
                stu.inputData();

            stu.showData();
            
        }
 
}
