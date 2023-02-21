import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

public class St116_2 implements Methods{

    private ArrayList<String> list;
    private String startPath;
    private String finalPath;
    private String path;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getStartPath() {
        return startPath;
    }

    public void setStartPath(String startPath) {
        this.startPath = startPath;
    }

    public String getFinalPath() {
        return finalPath;
    }

    public void setFinalPath(String finalPath) {
        this.finalPath = finalPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public St116_2(ArrayList<String> list, String startPath, String finalPath, String path) {
        this.list = list;
        this.startPath = startPath;
        this.finalPath = finalPath;
        this.path = path;
    }

    @Override
    public void copyFile() throws Exception {
        File folder = new File(startPath);
        for (File file : folder.listFiles()) {
            String fileName = file.getName();
            String[] model = fileName.split("_");
           // System.out.println(model[1]);
            String[] endModel = model[1].split(".xls");
          //  System.out.println(endModel[0]);
            if (endModel[0].length() < 20) {
                StringBuilder str = new StringBuilder(finalPath + endModel[0] + "_St116_1.xlsx");
                String newName = str.toString();
                System.out.println(endModel[0]);

                if (isModelOnList(list, endModel[0])) {
                    File file2 = new File(newName);
                    Files.copy(file.toPath(), file2.toPath());
                    list.add(endModel[0]);
                }
            }
        }
    }
}
