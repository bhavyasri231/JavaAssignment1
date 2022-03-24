package JavaAssignment1;
import java.util.Scanner;
import java.io.File;

class Directory
{
    public void findFile()
    {
        File file = new File("/home/bhavyasri.penta");
        String name ;
        Scanner scan = new Scanner(System.in);

        do{
            int flag =0;
            System.out.println("Enter the name of the folder or file");

            name =scan.nextLine();
            String[] files = file.list();

            for (String string : files){
                if (name.equals(string)){
                    flag = 1;
                    System.out.println(name + " file was found");
                    System.out.println("Path : "+ file.getAbsolutePath());
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println("File not found : Reenter the name of the file.");
            }
        } while(true);
    }
}

public class JavaAssignment1 {
    public static void main(String[] args) {

        Directory directory = new Directory();
        directory.findFile();
    }

}
