package CombinedAssignment_1;
/*4. Create a class Product and add appropriate instance variables with different datatypes and try printing them. Note: See declaration for System.out.println method for various datatypes*/
import java.util.Scanner;

public class P4_Product {
        int ProductId;
        String ProductName;
        double ProductPrice;
        float ProductVersion;

        public  P4_Product(int ProductId,String ProductName,double ProductPrice,float ProductVersion){
                this.ProductName=ProductName;
                this.ProductPrice=ProductPrice;
                this.ProductId=ProductId;
                this.ProductVersion=ProductVersion;
        }
        public void printelements(){
                System.out.println(ProductId);
                System.out.println(ProductName);
                System.out.println(ProductPrice);
                System.out.println(ProductVersion);
        }

        public static void main(String []args){
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the Product Id:");
                int id=scan.nextInt();
               System.out.println("Enter the Product name:");
                String name=scan.next();
               System.out.println("Enter the Product Price:");
                int price=scan.nextInt();
                System.out.println("Enter the Product Version:");
                float version=scan.nextFloat();
                P4_Product s=new P4_Product(id, name, price, version);
                s.printelements();

        }

}
