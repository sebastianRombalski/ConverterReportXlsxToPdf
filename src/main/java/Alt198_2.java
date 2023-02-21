import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

public class Alt198_2 implements Methods{
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

    public Alt198_2(ArrayList<String> list, String startPath, String finalPath, String path) {
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
            String model = checkHasModel(fileName);

            if (!(model == null)) {
                StringBuilder str = new StringBuilder(finalPath + model + "_Alt198_2.xlsx");
                String newName = str.toString();
                System.out.println(model);

                if (isModelOnList(list, model)) {
                    File file2 = new File(newName);
                    Files.copy(file.toPath(), file2.toPath());
                    list.add(model);
                }
            }
        }
    }

    String checkHasModel(String fileName){
        if(fileName.contains(")")){
          String[] model = fileName.split("\\)");
          String modelEnd = model[0] +  ")";
          return modelEnd;
        }
        else if(fileName.charAt(0) ==  'A'){
            char[] bytes = fileName.toCharArray();
            if(bytes[6]=='R'){
                String[] model = fileName.split("R");
                return model[0];
            }
            else if(bytes[5]=='P'){
                String[] model = fileName.split("P");
                return model[0];
            }
            else if(bytes[5]=='S'){
                String[] model = fileName.split("S");
                return model[0];
            }
            else {
                String model = fileName.substring(0, 5);
                return model;
            }
        }
        return null;
    }
}
