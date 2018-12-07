import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException, InterruptedException {
        String sample[] = {
                "0001,20171202081202,20171202081203,true,23.1234532,35.3321232,91.23,east,200,20321",
                "0001,20171202081203,20171202081204,true,23.1234535,35.3321231,95.43,east,201,20321",
                "0001,20171202081205,20171202081206,true,23.1234537,35.3321236,102.01,east,200,20321",
                "0002,20171202081206,20171202081207,true,23.1234533,35.3321231,105.04,north,232,12342"
        };

        File f = new File("/Users/admin/h/dis-agent-1.0.4/data/test.log");
        for (int i = 0; i < 300; ++i) {
            String line = sample[i % sample.length] + "\n";
            System.out.println(line);
            Files.append(line, f, Charsets.UTF_8);
            Thread.sleep(1);
        }
    }
}