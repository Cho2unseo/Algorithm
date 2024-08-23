import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class File {
    String name;
    String file;
    boolean contain;

    File(String name, String file, boolean contain) {
        this.name = name;
        this.file = file;
        this.contain = contain;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = br.readLine();
        }
        Set<String> fileList = new HashSet<>();
        for (int i = 0; i < m; i++) {
            fileList.add(br.readLine());
        }
        File[] files = new File[n];
        for (int i = 0; i < n; i++) {
            String[] modstr = name[i].split("\\.");
            String filename = modstr[0];
            String extension = modstr[1];
            boolean isContained = fileList.contains(extension);
            files[i] = new File(filename, extension, isContained);
        }
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                if (f1.name.equals(f2.name)) {
                    if (f1.contain && f2.contain)
                        return f1.file.compareTo(f2.file);
                    else if (f1.contain) return -1;
                    else if (f2.contain) return 1;
                    return f1.file.compareTo(f2.file);
                }
                return f1.name.compareTo(f2.name);
            }
        });
        for (File file: files) System.out.println(file.name + "." + file.file);
    }
}
