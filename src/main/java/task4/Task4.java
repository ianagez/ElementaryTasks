package task4;

import common.Task;
import common.Messenger;

public class Task4 extends Task {

    public Task4(Messenger messenger,String[] args) {
        super(messenger,args);
    }
    @Override
    public void run() {
        if(this.args.length==2){
            String filename=this.args[0];
            String target=this.args[1];
            FileContent fileContent=new FileContent(filename);
            fileContent.countStringEntrance(target);

        }else if(this.args.length==3){
            String filename=this.args[0];
            String oldString=this.args[1];
            String newString=this.args[2];
            FileContent fileContent=new FileContent(filename);
            fileContent.changeStringTo(oldString,newString);

        }else messenger.sendMessage(StringConsts.WRONG_ARGS_LENGTH);
    }
}
