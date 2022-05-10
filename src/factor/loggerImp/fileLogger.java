package factor.loggerImp;

import factor.logger;

public class fileLogger implements logger {

    public fileLogger(){
        System.out.println("fileLogger Instance is created");
    }

    @Override
    public void writeLog() {
        System.out.println("fileLogger is printed");
    }
}
