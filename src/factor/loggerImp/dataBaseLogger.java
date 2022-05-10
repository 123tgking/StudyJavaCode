package factor.loggerImp;

import factor.logger;

public class dataBaseLogger implements logger {

    public dataBaseLogger(){
        System.out.println("dataBaseLogger is created");
    }

    @Override
    public void writeLog() {
        System.out.println("dataBase is printed");
    }
}
