import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author qin
 * @Data 21:04
 * @Version 1.0
 */
public class BaiduURL{
    //资源获取
    public void infos() throws IOException {

        // 程序代码
        String name = "https://www.baidu.com/?tn=27082910_2_hao_pg";
        BufferedReader in =null;
        try {

            URL url =new URL(name);
            //通过IO流读取信息
            in  = new BufferedReader(new InputStreamReader(url.openStream()));
            String s;
            while((s = in.readLine())!=null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            in.close();
        }

    }
    public static void main(String[] args) throws IOException {
        new BaiduURL().infos();
    }
}
