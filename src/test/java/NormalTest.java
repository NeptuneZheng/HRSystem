import junit.framework.JUnit4TestAdapter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;

/**
 * Created by Z.Neptune on 2017/9/11.
 */
public class NormalTest{
    @Test
    public  void fileBuilderTest(){
            File file = new File("/file1.txt");
            if(file.exists()){
                System.out.print("file exist");
            }else{
                try {
                    Assert.assertTrue(file.createNewFile());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("fileName:"+file.getName());
            System.out.println("filePath:"+file.getPath());
            System.out.println("fileModify:"+file.lastModified());
    }
}
