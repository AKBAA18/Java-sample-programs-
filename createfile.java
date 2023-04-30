import java.io.File;
import java.io.IOException;
class createfile{
public static void main(String ar[]){
try{
File obj=new File("filecreabyjava.txt");
if(obj.createNewFile()){System.out.println("FILE NAME : " + obj.getName());}
else{System.out.println("File already exists");}}
catch(IOExeception e)
{
System.out.println("AN error occured in java ");
e.printStackTrace();
}
}
}

