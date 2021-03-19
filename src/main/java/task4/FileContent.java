package task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContent {
    StringBuilder content;

    FileContent (String filePath){
        this.content=downloadTextToStringBuilder(filePath);
    }

    public StringBuilder downloadTextToStringBuilder(String filePath){
        StringBuilder builder= new StringBuilder();
        File file=new File("tale.txt");
        //File file=new File(filePath); TODO delete stub
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String s;
            while ((s=reader.readLine())!=null){
                builder.append(s);
            }
        }catch (IOException e){
            //TODO new Exception contenet not downloaded err
            e.printStackTrace();
        }
        return builder;
    }

    public StringBuilder getContent(){
        return  this.content;
    }

    public int countStringEntrance(String targetString){
        int stringCount=0;
        int index=this.content.indexOf(targetString);
        while(index!=-1){
            stringCount++;
            index=this.content.indexOf(targetString,index+targetString.length());
        }
        System.out.println(stringCount);
        return stringCount;
    }

    public  void changeStringTo(String oldString, String newString){
        int index = this.content.indexOf(oldString);
        while (index != -1) {
            this.content.replace(index, index + oldString.length(), newString);
            index += newString.length(); // Move to the end of the replacement
            index = this.content.indexOf(oldString, index);
        }
    }
}
