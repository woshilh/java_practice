import java.io.*;
public class FileDemo{
	public static void main(String[] args){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("test.dat"));
			out.write("这是一个文件写例子");
			out.close();
			System.out.println("文件success");
		}catch (IOException e){

		}
	}
}
