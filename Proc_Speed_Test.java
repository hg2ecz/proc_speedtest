import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Proc_Speed_Test {

	public void run_test_0(){
		int ctr = 0, err = 0;
		File file = null;
		String[] paths;
		
		try {
			file=new File("/proc/");
			System.out.println("File object created");
			paths = file.list();
			for(String p:paths){
				System.out.println(p);
			}
		} catch(Exception x){
			System.out.println(x);
		}
		
		System.out.println("Hello, it's running");
	}
	
	public void run_test(){
			int ctr=0, err=0;
			String line;

			for(int i=0; i<10000; i++){
				Path dir = Paths.get("/proc");
				try (DirectoryStream<Path> stream =
						Files.newDirectoryStream(dir,"[0-9]*")){
							for(Path path : stream){
								String pathname = path.toString();
									try {
										BufferedReader br;
										br=new BufferedReader(
											new FileReader(pathname+"/stat")
										);
										while((line=br.readLine()) != null){
											// ----
										}
										br.close();
										ctr++;
									} catch(IOException e){
										err++;
									}
							}
				} catch(Exception e) {
					System.out.println("--Error--");
					System.out.println(e);
				}
			}
			System.out.format("Count: %d%n",ctr);
			System.out.format("Error: %d%n",err);
	}


	public static void main(String args[]){
		Proc_Speed_Test pst;
		pst=new Proc_Speed_Test();
		pst.run_test();
		
	}
}
