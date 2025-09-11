public class LogicalAndExample{
    public static void main(String[] args){
        int age=25;
        boolean hasLicense=true;
        if(age>18 && hasLicense){
            System.out.println("eligible to drive");
        }else{
            System.out.println("not eligible to drive");
        }
    }
}
