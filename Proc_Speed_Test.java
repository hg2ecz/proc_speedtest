import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Proc_Speed_Test {

	
	public void run_test(){
			int ctr=0, err=0;

			for(int i=0; i<10000; i++){
				Path dir = Paths.get("/proc");
				try (DirectoryStream<Path> stream =
						Files.newDirectoryStream(dir,"[0-9]*")){
							for(Path path : stream){
								String pathname = path.toString();
									try ( BufferedReader br = new BufferedReader( new FileReader(pathname+"/stat")) )
									{
											String line;
											line = br.readLine();
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
