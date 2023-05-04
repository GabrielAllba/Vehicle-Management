package exception;

public class IdErrorException extends Exception{
    public String message(){
        return "ID harus berukurang 5 - 8 digit";
    }
}

