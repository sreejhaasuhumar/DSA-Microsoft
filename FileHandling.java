package Microsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileHandling {

	private static final long LIMIT = (long)(14 * Math.pow(2, 20));

    public static void main(String[] args) {
        FileHandling mc = new FileHandling();
        String file = "admin -wx 29 Sep 1983        833 source.h\nadmin r-x 23 Jun 2003     854016 blockbuster.mpeg\nadmin --x 02 Jul 1997        821 delete-this.py\n"
            + "admin -w- 15 Feb 1971      23522 library.dll\nadmin --x 15 May 1979  645922816 logs.zip\njane  --x 04 Dec 2010      93184 old-photos.rar\njane  -w- 08 Feb 1982  681574400 important.java\n"
            + "admin rwx 26 Dec 1952   14680064 to-do-list.txt\n";

       String res = mc.microsoftFileAdmin(file);

        if(res.length() == 0) {
            System.out.println("No Files!");
        } else {
            System.out.println(res);
        }
    }

    public String microsoftFileAdmin(String files) {
        if(files == null || files.length() == 0 ) {
            return "";
        }

        String[]fileGroup = files.split("\n");
        if(fileGroup.length < 1 || fileGroup.length > 100) {
            return "";
        }

        List<String> result = new ArrayList<>();

        for(String file : fileGroup) {
            file = file.replaceAll("\\s{2,}", " ");
            String[] curFile = file.split(" ");
            if(valid(curFile)) {
                StringBuilder sb = new StringBuilder();
                for(int j = 2; j <= 4; j++) {
                    sb.append(curFile[j]);
                    sb.append(" ");
                }
                result.add(sb.toString().trim());
            }
        }

        if(result.size() > 1) {
            Collections.sort(result, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.parseInt(o1.split(" ")[2]) - Integer.parseInt(o2.split(" ")[2]);
                }
            });
        }
        return result.get(0);
    }

    private boolean valid(String[] curFile) {
        return curFile[0].equals("admin") && curFile[1].contains("x") && Long.parseLong(curFile[5]) < LIMIT;
    }

}
