package exception;

public class JenisErrorException extends Exception{
    public String message(){
        return "Harus pilih mobil atau truk!";
    }
}

