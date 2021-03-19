package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    //TODO VALIDATION TRIANGLE SIDES LENGTH
    public static void main(String[] args) {
        Set<Triangle> triangles=new TreeSet<>();
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            readTriangle(reader,triangles);
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(triangles);
    }
    public static void  readTriangle(BufferedReader reader, Set<Triangle> triangles) throws IOException {

        String triangleParams=reader.readLine();
        String[] triangleParamsArray=triangleParams.split(",");
        if(triangleParamsArray.length<4){
            System.err.println("It should be 4 parameters for triangle: name, side1, side2, side3.");
            readTriangle(reader,triangles);
        }

        String nameParam;
        nameParam=triangleParamsArray[0].toLowerCase();
        String triangleFinalName;
        String[] nameParts=nameParam.split(" ");
        for (int i = 0; i < nameParts.length; i++) {
            nameParts[i]=nameParts[i].trim();
        }

        triangleFinalName= String.join(" ",nameParts);
        triangleFinalName=triangleFinalName.substring(0,1).toUpperCase()+triangleFinalName.substring(1);
        double[] sides=new double[3];
        for (int i = 1; i < 4; i++) {
            triangleParamsArray[i]=triangleParamsArray[i].replaceAll("[\s\t]","");
            try{
                sides[i-1]=Double.parseDouble(triangleParamsArray[i]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        triangles.add(new Triangle(triangleFinalName,sides[0],sides[1],sides[2]));
        System.out.println("Would you like to continue?");
        String answer=reader.readLine();
        if(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("y") ){
            readTriangle(reader,triangles);
        }
        else {
            printTriangles(triangles);
        }
    }
    public static void printTriangles(Set<Triangle> triangles){
        System.out.println("============= Triangles list: ===============");
        for (Triangle t:triangles) {
            System.out.println(t);
        }
    }
}
